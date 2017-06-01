package servlet;

import java.io.IOException; 
 import java.io.PrintWriter; 
 import java.util.Iterator; 
 import java.util.List; 

 
 import javax.servlet.ServletException; 
 import javax.servlet.annotation.WebServlet; 
 import javax.servlet.http.HttpServlet; 
 import javax.servlet.http.HttpServletRequest; 
 import javax.servlet.http.HttpServletResponse; 
 
 
 import org.omg.Messaging.SyncScopeHelper; 
 
 
 import model.Guitar; 
 import model.GuitarSpec; 
 import model.Inventory; 
 
 
 import com.DaoImpl.SqliteInventoryDaoImpl; 
 import com.Idao.InventoryIDao; 
 import com.sun.corba.se.spi.orbutil.fsm.Guard.Result; 
 
 
 import FactoryImpl.SqliteFactory; 
 import IFactory.IDaoFactory; 
 import model.Builder; 
 import model.Type; 
 import model.Wood; 




/** 
  * Servlet implementation class nihao 
  */ 
 @WebServlet("/SearchGuitar") 
 public class SearchGuitar extends HttpServlet { 
 	private static final long serialVersionUID = 1L; 
     /** 
      * @see HttpServlet#HttpServlet() 
      */ 
     public SearchGuitar() { 
         super(); 
         // TODO Auto-generated constructor stub 
     } 
 
 
 	/** 
 	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response) 
 	 */ 
 	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
 		// TODO Auto-generated method stub	 
 		 	 
 		String  builder=request.getParameter("builder"); 
 		String  model=request.getParameter("model"); 
 		String  type=request.getParameter("type"); 
 		String  numStrings=request.getParameter("numStrings"); 
 		String  topwood=request.getParameter("topwood"); 
 		String  backwood=request.getParameter("backwood"); 
 				 
			initializeInventory(); 
 		    
 		   GuitarSpec whatErinLikes =  
 		    		/*new GuitarSpec(Builder.RYAN, "02", Type.ELECTRIC, 6, Wood.ALDER, Wood.ALDER);*/ 
 		    		new GuitarSpec(Builder.valueOf(builder), model,  
 		       Type.valueOf(type), Integer.parseInt(numStrings), Wood.valueOf(backwood), Wood.valueOf(topwood)); 
 		   
 		    List matchingGuitars = Inventory.search(whatErinLikes); 
 		   
 		    PrintWriter out=response.getWriter(); 
 		  //  out.println(Builder.valueOf(builder)+numStrings+Type.valueOf(type)+Integer.parseInt(numStrings)+ Wood.valueOf(backwood)+ Wood.valueOf(topwood)); 
 			 
 		    if (!matchingGuitars.isEmpty()) { 
 		      System.out.println("Erin, you might like these guitars:"); 
 		      for (Iterator i = matchingGuitars.iterator(); i.hasNext(); ) { 
 		        Guitar guitar = (Guitar)i.next(); 
 		        GuitarSpec spec = guitar.getSpec(); 
 		        out.println("  We have a " + 
 		          spec.getBuilder() + " " + spec.getModel() + " " + 
 		          spec.getType() + " guitar:\n     " + 
 		          spec.getBackWood() + " back and sides,\n     " + 
 		          spec.getTopWood() + " top.\n  You can have it for only $" + 
 		          guitar.getPrice() + "!\n  -------------------------------------"); 
 		      } 
 		    } else { 
 		     out.println("Sorry, Erin, we have nothing for you."); 
 		    } 
 		  } 
 
 
 	/** 
 	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response) 
 	 */ 
 	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
 		// TODO Auto-generated method stub 
 	} 
 	 
 	 
 	private static void initializeInventory(){ 
 	
 		Inventory inventory=new Inventory(); 
 		 
 		//根据需要调换数据库 
 		IDaoFactory iDaoFactory=new  SqliteFactory(); 
 		//IDaoFactory iDaoFactory=new  MysqlFactory(); 
		 
 		 
 		 
 		//InventoryIDao inventorydao = new SqliteInventoryDaoImpl(); 
 		try { 
 			//get实例 
 			List<Guitar> reasult=iDaoFactory.GetInventoryInstance().loaddata(); 
 			Iterator<Guitar> iter = reasult.iterator() ; 
 			while(iter.hasNext()){ 
 				Guitar guitar = iter.next() ; 
 				inventory.addGuitar(guitar.getSerialNumber(), guitar.getPrice(), guitar.getSpec());	 
 			} 
 		} catch (Exception e) { 
 			// TODO Auto-generated catch block 
 			e.printStackTrace(); 
 		} 
 		 
 		 
 	}
 }
  
 
package servlet;

import java.io.IOException; 
 import java.io.PrintWriter; 
 
 
 import javax.servlet.ServletException; 
 import javax.servlet.annotation.WebServlet; 
 import javax.servlet.http.HttpServlet; 
 import javax.servlet.http.HttpServletRequest; 
 import javax.servlet.http.HttpServletResponse; 
 
 
 import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper; 
 
 
 import FactoryImpl.MysqlFactory;
import FactoryImpl.SqliteFactory;
import IFactory.IDaoFactory; 
 import model.Guitar; 
 
 
 /** 
  * Servlet implementation class AddGuitar 
  */ 
 @WebServlet("/AddGuitar") 
 public class AddGuitar extends HttpServlet { 
 	private static final long serialVersionUID = 1L; 
         
     /** 
      * @see HttpServlet#HttpServlet() 
      */ 
     public AddGuitar() { 
         super(); 
         // TODO Auto-generated constructor stub 
     } 
 
 
 	/** 
 	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response) 
 	 */ 
 	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
 		// TODO Auto-generated method stub 
 		//response.getWriter().append("Served at: ").append(request.getContextPath()); 
 
 		request.setCharacterEncoding("utf-8"); 
 		response.setContentType("utf-8"); 
 		//response.setCharacterEncoding("utf-8"); 
 		Double price=Double.parseDouble(request.getParameter("price")); 
 		String serialNumber=request.getParameter("serialNumber"); 
 		//String builder=request.getParameter("builder");
 		//String type=request.getParameter("type");
 		//String model=request.getParameter("model");
 		//String backwood=request.getParameter("backwood");
 		//String topwood=request.getParameter("topwood");
 		Guitar guitar=new Guitar(); 		 
 			guitar.setPrice(price);	 
 			guitar.setSerialNumber(serialNumber);	
 			//guitar.setBuilder(builder);
 			//guitar.setType(type);
 			//guitar.setModel(model);
 			//guitar.setBackwood(backwood);
 			//guitar.setTopwood(topwood);
 			
 			//根据需要调换数据库 
 			IDaoFactory iDaoFactory=new  SqliteFactory(); 
 			try { 
 				boolean a=iDaoFactory.GetGuitarInstance().addGuitar(guitar); 
 			System.out.println(a); 
 			} catch (Exception e) { 
 				// TODO Auto-generated catch block 
 				e.printStackTrace(); 
 			} 
 			 
 			/*PrintWriter out=response.getWriter(); 
 		 	out.println("success"); */
 	 
 	 
 	 
 	} 
 
 
 	/** 
 	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response) 
 	 */ 
 	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
 		// TODO Auto-generated method stub 
 		doGet(request, response); 
 	} 
 
 
 } 

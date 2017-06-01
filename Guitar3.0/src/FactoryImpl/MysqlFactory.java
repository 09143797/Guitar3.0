package FactoryImpl;

import com.DaoImpl.MysqlGuitarDaoImpl; 
 import com.DaoImpl.MysqlInventoryDaoImpl; 
 import com.Idao.GuitarIDao; 
 import com.Idao.InventoryIDao; 
 
 
 import IFactory.IDaoFactory; 
 
 
 public class MysqlFactory  implements IDaoFactory { 
 	 
 	@Override 
 	public GuitarIDao GetGuitarInstance() throws Exception { 
 		// TODO Auto-generated method stub 
 		return new MysqlGuitarDaoImpl(); 
 	} 
 	@Override 
 	public InventoryIDao GetInventoryInstance() throws Exception { 
 		// TODO Auto-generated method stub 
 		return new MysqlInventoryDaoImpl(); 
 	} 
 
 
 } 

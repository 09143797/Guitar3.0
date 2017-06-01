package FactoryImpl;

import com.DaoImpl.SqliteGuitarDaoImpl; 
 import com.DaoImpl.SqliteInventoryDaoImpl; 
 import com.Idao.GuitarIDao; 
 import com.Idao.InventoryIDao; 
 
 
 import IFactory.IDaoFactory; 
 import model.Guitar; 
 
 
 public class SqliteFactory implements IDaoFactory { 
 
 
 	@Override 
 	public GuitarIDao GetGuitarInstance() throws Exception { 
 		// TODO Auto-generated method stub 
 		return new SqliteGuitarDaoImpl(); 
 	} 
 
 
 	@Override 
 	public InventoryIDao GetInventoryInstance() throws Exception { 
 		// TODO Auto-generated method stub 
 		return new SqliteInventoryDaoImpl(); 
 	} 
 
 
 } 

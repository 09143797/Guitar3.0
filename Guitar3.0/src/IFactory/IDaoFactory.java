package IFactory;

import com.DaoImpl.SqliteGuitarDaoImpl; 
import com.DaoImpl.SqliteInventoryDaoImpl; 
 import com.Idao.GuitarIDao; 
 import com.Idao.InventoryIDao; 
 public interface IDaoFactory { 
 public  GuitarIDao GetGuitarInstance() throws Exception; 
 public  InventoryIDao GetInventoryInstance() throws Exception; 
 } 

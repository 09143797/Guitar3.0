package com.DaoImpl;

import java.sql.Connection; 
 import java.sql.PreparedStatement; 
 import java.sql.ResultSet; 
 

 import javax.swing.text.DefaultEditorKit.InsertBreakAction; 
 

 import com.Idao.GuitarIDao; 
 

 import model.Builder; 
 import model.Type; 
 import model.Wood; 
 import model.Guitar; 
 import model.GuitarSpec; 
 import model.Inventory; 
 import dbUtil.DataConnection; 
 public class SqliteGuitarDaoImpl   implements GuitarIDao{ 
 

 	@Override 
 	public boolean addGuitar(Guitar guitar) throws Exception { 
 		// TODO Auto-generated method stub 
 		boolean a=false; 
 		String sql = "insert into guitar (price,serialNumber) values (?,?) "; 
 		Connection conn=DataConnection.getConnection("sqlite"); 
 		PreparedStatement ptmt = conn.prepareStatement(sql); 
 		ptmt.setDouble(1, guitar.getPrice()); 
 		ptmt.setString(2, guitar.getSerialNumber()); 
 		if (ptmt.executeUpdate()>0) { 
 		a=true;	 
 		} 
 		ptmt.close(); 
 		return a;	 
 	} 
 

 	@Override 
 	public boolean updateGuitar(Guitar guitar) throws Exception { 
 		// TODO Auto-generated method stub 
 		boolean a=false; 
 		String sql = "update guitar set price=? and serialNumber=? where guitar_id=?"; 
 		Connection conn=DataConnection.getConnection("sqlite"); 
 		PreparedStatement ptmt = conn.prepareStatement(sql); 
 		ptmt.setDouble(1, guitar.getPrice()); 
 		ptmt.setString(2, guitar.getSerialNumber()); 
 		//ptmt.setInt(3, guitar.getId()); 
 		if (ptmt.executeUpdate()>0) { 
 		a=true;	 
 		} 
 		ptmt.close(); 
 		return a;	 
 	} 
 

 	@Override 
 	public boolean deleteGuitar(int id ) throws Exception { 
 		// TODO Auto-generated method stub 
 		boolean a=false; 
 		String sql = "delete from guitar where serialNumber=? "; 
 		Connection conn=DataConnection.getConnection("sqlite"); 
 		PreparedStatement ptmt = conn.prepareStatement(sql); 
 		ptmt.setInt(1,id ); 
 		if (ptmt.executeUpdate()>0) { 
 		a=true;	 
 		} 
 		ptmt.close(); 
 		return a;	 
 	} 
 	 
 } 


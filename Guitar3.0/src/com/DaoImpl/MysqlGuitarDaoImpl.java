package com.DaoImpl;

import com.Idao.GuitarIDao;

import java.sql.Connection; 
 import java.sql.PreparedStatement; 
 
 
 import com.Idao.GuitarIDao; 
 
 
 import model.Guitar; 
 import dbUtil.DataConnection; 
 
 
 public class MysqlGuitarDaoImpl implements GuitarIDao { 
 
 
 	@Override 
 	public boolean addGuitar(Guitar guitar) throws Exception { 
 		// TODO Auto-generated method stub 
 		boolean a=false; 
 		String sql = "insert into guitar (price,serialNumber) values (?,?) "; 
 		Connection conn=DataConnection.getConnection("mysql"); 
 		 
 		 
 		System.out.println(conn); 
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
 		Connection conn=DataConnection.getConnection("mysql"); 
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
 				String sql = "delete from guitar where id=? "; 
 				Connection conn=DataConnection.getConnection("mysql"); 
 				PreparedStatement ptmt = conn.prepareStatement(sql); 
 				ptmt.setInt(1,id ); 
 				if (ptmt.executeUpdate()>0) { 
 				a=true;	 
 				} 
 				ptmt.close(); 
 				return a;	 
 	} 
 
 
 } 


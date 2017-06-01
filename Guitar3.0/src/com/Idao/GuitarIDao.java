package com.Idao;

import model.Guitar; 
 public interface GuitarIDao { 
 	public boolean addGuitar(Guitar guitar) throws Exception; 
 	public boolean updateGuitar(Guitar guitar) throws Exception; 
 	public boolean deleteGuitar(int id) throws Exception; 
 } 

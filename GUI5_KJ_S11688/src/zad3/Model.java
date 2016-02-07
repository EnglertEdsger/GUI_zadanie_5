package zad3;

	import javax.swing.*;
	import javax.swing.table.*;
	import javax.swing.event.*;
	import java.io.*;
	import java.util.*;

	public class Model extends AbstractTableModel {
	   Vector dane;
	   Vector kolumnyNaz ;  
	   String pliki;
	  
	  public Model(String f){
	    pliki = f;
	    initVectors();  
	    }

	  public void initVectors() {
	    String aLine ;
	    dane = new Vector();
	    kolumnyNaz = new Vector();
	    try {
	      FileInputStream input =  new FileInputStream(pliki);
	      BufferedReader reading = new BufferedReader(new InputStreamReader(input));
	      StringTokenizer token = 
	         new StringTokenizer(reading.readLine(), "|");
	        while(token.hasMoreTokens())
	          kolumnyNaz.addElement(token.nextToken());
	      while ((aLine = reading.readLine()) != null) {  
	        StringTokenizer st2 = 
	         new StringTokenizer(aLine, "|");
	        while(st2.hasMoreTokens())
	          dane.addElement(st2.nextToken());
	        }
	      reading.close();  
	      }
	    catch (Exception e) {
	      e.printStackTrace();
	      }
	  }

	  public int getRowCount() {
	    return dane.size() / getColumnCount();
	    }

	  public int getColumnCount(){
	    return kolumnyNaz.size();
	    }

	  public String getColumnName(int columnIndex) {
	    String colName = "";

	    if (columnIndex <= getColumnCount())
	       colName = (String)kolumnyNaz.elementAt(columnIndex);

	    return colName;
	    }
	    
	  public Class getColumnClass(int columnIndex){
	    return String.class;
	    }
	    
	  public boolean isCellEditable(int rowIndex, int columnIndex) {
	    return false;
	    }
	    
	  public Object getValueAt(int rowIndex, int columnIndex) {
	    return (String)dane.elementAt
	        ( (rowIndex * getColumnCount()) + columnIndex);
	    }
	    
	  public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
	    return;
	    }
	}



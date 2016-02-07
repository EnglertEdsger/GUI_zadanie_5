package zad1;

import javax.swing.DefaultListModel;

//public class Stopnie<T> {
	
	public class Stopnie<T extends Number> extends DefaultListModel<Object>{

	 double konwersja(double c){
		return (9/5 * c) + 32 ;
		}
		
		public static void gen(){
	        boolean[][] grid = new boolean[10][10];
	        for(int r = 0; r < 10; r++)
	            for(int c = 0; c < 10; c++);
		}
	    
		public Object get(int index){
		@SuppressWarnings("unchecked")
		T t = (T)super.getElementAt(index);
		return konwersja(t.doubleValue());
		}


}

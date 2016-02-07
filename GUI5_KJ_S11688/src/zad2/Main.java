/**
 *
 *  @author Kaczyński Jakub S11688
 *
 */

package zad2;

import javax.swing.JFrame;

import com.sun.prism.paint.Color;

public class Main {
	public static void main(String[] args){
	  Lista1 okno = new Lista1();
	    okno.setSize(600,600);

	  okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      
      okno.pack();
	  okno.setVisible(true);
	  
  }
}
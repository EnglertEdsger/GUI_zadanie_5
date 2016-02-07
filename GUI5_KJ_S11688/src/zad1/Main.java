/**
 *
 *  @author Kaczyński Jakub S11688
 *
 */

package zad1;

import java.awt.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.*;
import javax.swing.event.ListSelectionListener;

public class Main {
	public static void main(String[] args) {
		Stopnie<Double> model = new Stopnie<Double>();

		
		
		final JList lista = new JList(model);
		lista.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				DefaultListModel model = (DefaultListModel) lista.getModel();
				JOptionPane.showMessageDialog(null, (model.get(e.getFirstIndex())) + " fahrenheit");
			}
		});
		
		model.addElement(0);
		model.addElement(100);
		model.addElement(10);
		model.addElement(20);
		model.addElement(30);
		model.addElement(40);
		model.addElement(50);
		model.addElement(60);

		JFrame nowyJframe = new JFrame();
		nowyJframe.add(lista, BorderLayout.CENTER);
		nowyJframe.setBounds(200, 400, 500, 500);
		nowyJframe.setVisible(true);

		nowyJframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		nowyJframe.pack();
	}
}
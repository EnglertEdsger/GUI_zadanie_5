package zad2;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;

import com.sun.prism.paint.Color;

import java.awt.*;



public class Lista1 extends javax.swing.JFrame {
	JList<String> lista;
	JPanel panel;
	DefaultListModel<String> lista1;
	JTextField tekst;

	public Lista1() {

		panel = new JPanel();
		panel.setLayout(new BorderLayout());
		getContentPane().add(panel);

		lista1 = new DefaultListModel<String>();

		lista = new JList<String>();
		lista.setModel(lista1);

		tekst = new JTextField();
		tekst.addKeyListener(new KeyAdapter() {

			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					lista1.addElement(tekst.getText());
					tekst.setText("");
				}
			}
		});
		panel.add(new JScrollPane(lista));
		panel.add(tekst, BorderLayout.PAGE_END);
	}

}

package zad3;

import javax.swing.JFrame;


import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Main extends JPanel {
  public Main(String dataFilePath) {
    JTable tabela;
    Model model;
    setLayout(new BorderLayout());

    model = new Model(dataFilePath);

    tabela = new JTable();
    tabela.setModel(model);
    tabela.createDefaultColumnsFromModel();

    JScrollPane scrollpane = new JScrollPane(tabela);
    add(scrollpane);
    }

 public Dimension getPreferredSize(){
    return new Dimension(400, 500);
    }
    
 public static void main(String s[]) {
    JFrame frame = new JFrame("Data File Table");
    Main panel;
        
    panel = new Main("dane.dat");

    frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    frame.getContentPane().add(panel,"Center");        
    frame.setSize(panel.getPreferredSize());
    frame.setVisible(true);
    frame.addWindowListener(new WindowCloser());
    }
 }

class WindowCloser extends WindowAdapter {
 public void windowClosing(WindowEvent e) {
   Window win = e.getWindow();
   win.setVisible(false);
   System.exit(0);
    }
}
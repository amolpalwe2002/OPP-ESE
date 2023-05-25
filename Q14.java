import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Q14{
   public static void main(String[] args) {
      JFrame f = new JFrame("Title");
      JTextField tf = new JTextField(20);
      f.add(tf);
      f.getContentPane().add(BorderLayout.NORTH,tf);
      JPanel p = new JPanel();
      JButton b1 = new JButton("1");
      JButton b2 = new JButton("2");
      JButton b3 = new JButton("3");
      JButton b4 = new JButton("4");
      JButton b5 = new JButton("5");
      JButton b6 = new JButton("6");
      JButton b7 = new JButton("7");
      JButton b8 = new JButton("8");
      JButton b9 = new JButton("9");
      JButton b10 = new JButton("0");


      p.add(b1);
      p.add(b2);
      p.add(b3);
      p.add(b4);
      p.add(b5);
      p.add(b6);
      p.add(b7);
      p.add(b8);
      p.add(b9);
      p.add(b10);

      p.setLayout(new GridLayout(4,4));
      f.getContentPane().add(BorderLayout.CENTER,p);
      f.add(p);

      

      f.setLayout(new FlowLayout());

      f.setVisible(true);
      f.setSize(420,420);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}
import javax.swing.*;
import java.awt.*;

public class GUI_01 extends JFrame {
  public GUI_01 () {
    this ("one");
  } // end no parameter constructor

  public GUI_01 (String t) {
    setTitle (t);
    setSize (200,200);
    setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo (null);
    add (new JButton ("North " + t), BorderLayout.NORTH);
    add (new JButton ("East " + t), BorderLayout.EAST);
    add (new JButton ("West " + t), BorderLayout.WEST);
   
//     validate ();
    pack ();
    setVisible (true);
  } // end String constructor

  public static void main (String args []) {
    GUI_01 ga = new GUI_01 ();
    GUI_01 gb = new GUI_01 ("two");
  } // end main

} // end class GUI_01
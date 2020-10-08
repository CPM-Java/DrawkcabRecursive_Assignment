/**
 * DrawkcabMain is the starting point for execution.
 * DO NOT MODIFY
 * 
 * @author GrayKnight CPNM
 * @version Ch 9, 11/04/03
 */

 import javax.swing.JFrame;

public class DrawkcabMain
{

	public static void main(String[] sgrA)
	{
	    JFrame frame = new JFrame("Recursive Word Flipper");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.getContentPane().add(new DrawkcabGUI());
	    frame.pack();
	    frame.setVisible(true);
	}

}

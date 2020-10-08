
/**DO NOT MODIFY
 * User enters a string and the program
 * reverses its spelling.
 * 
 * @author GrayKnight CPM
 * @version Chapter 9,  11/04/03, 2/2/11, 3/15/18
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DrawkcabGUI extends JPanel
{
    // GUI objects
    private JTextField nameIn;
    private JButton clear, analyze;
    private JPanel buttonPanel;
    private JLabel label;
    
    /**
     * Constructor for objects of class palindromeGUI
     */
    public DrawkcabGUI()
    {
        setLayout(new BorderLayout());
                
        nameIn = new JTextField("Enter the word or phrase you want to flip here.");
        analyze = new JButton("Flip Word");
        clear = new JButton("Clear");
        label = new JLabel("");
    
        ButtonListener Listener = new ButtonListener();
        analyze.addActionListener(Listener);
        clear.addActionListener(Listener);
        
        buttonPanel = new JPanel();
        buttonPanel.add(analyze);
        buttonPanel.add(clear);
        
        add(nameIn, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
        add(label, BorderLayout.SOUTH);
        
        setPreferredSize(new Dimension(300, 100));
    }


    /**
     * Listener Method.
     * 
     * @param  JButton
     */
    private class ButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            if (event.getSource() == analyze && !nameIn.getText().equals(""))
            {
                String forwardName = nameIn.getText();
                nameIn.setText(StringFlipper.recursiveFlip(forwardName));
                label.setText("Word or phrase is flipped");
            }
            else //clear button was pushed
            {
                nameIn.setText("");
                label.setText("Enter a word or phrase above.");
            }
        }
           
    }//end of ButtonListener() class
}//end of PalindromeGUI class

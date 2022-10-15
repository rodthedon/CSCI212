package project1;

import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.TextArea;
import java.awt.GridLayout;
import java.awt.*;
import javax.swing.JFrame;
   
   

public class VowelGUI extends JFrame{

   public static JFrame myFrame;
   public static TextArea JStringTextFile;
   public static TextArea JVowelsCounter;
   // The initialization process of getting everything to work for the JFrame and how we'd want it to look
   public static void initialization() {
      myFrame = new JFrame();
      myFrame.setVisible(true);
      myFrame.setSize(600,600);
      myFrame.setLocation(200,200);
      myFrame.setTitle("Project 1 ");
      myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      myFrame.setLayout(new GridLayout(1,2));
   }

   public static void textArea(String textInput, String VowelCounter) {
      // These are basically the results we've determined in the main function in the Project1.java into a text area. 
      JStringTextFile = new TextArea(textInput);
      JVowelsCounter = new TextArea(VowelCounter);
      // This is setting the properties of how the text area should look.
      JStringTextFile.setPreferredSize(new Dimension(400,400));
      JVowelsCounter.setPreferredSize(new Dimension(400,400));
      // This is where the text area will go with the text string going on the left and the vowel counter going to the right. 
      myFrame.add(JStringTextFile, BorderLayout.WEST);
      myFrame.add(JVowelsCounter, BorderLayout.EAST);
   }

}

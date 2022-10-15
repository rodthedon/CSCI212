// Sebastian Mejia Lab Section: CSCI212-11C

package project0;

import javax.swing.*;

public class progect0program {
   public static void main(String[] args) {
      String sentenceInput;
      
      sentenceInput = JOptionPane.showInputDialog(null,"Please enter a sentence.");
      if(sentenceInput.equalsIgnoreCase("stop")) {
         System.exit(0);
      }
      

      
      JOptionPane.showMessageDialog(null, "Number of lower case e's: " + checke(sentenceInput) + "\nNumber of upper case E's: " + checkE(sentenceInput) );
      
   }
   public static int checkE(String input) {
      
      int counterE = 0;
      
      for(int i = 0; i < input.length();i++) {
      if(input.charAt(i)=='E') 
             counterE += 1;
         
      }
      return counterE;
   }
   public static int checke(String input2) {
      int countere = 0;
      for(int i = 0; i< input2.length();i++) {
         if(input2.charAt(i)=='e')
            countere += 1;
      }
      return countere;
   }
   
}
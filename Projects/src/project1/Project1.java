package project1;

/**
 * Sebastian Mejia CSCI 212-11 
 * 
 */
import javax.swing.JFrame;

public class Project1 {
   
   // temp holder for the reading input for the file
   public static String line;
   
   
   public static String textInput = "";
   public static String VowelCounter = "";
   // Basically puts the counter values for when the for loop is going to run. 
   public static int numA = 0, numE = 0, numI = 0, numO = 0, numU = 0;
   
   public static void main(String[] args) {
      
      // This is just setting up the JFrame so that I could then set some of the values we get from this main program into it.
      VowelGUI.initialization();
      
      // Adding the textInput variable to the method readInput
      textInput = readInput(args[0]);
      // Adding the VowelCounter variable to the method vowelCounter
      VowelCounter = vowelCounter(textInput);
      
      VowelGUI.textArea(textInput, VowelCounter);
      
      }

 
   public static String readInput(String file) {
      String s = "";
      // Basically this is the text input file method that was used.
      TextFileInput in = new TextFileInput(file);
      line = in.readLine();
      while(line != null) {
         // Moving the content from the s string from the line variable that read the file so that it can be returned into the textInput string variable.
         s += line;
         line = in.readLine();
      }
      return s;
   }
   
   // This is the vowel counter where it just runs a for loop from the textInput variable while taking the lower and upper case vowels into account.
   public static String vowelCounter(String line) {
      for(int i = 0; i < line.length(); i++){
            if(line.charAt(i) == 'A' || line.charAt(i) == 'a')
               numA++;
               // These are the counters as seen previously to then later be printed out.
            if(line.charAt(i) =='E' || line.charAt(i) == 'e')
               numE++;
               
            if(line.charAt(i) == 'I' || line.charAt(i) == 'i')
               numI++;
               
            if(line.charAt(i) == 'O' || line.charAt(i) == 'o')
               numO++;
               
            if(line.charAt(i) == 'U' || line.charAt(i) == 'u')
               numU++;
               
            }
      // We will keep the output of all the counters in the vowel counter variable here to put onto the GUI.
      VowelCounter = "Num of A's: " + numA + "\n" + "Num of E's: " + numE + "\n" + "Num of I's: " + numI + "\n" + "Num of O's " + numO + "\n" + "Num U's: " + numU + "\n";;
      
      return VowelCounter;
   }
   
   }


import java.io.PrintStream;
import java.util.Scanner;

public class LabExperiment6 {

    public static void main(String[]args) {
		 
    	Scanner scn=new Scanner(System.in);
    	
    	LabExperiment6 obj=new 	LabExperiment6();
        String data = "This is a text inside the file.";

    	 try {
             PrintStream output = new PrintStream("output.txt");

             output.print(data);
             output.close();
         }
         catch(Throwable e) {
           //  e.getStackTrace();
        	 obj.leetSpeak(scn,e);
         }
    	
    	

    }	
    
    
    
    public static void ChangeChar(Scanner input, PrintStream output) {
		    while (input.hasNextLine()) {
		        String line = input.nextLine();
		        Scanner console = new Scanner(line);
		        
		        while (console.hasNext()) {
		            String word = console.next();
		            if (word.contains("O")) {
		                word = word.replace("O", "0");
		            }
		            if (word.contains("l")) {
		                word = word.replace("l", "1");
		            }
		            if (word.contains("E")) {    
		                word = word.replace("E", "6");
		            }
		            if (word.contains("A")) {    
		                word = word.replace("A", "4");
		            }
		            if (word.contains("T")) {    
		                word = word.replace("T", "7");
		            }
		            if (word.charAt(word.length()-1) == 's') {
		                word = word.replace(word.substring(word.length()-1),"5");
		            }
		            output.print("(" + word + ")" + " ");
		        }
		        
		       output.println();
		    }
		}
	

}

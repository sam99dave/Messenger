/* messages can be sent here after scanning
   or messages can be scanned and stored using this
 */

import java.io.*;
import java.util.*;
public class Test3 /* implements Runnable*/{
    String group_name;
    Test3(Sring group_name, /* Message if to be stored only */){
        this.group_name = group_name;
    }
    public static void main(String [] args) /* public void run if using Runnable*/{
        Scanner sc = new Scanner(System.in);
        // The name of the file to open.
        String fileName = group_name + ".txt";

        try {
            // Assume default encoding.
            if(// groupList doesnt contain group_name)  // This will create new file named group_name.txt
            {
            FileWriter fileWriter =
                    new FileWriter(fileName);
            }
            // Always wrap FileWriter in BufferedWriter.
            BufferedWriter bufferedWriter =
                    new BufferedWriter(fileWriter);

            // Note that write() does not automatically
            // append a newline character.
            String s = "" ;
            StringBuilder input = new StringBuilder(s);

            while(input.toString() != "Stop"){
                input = input.replace(0, input.length(), sc.nextLine());
                if(input.toString().equals("Stop")){
                    break;
                }
                bufferedWriter.write(input.toString());
                bufferedWriter.newLine();
            }

            // Always close files.
            bufferedWriter.close();
        }
        catch(IOException ex) {
            System.out.println(
                    "Error writing to file '"
                            + fileName + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }
    }
}
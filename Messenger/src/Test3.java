import java.io.*;
import java.util.*;
public class Test3 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        // The name of the file to open.
        String fileName = "lol.txt";

        try {
            // Assume default encoding.

            FileWriter fileWriter =
                    new FileWriter(fileName);

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
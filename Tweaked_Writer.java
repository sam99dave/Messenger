/* messages can be sent here after scanning
   or messages can be scanned and stored using this
 */

import java.io.*;
import java.util.*;

public class Writer implements Runnable{
    Group group;
    FileWriter fileWriter;
    Member current_user;
    static volatile boolean finished = false;
    Writer(Group group, Member current_user){
        this.group = group;

        this.current_user = current_user;
    }
    /*public static void main(String [] args)*/  public void run() {
        Scanner sc = new Scanner(System.in);
        int flag = 0;
        // The name of the file to open.
        String fileName = group.Name + ".txt";

        try {
            // Assume default encoding.
            /*if()  // This will create new file named group_name.txt
            {
            FileWriter fileWriter =
                    new FileWriter(fileName);
            }*/
            // Always wrap FileWriter in BufferedWriter.
            BufferedWriter bufferedWriter =
                    new BufferedWriter(group.fileWriter);

            // Note that write() does not automatically
            // append a newline character.
            String s = "" ;
            StringBuilder input = new StringBuilder(s);

            while(input.toString() != "Stop"){
                    input = input.replace(0, input.length(), sc.nextLine());
                if(input.toString().equals("Stop")){
                    flag = 1;
                    break;
                }
                /*else if(input.toString().equals(group.Owner.Name + " " + "remove " + current_user.Name)){
                    bufferedWriter.write(current_user.Name + " has been removed");
                    bufferedWriter.newLine();
                    flag = 1;
                    break;
                }*/
                else {
                    bufferedWriter.write(current_user.Name + ": " + input.toString());
                    bufferedWriter.newLine();
                }
            }
            if(flag == 1) {
                bufferedWriter.write(current_user.Name + " left the lobby");
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

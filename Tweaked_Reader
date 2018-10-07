import java.io.*;
import java.util.*;

public class Reader implements Runnable{
    Group group;
    Member current_user;
    Reader(Group group, Member current_user){
        this.group = group;
        this.current_user = current_user;
    }
      public void run() {

        /* The name of the file to open. */
        String fileName = group.Name + ".txt";

        // This will reference one line at a time
        String line = null; // Earlier initialzed to null

        try {

            // FileReader reads text files in the default encoding.
            FileReader fileReader = new FileReader("C:\\Users\\samuel\\IdeaProjects\\Messenger\\Messenger\\Messenger\\src\\" + fileName);
            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader;
            bufferedReader = new BufferedReader(fileReader);
            // The first while reads the data at launch
            Thread.sleep(10000);
            while((line = bufferedReader.readLine()) != "") {
                /*if(line.equals(group.Owner.Name+ ":" + " remove " + current_user.Name)){
                    break; // current_user is removed
                }*/
                System.out.println(line);
                Thread.sleep(10000);
            }
            // This while reads the messages after initial reading of data
            // So that the current_user doesnt encounter his messages twice
            Thread.sleep(10000);
            while(!((line = bufferedReader.readLine()).equals(current_user.Name + " has been removed") || (line = bufferedReader.readLine()).equals(current_user.Name + " left the lobby"))){
                System.out.println(line);
                Thread.sleep(10000);
            }

            // Always close files.
            bufferedReader.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                    "Unable to open file '" +
                            fileName + "'");
        }
        catch(IOException ex) {
            System.out.println(
                    "Error reading file '"
                            + fileName + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }
        catch(Exception e){
            System.out.println("Interrupted");
        }
    }
}

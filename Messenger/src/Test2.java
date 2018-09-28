import java.io.*;
import java.util.*;

public class Test2 implements Runnable{
    Group group;
    Member current_user;
    Test2(Group group, Member current_user){
        this.group = group;
        this.current_user = current_user;
    }
    /*public static void main(String [] args)*/  public void run {

        // The name of the file to open.
        String fileName = group.Name + ".txt";

        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader =
                    new BufferedReader(fileReader);
            // The first while reads the data at launch
            while((line = bufferedReader.readLine()) != null) {
                if(line.equals(group.Owner.Name + " remove " + current_user.Name)){
                    break; // current_user is removed
                }
                System.out.println(line);
            }
            // This while reads the messages after initial reading of data
            // So that the current_user doesnt encounter his messages twice
            while(!((line = bufferedReader.readLine()).equals(current_user.Name + " has been removed") || (line = bufferedReader.readLine()).equals(current_user.Name + " left the lobby"))){
                System.out.println(line);
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
    }
}
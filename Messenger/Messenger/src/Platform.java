import java.util.Vector;

public class Platform {

    Vector<Group> GroupList = new Vector<>();

    void addGroup(String Name, Member Owner, String password){
        GroupList.add(new Group(Name, Owner, password));
    }

    void showCommands() {
        System.out.println("Command :\n0. Create Group");
        System.out.println(           "   Enter Group :\n");
        if (this.GroupList.size() == 0) System.out.println("\tNo Groups Created, Create Groups First !!!\n");
        else for (int i=0; i<this.GroupList.size(); i++)
            System.out.println("\t" + (i + 1) + ". " + this.GroupList.get(i).Name);
    }


}

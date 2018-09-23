import java.util.Vector;

public class DataBase {

    class Touple{
        String username;
        String password;

        Touple (String username, String password){
            this.username = username;
            this.password = password;
        }
    }
    class Register {

        Member member;
        Touple touple;

        Register (String username, String password, Member member){
            this.member = member;
            this.touple = new Touple (username, password);
        }
    }

    private Vector <Register> ClientList;

    DataBase(){
        ClientList = new Vector<>();
    }

    Member getMember (String username, String password){
        Touple entry = new Touple (username, password);
        for (int i=0; i<this.ClientList.size(); i++){
            if (entry.equals(this.ClientList.get(i).touple)){
                return this.ClientList.get(i).member;
            }
        }
        return null;
    }

    void newClient (String username, String password, Member newMember){
        ClientList.add(new Register(username, password, newMember));
    }
}

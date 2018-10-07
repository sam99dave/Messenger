import java.util.Vector;

public class DataBase {
    class Register {

        String username, password;
        Member member;

        Register (String username, String password, Member member){
            this.member = member;
            this.username = username;
            this.password = password;

        }
    }

    private Vector <Register> ClientList = new Vector<>();

    Member getMember (String username, String password){
        for (Register Entry : this.ClientList)
            if (Entry.username.equals(username) && Entry.password.equals(password)) {
                Member member = Entry.member;
                return member;
            }
        return null;
    }

    void newClient (String username, String password, Member newMember){
        Register x = new Register(username, password, newMember);
        System.out.println(ClientList.size());
        ClientList.add(x);
    }
}

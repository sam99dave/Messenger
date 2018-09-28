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

    private Vector <Register> ClientList;

    Member getMember (String username, String password){
        for (Register Entry : this.ClientList) {
            if (Entry.username.equals(username) && Entry.password.equals(password)) {
                return Entry.member;
            }
        }
        return null;
    }

    void newClient (String username, String password, Member newMember){
        ClientList.add(new Register(username, password, newMember));
    }
}

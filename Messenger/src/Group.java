import java.util.Vector;

public class Group {

    public String Name;
    private String Password;
    public Vector<Message> MessageList;
    private Vector <NonAdmin> MemberList;
    private Admin Owner;

    Group (String Name, Admin Owner, String Password) {
        this.Name = Name;
        this.Password = Password;
        this.Owner = Owner;
        this.MemberList = new Vector<>();
        this.MessageList = new Vector<>();
    }


    void addMember(Member NewMember) {
        this.MemberList.add((NonAdmin) NewMember);
    }

    void removeMember(Member OldMember){
        for (int i=0; i<this.MemberList.size(); i++){
            if (MemberList.get(i).equals(OldMember)) {
                MemberList.remove(i);
                break;
            }
        }
    }

    void putMessage (Message message){
        this.MessageList.add(message);
    }

}
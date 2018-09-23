import java.util.Vector;

public class Group {
    private static int count = 0;

    private String Name;
    public Vector<Message> MessageList;
    private Vector <Member> MemberList;
    private Member Owner;


    Group (String Name, Member Owner) {
        this.Name = Name;
        this.Owner = Owner;
        this.MemberList = new Vector<>();
        this.MessageList = new Vector<>();
        Group.count += 1;
    }


    void addMember(Member NewMember) {
        this.MemberList.add(NewMember);
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
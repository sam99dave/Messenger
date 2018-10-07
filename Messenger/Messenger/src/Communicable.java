import java.util.Vector;

public interface Communicable {
    void sendMessage(Message message, Group group);
    Vector<Message> readMessage(Group group);
    void enterGroup(Group group);
    void exitGroup(Group group);
}

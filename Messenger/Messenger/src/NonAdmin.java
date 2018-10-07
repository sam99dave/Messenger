import java.util.Calendar;
import java.util.Scanner;
import java.util.Vector;

public class NonAdmin extends Member implements  Communicable {
    @Override
    public void sendMessage(Message message, Group group) {

        Scanner console = new Scanner(System.in);
        System.out.println(this.Name + " : ");
        String data = console.nextLine();
        String time = (Calendar.DAY_OF_MONTH + " " + Calendar.MONTH + " " + Calendar.HOUR_OF_DAY + ":" + Calendar.MINUTE + ":" + Calendar.SECOND);
        Message NewMessage = new Message (this, time, data);

        group.putMessage(NewMessage);
    }

    @Override
    public Vector<Message> readMessage(Group group) {
        return group.MessageList;
    }

    @Override
    public void enterGroup(Group group) {
        group.addMember(this);
    }

    @Override
    public void exitGroup(Group group) {
        group.removeMember(this);
    }
}

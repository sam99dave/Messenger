public class Message {
    public Member sender;
    public String time;
    public String data;

    Message(Member sender, String time, String data){
        this.sender = sender;
        this.time = time;
        this.data = data;
    }

    public String getMessage () {
        return (sender + time + data);
    }
}

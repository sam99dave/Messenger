//import java.net.InetSocketAddress;

abstract class Member implements Communicable {
    private static long RND = 3579;
    long IDENTITY;
    String Name;
    // InetSocketAddress IP;

    private static long generateID () {
        long newRND = Member.RND;
        for (int i=0; i<13; i++){
            newRND = (newRND*63)%10000;
        }
        return newRND;
    }

    @Deprecated
    Member (){}

    Member (String Name){
        this.IDENTITY = generateID();
        this.Name = Name;
        // this.IP = IP;
    }

}
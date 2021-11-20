//Single level of abstraction principle
public class Slap{
    public static void main(String[] args) {
        
        getDetailsAndMail();
    }
    public static void getDetailsAndMail(){

        System.out.println("getting Details fron Database");
        String details = "Details";
        emailTheUser(details);
    }
    private static void emailTheUser(String details) {

        System.out.println("Sending the mail with " + details);
    }
}
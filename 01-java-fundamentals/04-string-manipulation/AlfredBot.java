public class AlfredBot {
    public static void main(String[]args)
    {
    AlfredResponse resp= new AlfredResponse();
    String botGreet = resp.basicGreeting();
    String dateAnnounce = resp.announceDate();
    String tellBot1=resp.Conversation("Hey is Alexis there?");
    String tellBot2=resp.Conversation("Hey is Alfred there?");
    String tellBot3=resp.Conversation("Is anyone there?");
    String greetPerson = resp.greetPerson("Karlo EMil", "07-8-2021");

    System.out.println(botGreet);
    System.out.println(dateAnnounce);
    System.out.println(tellBot1);
    System.out.println(tellBot2);
    System.out.println(tellBot3);
    System.out.println(greetPerson);
    }
    

}

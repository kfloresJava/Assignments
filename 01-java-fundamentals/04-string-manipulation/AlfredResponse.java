import java.util.Date;

public class AlfredResponse {
    public String basicGreeting()
    {
        return "Good day to whomever it may concern";
    }
    public String greetPerson(String personName, String dayString)
    {
        return String.format("Good day %s isn't it a nice day this %s", personName,dayString);
    }
    public String announceDate()
    {
  
        Date currdate= new Date();
        return String.format("What a wonderful day today, today is %s", currdate);
    }
    public String Conversation(String text)
    {
        String wordValue="";
        if(text.contains("Alexis"))
        {
            wordValue="Right away, sir. She certainly isn't sophisticated enough for that.";
        }
        else if(text.contains("Alfred"))
        {
            wordValue="At your service. As you wish, naturally.";
        }
        else if(text.contains("Alexis")==false && text.contains("Alexis")==false)
        {
            wordValue="Right. And with that I shall retire.";
        }
        return wordValue;
    }
}

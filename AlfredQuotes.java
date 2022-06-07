import java.util.Date; 

public class AlfredQuotes {

    public String basicGreeting() {
        return "Hello, lovely to see you.  How are you?"; 
    }

    public String guestGreeting(String guestName) {
        
        String greetingPart1 = "Hello, "; 
        String greetingPart2 = ".  Lovely to see you."; 
        String fullMonty = greetingPart1.concat(guestName).concat(greetingPart2);  
        return fullMonty; 
    }

    public String guestGreeting(String guestName, String guestName2) {
        
        String greetingPart1 = "Hello, ";
        String greetingPart1a = " and "; 
        String greetingPart2 = ".  Lovely to see you both."; 
        String fullMonty = greetingPart1.concat(guestName).concat(greetingPart1a).concat(guestName2).concat(greetingPart2);  
        return fullMonty; 
    }

    public String dateAnnouncement() {
        String greetingPart1 = "Hello.  It is currently "; 
        Date currentDate = new Date(); 
        // String currentDateTexty = (string) currentDate;
        // String fullMonty = greetingPart1.concat(currentDateTexty); 
        return greetingPart1 + currentDate; 
    }

    public String respondBeforeAlexis(String conversation) {
       int AlexisCalled = conversation.indexOf("Alexis"); 
       int AlfredCalled = conversation.indexOf("Alfred");

        if (AlexisCalled > -1)  {
            return "I'll do that now, sir. Alexis isn't sophisticated enough for that.";  
        }

        else if (AlfredCalled > -1) {
            return "At your service. As you wish, naturally."; 
        }

        else {
            return "Right. And with that I shall retire.";  
        }

    }

}
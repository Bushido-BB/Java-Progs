public class Test {  
  
    public static void main(String[] args) {  
        String[] recipients = new String[]{"Sending Email"};  
        String[] bccRecipients = new String[]{"sending Email"};  
        String subject = "Hi this is test Mail";  
        String messageBody = "Test Mail from gujglkb jmhkbjm";  
  
        new SendEmail().sendMail(recipients, bccRecipients, subject, messageBody);  
  
    }  
}  

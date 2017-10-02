package is.ru.honn.rumdb.mail;

public class MailServerStub implements MailGateway
{
    @Override
    public void sendMessage(String to, String from, String subject, String body)
    {
        System.out.println(
            "To: " + to + "\n" +
            "From: " + from + "\n" +
            "Subject: " + subject + "\n" +
            "\t" + body
        );
    }
}

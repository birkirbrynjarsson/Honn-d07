package is.ru.honn.rumdb.mail;

public interface MailGateway
{
    public void sendMessage(String to, String from, String subject, String body);
}

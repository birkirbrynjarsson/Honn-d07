package is.ru.honn.rumdb.service;

import is.ru.honn.rumdb.mail.MailGateway;

public class ApplicationService
{
    private MailGateway mailGateway;

    public MailGateway getMailGateway()
    {
        return mailGateway;
    }

    public void setMailGateway(MailGateway mailGateway)
    {
        this.mailGateway = mailGateway;
    }

    public void sendMail(String to, String from, String subject, String body){
        mailGateway.sendMessage(to, from, subject, body);
    }
}

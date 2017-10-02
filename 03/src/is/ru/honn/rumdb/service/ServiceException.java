package is.ru.honn.rumdb.service;

public class ServiceException extends Exception
{
    public ServiceException()
    {
        super();
    }

    public ServiceException(String s)
    {
        super(s);
    }

    public ServiceException(String s, Throwable throwable)
    {
        super(s, throwable);
    }
}

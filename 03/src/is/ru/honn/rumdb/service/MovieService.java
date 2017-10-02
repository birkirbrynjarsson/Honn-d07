package is.ru.honn.rumdb.service;

import is.ru.honn.rumdb.data.MovieDataGateway;
import is.ru.honn.rumdb.domain.Movie;
import is.ru.honn.rumdb.mail.MailGateway;

import java.util.List;

public class MovieService extends ApplicationService
{
    private MovieDataGateway movieDataGateway;

    public void addMovie(Movie movie) throws ServiceException
    {
        movie.initialize();
        if(!movie.validate()){
            throw new ServiceException("Movie does not validate");
        }
        movieDataGateway.addMovie(movie);
        sendMail("User", "System", "New movie", "This is an automated message from the system notifying you that a new movie has succesfully been added");
    }

    public List<Movie> getMovies()
    {
        return movieDataGateway.getMovies();
    }

    public void setMovieDataGateway(MovieDataGateway movieDataGateway)
    {
        this.movieDataGateway = movieDataGateway;
    }
}

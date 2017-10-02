package is.ru.honn.rumdb.test;

import is.ru.honn.rumdb.data.MovieDataGatewayStub;
import is.ru.honn.rumdb.domain.Movie;
import is.ru.honn.rumdb.mail.MailServerStub;
import is.ru.honn.rumdb.service.MovieService;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class TestSimple
{
    public static void main(String[] args){
        new TestSimple();
    }

    public TestSimple(){
        // v3 Test
        MovieService movieService = new MovieService();
        movieService.setMovieDataGateway(new MovieDataGatewayStub());
        movieService.setMailGateway(new MailServerStub());

        movieService.addMovie(new Movie(1, "Movie 1", "http1", "", new Date(), ""));
        movieService.addMovie(new Movie(1, "Movie 2", "http2", "", new Date(), ""));
        movieService.addMovie(new Movie(1, "Movie 3", "http3", "", new Date(), ""));
        movieService.addMovie(new Movie(1, "Movie 4", "http4", "", new Date(), ""));

        List<Movie> list = movieService.getMovies();
        for(Movie m : list){
            System.out.println(m);
        }
    }
}

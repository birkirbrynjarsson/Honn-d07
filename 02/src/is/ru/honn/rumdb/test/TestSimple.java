package is.ru.honn.rumdb.test;

import is.ru.honn.rumdb.data.MovieDataGatewayStub;
import is.ru.honn.rumdb.domain.Movie;
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
        // v1 Test
        Movie movie = new Movie(
                1,
                "Skyfall",
                "http://www.skyfall-movie.com/site",
                "Bond's loyalty to M is tested as her past comes back to haunt her.",
                new GregorianCalendar(2012, Calendar.OCTOBER, 26).getTime(),
                "Sam Mendes"
        );
        movie.view();
        movie.rate(8);
        System.out.println(movie);

        // v2 Test
        MovieService movieService = new MovieService();
        movieService.setMovieDataGateway(new MovieDataGatewayStub());

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

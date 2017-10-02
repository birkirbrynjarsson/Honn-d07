package is.ru.honn.rumdb.service;

import is.ru.honn.rumdb.data.MovieDataGateway;
import is.ru.honn.rumdb.domain.Movie;

import java.util.List;

public class MovieService
{
    private MovieDataGateway movieDataGateway;
    public void addMovie(Movie movie){
        movie.initialize();
        movieDataGateway.addMovie(movie);
    }

    public List<Movie> getMovies(){
        return movieDataGateway.getMovies();
    }

    public void setMovieDataGateway(MovieDataGateway movieDataGateway){
        this.movieDataGateway = movieDataGateway;
    }
}

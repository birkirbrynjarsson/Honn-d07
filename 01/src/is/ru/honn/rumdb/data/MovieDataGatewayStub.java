package is.ru.honn.rumdb.data;

import is.ru.honn.rumdb.domain.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieDataGatewayStub implements MovieDataGateway
{
    private List<Movie> movies;

    public MovieDataGatewayStub(){
        movies = new ArrayList<Movie>();
    }

    @Override
    public void addMovie(Movie movie)
    {
        movie.initialize();
        movies.add(movie);
    }

    @Override
    public List<Movie> getMovies()
    {
        return movies;
    }
}

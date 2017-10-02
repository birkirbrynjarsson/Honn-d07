package is.ru.honn.rumdb.data;

import is.ru.honn.rumdb.domain.Movie;

import java.util.List;

public interface MovieDataGateway
{
    public void addMovie(Movie movie);
    public List<Movie> getMovies();
}

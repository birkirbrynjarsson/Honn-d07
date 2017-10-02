package is.ru.honn.rumdb.domain;

public class DefaultMovieValidator implements Validator
{
    private Movie movie;

    public DefaultMovieValidator(Movie movie){
        this.movie = movie;
    }
    @Override
    public boolean validate()
    {
        if(movie.getTitle() == null || movie.getTitle().isEmpty() || movie.getLink() == null || movie.getLink().isEmpty()){
            return false;
        }
        return true;
    }
}

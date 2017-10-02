package is.ru.honn.rumdb.domain;

import java.util.Date;

public class Movie implements Comparable<Movie>
{
    private int id;
    private String title;
    private String link;
    private String description;
    private Date release;
    private String director;
    private Rating rating;

    public Movie()
    {
        this.rating = new Rating();
    }

    public Movie(int id, String title, String link, String description, Date release, String director)
    {
        this.id = id;
        this.title = title;
        this.link = link;
        this.description = description;
        this.release = release;
        this.director = director;
        this.rating = new Rating();
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getLink()
    {
        return link;
    }

    public void setLink(String link)
    {
        this.link = link;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public Date getRelease()
    {
        return release;
    }

    public void setRelease(Date release)
    {
        this.release = release;
    }

    public String getDirector()
    {
        return director;
    }

    public void setDirector(String director)
    {
        this.director = director;
    }

    public Rating getRating()
    {
        return rating;
    }

    public void setRating(Rating rating)
    {
        this.rating = rating;
    }

    @Override
    public String toString()
    {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", link='" + link + '\'' +
                ", description='" + description + '\'' +
                ", release=" + release +
                ", director='" + director + '\'' +
                ", rating=" + rating +
                '}';
    }

    @Override
    public int compareTo(Movie o)
    {
        if (this.id > o.id)
            return 1;
        else if (this.id < o.id)
            return -1;
        else return 0;
    }

    public void initialize(){
        release = new Date();
        rating.reset();
    }

    public void view(){
        this.rating.incrementView();
    }

    public void rate(int rating){
        this.rating.incrementRating(rating);
    }

    public float getAverageRate(){
        return this.rating.getAverageRating();
    }
}

package is.ru.honn.rumdb.domain;

public class Rating
{
    private int views;      // Number of requests
    private int rates;      // Number of rates
    private int ratings;    // Combined values of ratings

    public Rating()
    {
        this.views = 0;
        this.rates = 0;
        this.ratings = 0;
    }

    public Rating(int views, int rates, int ratings)
    {
        this.views = views;
        this.rates = rates;
        this.ratings = ratings;
    }

    public int getViews()
    {
        return views;
    }

    public void setViews(int views)
    {
        this.views = views;
    }

    public int getRates()
    {
        return rates;
    }

    public void setRates(int rates)
    {
        this.rates = rates;
    }

    public int getRatings()
    {
        return ratings;
    }

    public void reset()
    {
        this.views = 0;
        this.rates = 0;
        this.ratings = 0;
    }

    public void setRatings(int ratings)
    {
        this.ratings = ratings;
    }

    public void incrementView()
    {
        this.views += 1;
    }

    public void incrementRating(int rating)
    {
        this.rates += 1;
        this.ratings += rating;
    }

    public float getAverageRating()
    {
//        this.views += 1;    // Not sure if this is supposed to increment
        return (float) this.ratings / this.rates;
    }

    @Override
    public String toString()
    {
        return "Rating{" +
                "views=" + views +
                ", rates=" + rates +
                ", ratings=" + ratings +
                '}';
    }
}

package refactoring.chapter1.refactored;

public class Movie {

    private String title;
    private MovieType movieType;

    public Movie(String title, MovieType movieType) {
        this.title = title;
        this.movieType = movieType;
    }

    public MovieType getMovieType() {
        return movieType;
    }

    public String getTitle (){
        return title;
    };
}

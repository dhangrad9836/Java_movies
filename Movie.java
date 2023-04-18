import java.time.Year;
import java.util.ArrayList;

public class Movie {

    //fields
    private String name;
    private int year;
    private int duration;
    private String director;
    private ArrayList<Integer> reviews;

    //constructor
    //we will have three contstructors
    // 1. default constructor
    public Movie(){
        name = "N/A";
        year = 0;
        duration = 0;
        director = "N/A";
        reviews = new ArrayList<>();
    }

    //2. full constructor
    public Movie(String _name, int _year, int _duration, String _director){
        name = _name;
        year = _year;
        duration = _duration;
        director = _director;
        reviews = new ArrayList<>();
    }

    // 3. copy object Movie constructor
    public Movie(Movie _movie){
        name = _movie.name;
        year = _movie.year;
        duration = _movie.duration;
        director = _movie.director;
        reviews = new ArrayList<>(_movie.reviews);
    }

    //setter
    public void setName(String _name){
        name = _name;
    }

    public  void setYear(int _year){
        year = _year;
    }

    public void setDuration(int _duration){
        duration = _duration;
    }

    public void setDirector(String _director){
        director = _director;
    }

    //addReview method
    public void addReview(int score){
        if(score >= 0 && score <= 5){
            reviews.add(score);
        } else {
            System.out.println("Invalid review score");
        }
    }// end addReview method

    // calculate the avg score
    public double getReviewAverage(){
        double sum = 0.0;
        for(int i = 0; i<reviews.size(); i++){
            sum += reviews.get(i);
        }
        if(reviews.size() > 0){
            return sum / reviews.size();
        } else {
            return 0;
        }
    }// end getReviewAverage method

    //add method to calculate movie's age
    public int getAge(){
        int current_year = Year.now().getValue();
        return current_year - year;
    }

    //add toString method with @Override
    @Override
    public String toString(){
        return "Movie{" +
                "name'" + name + '\'' +
                ", year=" + year +
                ", duration=" + duration +
                ", director='" + director +'\'' +
                ", reviews=" + reviews +
                '}';
    }//end toString method


    public static void main(String args[]){
        //empty movie
        Movie m1 = new Movie();

        //movie hunger games
        Movie m2 = new Movie("Hunger Games", 2012, 142, "Gary Ross");
        m2.addReview(5);
        m2.addReview(4);
        m2.addReview(6);

        //copy movie object of m2
        Movie m3 = new Movie(m2);
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
    }
}//end Movie class

















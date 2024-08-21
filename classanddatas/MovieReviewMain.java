package classanddatas;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview movie1 = new MovieReview();
        MovieReview movie2 = new MovieReview();
        movie1.movieName = "\"인셉션\"";
        movie2.movieName = "\"어바웃 타임\"";
        movie1.reviewComment = "\"인생은 무한 루프\"";
        movie2.reviewComment = "\"인생 시간 영화!\"";

        MovieReview[] movieReviews = {movie1, movie2};

        for(MovieReview data : movieReviews){
            System.out.println("영화 제목: " + data.movieName + " 리뷰: " + data.reviewComment);
        }
    }
}

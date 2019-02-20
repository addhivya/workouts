package Assignment6.Problem1;

import java.util.ArrayList;

public class Mreview implements Comparable<Mreview> {

    private String title;
    private ArrayList<Integer> ratings;

    public Mreview() {
        this.ratings = new ArrayList<>();
    }

    public Mreview(String ttl) {
        this.title = ttl;
        this.ratings = new ArrayList<>();
    }

    public Mreview(String ttl, Integer Firstrating) {
        this.title = ttl;
        this.ratings = new ArrayList<>();
        ratings.add(Firstrating);
    }

    public void addRating(int r) {
        this.ratings.add(r);
    }

    public double aveRating() {
        int size = this.ratings.size();
        int total = 0;
        double avg = 0.0f;
        for (int rating : ratings) {
            total = rating + total;
            avg = (double) total / (double) size;

        }
       return (Math.round(avg*10))/10.0;  //ratings are to be with 1 decimal digit
    }

    @Override
    public int compareTo(Mreview obj) {
        return this.title.compareTo(obj.title);
    }

    public boolean equals(Object obj) {
        Mreview tit = (Mreview) obj;
        return this.title.equals(tit.title);
    }

    public String getTitle() {
        return this.title;
    }

    public int numRatings() {
        int size;
        size = this.ratings.size();
        return size;
    }

    public String toString() {
        return (this.getTitle() + ", average " + this.aveRating() + " out of " + this.numRatings() + " ratings");
    }

    public static void main(String[] args) {
        Mreview review = new Mreview("Episode1", 2);
        review.addRating(2);
        review.addRating(4);
        System.out.println(review);
        System.out.println("Avg Rating: " + review.aveRating());
    }
}

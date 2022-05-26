package _04_netflix;

public class Main {
	public static void main(String[] args) {
		Movie movie1 = new Movie("Terminatior 2", 10);
		Movie movie2 = new Movie("The Simpsons Movie", 8);
		Movie movie3 = new Movie("Terminatior 3", 5);
		Movie movie4 = new Movie("Kindergarden Cop", 7);
		Movie movie5 = new Movie("Star Wars Episode 1: The Phantom Menace",2);
		NetflixQueue queue = new NetflixQueue();
		queue.addMovie(movie1);
		queue.addMovie(movie2);
		queue.addMovie(movie3);
		queue.addMovie(movie4);
		queue.addMovie(movie5);
		
		queue.printMovies();
	}
}

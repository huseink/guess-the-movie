import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Movies{
	
	private Scanner scannedMovies;
	
	// Opens the text file given
	private File movieList = new File("C:\\Users\\Husein\\eclipse-workspace\\Guess The Movie\\src\\movies.txt");
	// Stores the number of lines in the text file
	private int movieCount = countLines(movieList);
	
	
	// Initialize a constructor which scans the file.
	public Movies() throws Exception{
		Scanner scannedMovies = new Scanner(movieList);
		this.scannedMovies = scannedMovies;
	}
	
	
	// Counts movies(lines) in the given Text File
	public static int countLines(File input) throws IOException {
	    try (InputStream is = new FileInputStream(input)) {
	        int count = 1;
	        for (int aChar = 0; aChar != -1;aChar = is.read())
	            count += aChar == '\n' ? 1 : 0;
	        return count;
	    }
	}
	
	
	// Generates a random number to be used when getting a Random Movie from the array.
	private int generateRandNumber() {
		int randNumber = (int) (Math.random() * movieCount) +1 ;
		return randNumber;
	}
	
	
	
	/* Creates and returns an array according to the line numbers in the text file
	and fills it with movie names that are given in the file */
	private String fillMovieArray(int x) throws IOException {
		String[] arrayofMovies = new String[movieCount];
		while(scannedMovies.hasNextLine()) {
			for(int i = 0 ; i<movieCount;i++) {
				arrayofMovies[i]=scannedMovies.nextLine();
			}
		}
		
		return arrayofMovies[x];
	}
	
	// Returns a random movie from the arrayofMovies which was filled using fillMovieArray(int x)
	public String getRandomMovie() throws IOException {
		int generatedNum = generateRandNumber();
		String movieTitle = fillMovieArray(generatedNum);
		
		return movieTitle;
	}
}
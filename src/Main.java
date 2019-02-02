import java.io.*;
 
import java.util.HashMap;
public class Main {

	public static void main(String[] args) {
		
		File dir = new File("../../corpus_RI");
		File[] directoryListing = dir.listFiles();

		 

			Fichier.fileReader(directoryListing );
		 

	}

}

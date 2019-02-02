import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;;
public class Fichier {
	
 
	
	
static void fileReader (String nameFile) {
		
		HashMap <String,Integer> words=new HashMap<String, Integer>();		
	 
		try {
			
		File file=new File(nameFile);
		FileReader fr=new FileReader(file);
		BufferedReader br =new BufferedReader(fr);
		
		String line=br.readLine();
		
		System.out.println(line);
		while (line!=null) {
			
			String [] splittedLine=line.split(" ");			
			 
			for (String wordInLine : splittedLine) {
				
				if (words.get(wordInLine)!=null) {
				
					words.put(wordInLine, (Integer)words.get(wordInLine)+1);
				}
				else {
					
					words.put(wordInLine, 1);
				}
			}
			line=br.readLine();
		}
		
		Set <String> keys =words.keySet();
		 for (String s : keys ) {
			 System.out.println("Le mot "+s+" possède "+words.get(s)+" occurences");
			 
		 }
		
		
		
		}
		catch (Exception e) {
			
			System.out.println(e.getMessage());
			
		}

}
}
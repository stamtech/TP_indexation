import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;;
public class Fichier {
	
 
	
	
static void fileReader (File [] dir) {
		
		HashMap <String, HashMap<String,Integer>> words=new HashMap <String, HashMap<String,Integer>>();		
	 
		try {
	for (File f : dir) {		
		
		File file=new File("../../corpus_RI/"+f.getName());
		FileReader fr=new FileReader(file);
		BufferedReader br =new BufferedReader(fr);
		
		String line=br.readLine();
		
		
		while (line!=null) {
			
			String [] splittedLine=line.split(" ");			
			 
			for (String wordInLine : splittedLine) {
				
				if (words.get(wordInLine)!=null) {
				    
					HashMap <String,Integer> info=words.get(wordInLine);
					if (info.get(f.getName())!=null) {
						info.put(f.getName(), info.get(f.getName())+1);
					}
					else {
						info.put(f.getName(), 1);
					}
					words.put(wordInLine, info);
				}
				else {
					HashMap <String,Integer> info=new HashMap();
					info.put(f.getName(),1);
					words.put(wordInLine, info);
				}
			}
			line=br.readLine();
		}
		
		Set <String> keys =words.keySet();
		 for (String s : keys ) {
			 
			 Set <String> keysInfo=words.get(s).keySet();
			 for (String k:keysInfo) {
			 System.out.println("Le mot "+s+" possède dans le fichier "+k+ " "+ words.get(s).get(k)+" occurences");
			 }
		 }
		
	}
		
		}
		catch (Exception e) {
			
			System.out.println(e.getMessage());
			
		}
	//	return words;
}

}
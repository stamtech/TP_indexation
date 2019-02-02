import java.io.*;
import java.util.*;
public class Main
					


{
public static void main (String[]args)
							{
								try
								
								
									{
 	
									@SuppressWarnings("resource")
	
									BufferedReader b = new BufferedReader (new FileReader ("test1.txt" ));
 	
									String line;
 	
									Map<String, Integer> maMap = new HashMap<String, Integer>();
 	
									Integer Mot = new Integer(1);
 	
									while ((line = b.readLine())!= null)
 	
									{
   
										String [] tokens = line.split("\\b" );
   
										int i = 0;
   
										while (tokens.length > i)
  
										{
   	
											String Word = tokens[i++];
   	
											Word = Word.toLowerCase();
   	
											Word = Word.replaceAll("[^a-z]","" );
   	
											if(Word.length()>2)
											{
												if (maMap.containsKey(Word)== false )
												{
													maMap.put(Word, Mot);
												}
												else
												{
													String nombre_key = maMap.get(Word).toString();
													Integer MotStoke = new Integer(nombre_key);
													int temp = Mot.intValue()+ MotStoke.intValue();
													Integer nbMot = new Integer (temp);
													Mot.toString();
													maMap.remove(Word);
													maMap.put(Word, nbMot);
												}
											}
										}
									}
									System.out.println(maMap);
									}
								catch (Exception e) {
									System.out.println(e);
								}
							}
	}
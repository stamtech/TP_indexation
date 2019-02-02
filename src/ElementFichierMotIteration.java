import java.*;
import java.util.HashMap;



public class ElementFichierMotIteration {
	private  String NomFichier;
	HashMap<String, Integer> ListeMot = new HashMap<String, Integer>();
	 
	private void AjoutMot(String pMot)
	{
		if (ListeMot.get(pMot) == null)
		{
		    
		  this.ListeMot.put(pMot,1);	
	}
		else
		{
			this.ListeMot.put(pMot, this.ListeMot.get(pMot)+1);
		}
	}
	
	void DecoupePhrase(String pPhrase)
	
	{
		Integer p =0;
		Integer i= 0;
		String s1;
		
		while (  (p= pPhrase.indexOf(" "))>=0)
		{	 		
    		if (i==0) { 
    			
    		    s1 =pPhrase.substring(0, p);
    		    pPhrase = pPhrase.substring(p+1,pPhrase.length());
    			i++;
			}
    		else
    		{
    			s1 =pPhrase.substring(0, p);
    			pPhrase = pPhrase.substring(p+1,pPhrase.length());
			}
	    	
    		System.out.println("Problem occured : " + s1);
    		this.AjoutMot(s1);
		}
	
	   System.out.println("Problem occured : " + pPhrase);
	   this.AjoutMot(pPhrase);  

		
	}
}

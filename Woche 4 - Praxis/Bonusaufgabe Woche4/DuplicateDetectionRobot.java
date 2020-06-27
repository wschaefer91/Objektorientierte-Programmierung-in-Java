import java.util.ArrayList;
import java.util.HashSet;

public class DuplicateDetectionRobot {

	// implementiere hier die Methode
	
	public void printDuplicates(ArrayList<String> listA, ArrayList<String> listB)
	{
	    for(String a : listA)
	    {
	        for(String b : listB)
	        {
	            if(a.equals(b))
	            {
	                System.out.println(a);
	            }
	        }
	    }
	}
	
}

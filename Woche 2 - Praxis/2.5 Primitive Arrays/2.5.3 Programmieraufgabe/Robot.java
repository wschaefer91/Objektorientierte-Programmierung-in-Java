class Robot {
	
	void identifyIP(){
	    Email email = new Email();
	    String[][] array = email.ipaddress;
	    
	    // Schreibe hier deine Lösung
	    
	    for(int i = 0; i < 3; i++)
	    {
	        
	        for(int j = 0; j < 3; j++)
	        {
	            System.out.println(array[i][j]);
	        }
	        
	    }
	    
	}
	
}

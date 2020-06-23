class Robot {
	private String internalStorage = "416e737765723f203432";
	
	private void flushStorage()
	{
	    
	    this.internalStorage = "";
	    
	}
	
	public void safeFlushStorage(String input)
	{
	    
	    if(input.equals("pw_duke"))
	    {
	        System.out.println(internalStorage);
	        flushStorage();
	    }
	    
	    
	}
	
}

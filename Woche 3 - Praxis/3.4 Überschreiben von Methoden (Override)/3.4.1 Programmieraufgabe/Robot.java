class Robot extends OldRobot{
	int internalStorageSize = 7;
	
	@Override
	void greetUser()
	{
	    
	    System.out.println("Hallo Duke!");
	    
	}
	
	@Override
	int getInternalStorageSize()
	{
	    
	    return this.internalStorageSize;
	    
	}

}

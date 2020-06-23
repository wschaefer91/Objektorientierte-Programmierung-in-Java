class Robot {
	private boolean activated = false;

	public void printStatus() {
		System.out.println(activated);
	}
	
	public void setActivated(boolean input)
	{
	    
	    this.activated = input;
	    
	}
	
	public boolean isActivated()
	{
	    
	    return this.activated;
	    
	}
	
}

class Robot {
	private int batteryRuntime = 0;

	public void setBatteryRuntime(int newTime) {
	    if (notNegative(newTime)) {
		    batteryRuntime = newTime;
		    }
	}

	public int getBatteryRuntime() {
		return batteryRuntime;
	}
	
	private boolean notNegative(int time)
	{
	    
	    if(time >= 0)
	    {
	        return true;
	    }
	    else
	    {
	        return false;
	    }
	    
	}
}

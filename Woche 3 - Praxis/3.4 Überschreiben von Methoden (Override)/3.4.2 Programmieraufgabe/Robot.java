public class Robot extends OldRobot {
	int additionalStorageSize = 0;
	
	@Override
	void setStorage(int storageSize)
	{
	    
	    if(storageSize <= 1000)
	    {
	        super.setStorage(storageSize);
	    }
	    else
	    {
	        super.setStorage(1000);
	        additionalStorageSize = storageSize - 1000;
	    }
	    
	}

}
import java.util.HashMap;

class Door {

	public HashMap<String, AccessCode> doorCodes = new HashMap<>();

	public HashMap<String, AccessCode> getDoorCodes() {
		return doorCodes;
	}
	
	public void addDoorKey(String key, AccessCode value)
	{
	    doorCodes.put(key, value);
	}
	
	public void useCode(String key)
	{
	    doorCodes.get(key).setNumberOfTimesUsed(doorCodes.get(key).getNumberOfTimesUsed() + 1);

        if (doorCodes.get(key).getNumberOfTimesUsed() > 2) {
            System.out.println("Schlüssel nicht mehr gültig");
            doorCodes.get(key).setValid(false);
        } else 
        {
            System.out.println("Schlüssel gültig");
        }
	}
}

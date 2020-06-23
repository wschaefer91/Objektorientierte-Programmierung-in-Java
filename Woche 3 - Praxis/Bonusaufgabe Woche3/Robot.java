public class Robot {
	private String task;
	private int batteryRuntime = 10;

	public void setTask(String newTask){
		task = newTask;
		printTask();
	}
	
	public String getTask(){
		return task;
	}
	
	public int getBatteryRuntime(){
		return batteryRuntime;
	}
	
	private void setBatteryRuntime(int newRuntime){
		if (newRuntime > 0){
			System.out.println("Neue Laufzeit beträgt: " + newRuntime);
			batteryRuntime = newRuntime;	
		}
	}
	
	public void work(){
		int runtime = getBatteryRuntime();
		if (runtime > 0){
			runtime = runtime - 1;
			setBatteryRuntime(runtime);
		}
	}
	
	private void printTask(){
		System.out.println("Ich arbeite jetzt an: " + getTask());
	}
}

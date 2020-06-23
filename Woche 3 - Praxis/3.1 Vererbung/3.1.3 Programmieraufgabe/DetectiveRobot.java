class DetectiveRobot extends Robot {
    
    int spareBatteryRuntime = 5;
    
    int giveTotalBatteryRuntime()
    {
        
        return spareBatteryRuntime + giveBatteryRuntime();
        
    }

}

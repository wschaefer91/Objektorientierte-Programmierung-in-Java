class Robot {
    boolean hasTask;
    boolean batteryEmpty;
    int taskCounter;

    void helpDuke() {
        // In dem nachfolgenden if-Konstrukt fehlen die booleschen Ausdrücke, die Attributänderungen 
        // und die Ausgabetexte. Ergänze die Bedingungen, füge die notwendigen Statements hinzu und
        // ergänze die Ausgaben "Das erledige ich gern für dich.", 
        // "Duke! Ich brauch Mal ne Pause... Frag mich später nochmal!", "Ich hab gerade nichts zu tun."
        // und "Ich lade meine Batterie." an geeigneter Stelle.
        
    	if (hasTask == true && taskCounter < 3 && batteryEmpty != true) {
    		System.out.println("Das erledige ich gern für dich.");
    		taskCounter += 1;
    	} else if (taskCounter == 3 && batteryEmpty != true) {
    		System.out.println("Duke! Ich brauch Mal ne Pause... Frag mich später nochmal!");
    		taskCounter = 0;
    	} else if (batteryEmpty == true) {
    	    System.out.println("Ich lade meine Batterie.");
    	    batteryEmpty = false;
    	} else {
    		System.out.println("Ich hab gerade nichts zu tun.");
    	}
    }
}

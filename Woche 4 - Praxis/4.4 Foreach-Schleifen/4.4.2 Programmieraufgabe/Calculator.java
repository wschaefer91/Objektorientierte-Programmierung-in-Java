public class Calculator {

	int calculateSum(int[] numbers) {
		// Berechne hier die Summe aller Zahlen mit einer foreach Schleife und gib sie zurück:
		
		int sum = 0;
		
		for(int i : numbers)
		{
		    sum += i;
		}
		
		return sum;

	}

	double calculateMean(int[] numbers) {
		double sum = calculateSum(numbers);
		// Berechne hier das Arithmetische Mittel und gib es zurück:
		
		int counter = 0;
		
		for(int i : numbers)
		{
		    counter++;
		}
		
		return sum/counter;

	}
}

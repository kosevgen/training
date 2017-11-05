package ekos.lesson_2;

public class SecondClass {
	// Клас обчислює скільки км проходить світло за визначену кількість днів
	public static void main(String[] args) {
		long days;
		long seconds;
		long distance;
		int lightspeed;
		
		lightspeed = 3000000;
		days = 365*200000;
		seconds = days*24*3600;
		distance = seconds * lightspeed;
		System.out.println(" Відстань,я ку пройде світло за "+ days + " днів становить "+ distance/1000 +" кілометрів");
	}
}

package ekos.lesson_2;

public class SecondClass {
	// ���� �������� ������ �� ��������� ����� �� ��������� ������� ���
	public static void main(String[] args) {
		long days;
		long seconds;
		long distance;
		int lightspeed;
		
		lightspeed = 3000000;
		days = 365*200000;
		seconds = days*24*3600;
		distance = seconds * lightspeed;
		System.out.println(" ³������,� �� ������ ����� �� "+ days + " ��� ��������� "+ distance/1000 +" ��������");
	}
}

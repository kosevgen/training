package ekos.lesson_1;

public class Types {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 300;
		byte b;
		char c = 200;
		b = (byte) a;
		System.out.println("a = "+a+ " byte b = "+b);
		b = (byte) c;
		System.out.println("b = (byte) c b = "+b);
		System.out.println("b = c%256 "+256%c);
	}

}

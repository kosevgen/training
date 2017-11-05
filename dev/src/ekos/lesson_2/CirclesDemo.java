/**
 * 
 */
package ekos.lesson_2;

/**
 * @author ��� �����
 *
 */

class Circles{
	
	double radius;
	double X;
	double Y;
	double diametr = 2*radius;
	
	double square(double radius){
		
		return radius*radius*3.1415;
		
	}
	
	double lon(double radius){
		
		return 2*3.1415*radius;
		
	}
	
}

public class CirclesDemo {

	/**
	 * 
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circles smallCircle = new Circles();
		Circles normCircle = new Circles();
		Circles bigCircle = new Circles();
		
		smallCircle.radius = 20.1145778;
		smallCircle.X = 22.256;
		smallCircle.Y = 0.1255787;
		System.out.println("����� ����� small ��� �����"+smallCircle.radius+" = "+smallCircle.square(smallCircle.radius));
		System.out.println("������� ����� small ="+smallCircle.lon(smallCircle.radius));
		System.out.println("����� ����� ����������� �� ������������ ("+smallCircle.X+";"+smallCircle.Y+")\n\n\n");
		
		normCircle.radius = 50445787896654.124577778;
		normCircle.X = 0.0002;
		normCircle.Y = 0.0001;
		System.out.println("����� ����� norm ��� �����"+normCircle.radius+" = "+normCircle.square(normCircle.radius));
		System.out.println("������� ����� norm ="+normCircle.lon(normCircle.radius));
		System.out.println("����� ����� ����������� �� ������������ ("+normCircle.X+";"+normCircle.Y+")\n\n\n");
		
		bigCircle.radius = 87896654.124577778;
		bigCircle.X = 500.0002;
		bigCircle.Y = 12.0001;
		System.out.println("����� ����� big ��� �����"+bigCircle.radius+" = "+bigCircle.square(bigCircle.radius));
		System.out.println("������� ����� big ="+bigCircle.lon(bigCircle.radius));
		System.out.println("����� ����� ����������� �� ������������ ("+bigCircle.X+";"+bigCircle.Y+")");

	}

}

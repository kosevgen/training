/**
 * 
 */
package ekos.lesson_1;

/**
 * @author Кос Євген
 *
 */
public class Arrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayInt;
		arrayInt = new int[50];
		
		for(int i = 0; i < arrayInt.length; i++){
			
			arrayInt[i] = i*20;
			System.out.println("arrayInt["+i+"] = "+arrayInt[i] );
		}
		
		double [] arrayDouble = new double[200];
		
		for(int i = 0; i< arrayDouble.length; i++){
			
			arrayDouble[i] = i*2.856644782546;
			System.out.println("arrayDouble["+i+"] = "+(byte)arrayDouble[i] );
		}
		
		for(int i = 0; i< arrayDouble.length; i++){
					
					arrayDouble[i] = i*2.856644782546;
					System.out.println("arrayDouble["+i+"] = "+arrayDouble[i] );
		}
		
		int [][] twoArrayInt = new int [20][30];
		for(int i = 0; i < 20; i++){
			
			for (int j = 0; j < 30; j++) {
				
				twoArrayInt[i][j] = i*1+j*4;
				System.out.print("twoArrayInt["+i+"]["+j+"] = "+twoArrayInt[i][j]+"\t");
				
			}
			System.out.println();
		}
		
		double [][] twoArrayDouble = new double [20][30];
		for(int i = 0; i < 20; i++){
			
			for (int j = 0; j < 30; j++) {
				
				twoArrayDouble[i][j] = i*1.0256777897445+j*4.3215465489887;
				System.out.print("twoArrayDouble["+i+"]["+j+"] = "+twoArrayDouble[i][j]+"\t");
				
			}
			System.out.println();
		}
		
	}

}

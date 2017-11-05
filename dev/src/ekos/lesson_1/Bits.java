package ekos.lesson_1;

/**
 * @author Кос Євген
 *
 */

public class Bits {
	public static void main(String[] args){
		
		byte b = (byte) 0xf1;
		byte c = (byte) (b >> 4);
		byte d = (byte) (b >>> 4);
		byte e = (byte) ((b & 0xff) >>> 6);
		
		System.out.println("b = "+b);
		System.out.println("c = "+c);
		System.out.println("d = "+d);
		System.out.println("e = "+e);
		
		long testBin =0b11111100000010111011011;// позначення двійкового літералу!!!
		System.out.println("testBIN = "+testBin);
		System.out.println("testBIN >> 1 = "+(testBin >> 1));
		System.out.println("testBIN >> 2 = "+(testBin >> 2));
		System.out.println("testBIN << 3 = "+(testBin << 3));
		System.out.println("testBIN >> 8 = "+(testBin >> 8));
		System.out.println("testBIN << 8 = "+(testBin << 8));
		System.out.println("\n\n");
		
		//Перевід в двійкову систему числення!!!
		int a = 20000000;
		int mod = 2; //BIN!!!
			
		for(int j = 0;j<200000; j++){
			a = 20000000*j;
			int[] arrayBINDirect = new int[64]; //розрядність
			System.out.println("\n\n\n");
			int krok = 0;
			do{
				arrayBINDirect[krok] = a%mod;
				a = Math.abs((int)a/2);
				System.out.println("krok = "+krok+" a = "+a);
				krok++;
				//a = a - (a*(a%mod));
				
				
			}while( a != 0);
			System.out.println("\n\n\n");
			for(int i = arrayBINDirect.length - 1; i>=0 ;i--){
				
				System.out.print(arrayBINDirect[i]);
				
			}
		}
	}

}

//import java.math.*;

public class Decimal {
	
		
	public static String convertToBinary (String dec) {

		String bin = "";
		int dec2 = Integer.parseInt(dec);
		int quotient = dec2;
		int count =0;
			
		while (quotient != 0) {
			
			quotient = quotient /2;
			count ++;
						
		}
		
		String [] binArray = new String[count];
		int remainder=0;
		int quotient2 = dec2;
		int quotientR = dec2;
		
		for (int i = binArray.length-1; i >=0; i--) {
			
			if (quotient2 !=0) {
				quotientR = quotient2 %2;
				quotient2 = quotient2 / 2;
				
				if (quotientR == 0 ) {
					remainder = 0;
					
				}
				else {
					remainder = 1;
				}
									
				binArray [i] = Integer.toString(remainder);
				
			}
		
		}
		
		for (int y = 0; y < binArray.length; y++) {
			 bin += binArray[y];
			
		}

		return bin;
		
	}
	
	public static String convertToHexadecimal (String dec) {
		String hex = "";
		int dec2 = Integer.parseInt(dec);
		
		
		
		
		while (dec2 !=0) {
			int remainder = dec2 % 16;		
			hex = toHexChar(remainder) + hex;
			dec2 = dec2 /16;
		}
		
		
		return hex;
		
	}
	
	
	private static char toHexChar (int remainder) {
		if (remainder <= 9 && remainder >=0) {
			return (char) (remainder + '0');
		}
		else {
			return (char) (remainder - 10 + 'A');
		}
		
	}
		

	

}

//import java.math.*;


public class Hexadecimal {
	
	
	public static String convertToBinary (String hex) {
		int dec = Integer.parseInt(Hexadecimal.convertToDecimal(hex));
		String bin = "";
		
		int quotient = dec;
		int count =0;
		// special case for 0 only
		if (dec == 0) {
			bin = "0";
		}
		
		while (quotient != 0) {
			quotient = quotient /2;
			count ++;			
		}
		
		String [] binArray = new String[count];
		int remainder=0;
		int quotient2 = dec;
		int quotientR = dec;
		
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
	
	
	public static String convertToDecimal (String hex) {
		int dec = 0;
		int length = hex.length()-1;
		
		for (int i = 0; i <= length; i++) {
			
			String hexString = Character.toString(hex.charAt(i));
			int intAtLocation = Character.getNumericValue(hex.charAt(i));
			
			if (intAtLocation>=0 && intAtLocation <=9) {
				int decimal = (int)(intAtLocation * Math.pow(16, length-i));
				dec += decimal;
			}
			else if (hexString.equals("A")) {
				int decimal = (int) (10 * Math.pow(16,  length-i));
				dec += decimal;				
			}
			else if (hexString.equals("B")) {
				int decimal = (int) (11 * Math.pow(16,  length-i));
				dec += decimal;
			}
			else if (hexString.equals("C")) {
				int decimal = (int) (12 * Math.pow(16,  length-i));
				dec += decimal;
			}
			else if (hexString.equals("D")) {
				int decimal = (int) (13 * Math.pow(16,  length-i));
				dec += decimal;
			}
			else if (hexString.equals("E")) {
				int decimal = (int) (14 * Math.pow(16,  length-i));
				dec += decimal;
			}
			else if (hexString.equals("F")) {
				int decimal = (int) (15 * Math.pow(16,  length-i));
				dec += decimal;
			}
															
		}
				
		return Integer.toString(dec);
		
		
	}

}

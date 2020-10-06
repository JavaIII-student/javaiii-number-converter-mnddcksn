//import java.math.*;


public class Binary {
	
		
	public static String convertToHexadecimal (String bin) {
		int dec = Integer.parseInt(convertToDecimal(bin));
		String hex = "";
		while (dec !=0) {
			int hexVal = dec % 16;		
			hex = toHexChar(hexVal) + hex;
			dec = dec /16;
		}
		
		
		return hex;
		
	}
	
	
	private static char toHexChar (int hexVal) {
		if (hexVal <= 9 && hexVal >=0) {
			return (char) (hexVal + '0');
		}
		else {
			return (char) (hexVal - 10 + 'A');
		}
		
	}
	
	public static String convertToDecimal (String bin) {
		
		int dec = 0;
		int length = bin.length()-1;
		
		for (int i = 0; i <= length; i++) {
			char binAtLocation = bin.charAt(i);
			int intAtLocation = Character.getNumericValue(binAtLocation);			
			int decimal = (int)(intAtLocation *  Math.pow(2, (length-i)));
			dec += decimal;					
		}
		
		return Integer.toString(dec);
		
	}

}

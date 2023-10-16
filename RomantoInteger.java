package romaninteger;
import java.util.HashMap;
import java.util.Scanner;
public class RomantoInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a Roman numeral: ");
	        String input = scanner.nextLine();
	        scanner.close();

	        int result = romanToInt(input);
	        System.out.println("Roman numeral " + input + " is equivalent to " + result);
	    }

	    public static int romanToInt(String s) {
	        HashMap<Character, Integer> romanMap = new HashMap<>();
	        romanMap.put('I', 1);
	        romanMap.put('V', 5);
	        romanMap.put('X', 10);
	        romanMap.put('L', 50);
	        romanMap.put('C', 100);
	        romanMap.put('D', 500);
	        romanMap.put('M', 1000);

	        int result = 0;
	        int prevValue = 0;

	        for (int i = s.length() - 1; i >= 0; i--) {
	            int value = romanMap.get(s.charAt(i));
	            if (value < prevValue) {
	                result -= value;
	            } else {
	                result += value;
	            }
	            prevValue = value;
	        }

	        return result;
	}

}

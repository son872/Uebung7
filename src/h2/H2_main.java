package h2;

import java.util.Arrays;

public class H2_main {

	public static int[] change(int[] a, int[] b, int start, int end) {
		
		if(Arrays.compare(a, b) != 0 && end > start) {
			return Arrays.copyOfRange(a,  0,  a.length);
		}
		
		else if (Arrays.compare(a, b) == 0 && end > start) {
			Arrays.sort(a);
			return Arrays.copyOfRange(a,  start, end);
			
		}
		
		else {
			return new int[0];
		}
		

	}
public static void main(String[] args) {
	
}
}


public class Assignment1_1 {
	public static void main(String[] args) {
		char[] a = {'a','b','c','d','e','f','g','h','i'};
		
		Assignment1_1.combination(a, a.length, 4);
		
	}
	
	
	
	public static void combination(char[] a, int n, int k) {
		String[] str = count(a, n, k);
		for (int i = 0; i < str.length; i ++) {
			System.out.println(str[i]);
		}
		System.out.println(str.length);
	}
	
	private static String[] count(char[] a, int n, int k) {
		if (n == k) {
			String s = "";
			for(int i = 0; i < n; i ++) {
				s += a[i];
			}
			String[] str = new String[1];
			str[0] = s;
			
			return str;
			
		}
		else if(k == 1) {
			String[] str = new String[n];
			for (int i = 0; i < n; i ++) {
				str[i] = "" + a[i];
			}
			return str;
			
		}
		else {
			char[] a1 = new char[n - 1];
			for (int i = 0; i < n - 1; i ++) {
				a1[i] = a[i];
			}
			String[] str1 = count(a1, n - 1, k);
			String[] str2 = count(a1, n - 1, k - 1);
			
			String[] str = new String[str1.length + str2.length];
			
			//System.out.println(str1.length + "," + str2.length);
			
			if (str1.length != 0) {
				for (int i = 0; i < str1.length; i ++) {
				    str[i] = "" + str1[i];
			    }
			}
			if (str2.length != 0) {
				for (int i = str1.length; i < str.length; i ++) {
				    str[i] = str2[i - str1.length] + a[a.length - 1];
			    }
			
			}
			
			
			return str;
		}
		
		
		
		
		
	}

}

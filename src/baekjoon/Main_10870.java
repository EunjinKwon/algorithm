package baekjoon;
import java.io.*;

public class Main_10870 {
	//n번째 피보나치 수를 출력하는 문제
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(fibonacci(n));
		
	}
	
	public static int fibonacci(int n) {
		
		if(n == 0)
			return 0;
		
		else if(n == 1)
			return 1;
		
		else
			return fibonacci(n-1) + fibonacci(n-2);
		
		
	}

}

package baekjoon;
import java.io.*;

public class Main_10872 {
	//재귀를 이용해서 N!을 출력하는 문제
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		System.out.println(factorial(N));
		
	}
	
	//n!을 구하는 함수
	public static int factorial(int n) {
		if(n == 0)
			return 1;
		
		else
			return n * factorial(n-1);
	}

}

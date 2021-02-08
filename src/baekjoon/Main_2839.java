package baekjoon;

import java.io.*;

public class Main_2839 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//5와 3을 최소 횟수로 합하여 N을 만드는 문제
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		//규칙을 찾아야 한다.
		if (n == 4 || n == 7) { // 1. n이 4 또는 7인 경우
			System.out.println(-1);
		}
		else if (n % 5 == 0) { // 2. n이 5의 배수인 경우
			System.out.println(n / 5);
		}
		else if (n % 5 == 1 || n % 5 == 3) { // 3. n이 5의 배수+1 또는 5의 배수+3인 경우
			System.out.println((n / 5) + 1);
		}
		else if (n % 5 == 2 || n % 5 == 4) { // 4. n이 5의 배수+2 또는 5의 배수+4인 경우
			System.out.println((n / 5) + 2);
		}
	}

}

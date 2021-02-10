package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Main_1978 {

	public static void main(String[] args) throws IOException {
		//주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 문제
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int cnt = 0;
		
		while(st.hasMoreTokens()) {
			
			boolean isPrime = true; //소수이면 true, 아니면 false
			int num = Integer.parseInt(st.nextToken());
			
			if(num == 1)
				continue;
			
			for(int i=2; i<=Math.sqrt(num); i++) {
				if(num % i == 0) {
					isPrime = false;
					break;
					}
				}
			
			if(isPrime == true) //위의 for문이 끝났어도 true라면 소수
				cnt++;
			
		}
		System.out.println(cnt);
		

	}

}

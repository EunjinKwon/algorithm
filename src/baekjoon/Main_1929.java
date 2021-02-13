package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Main_1929 {
	
	public static boolean prime[];

	public static void main(String[] args) throws IOException {
		//M이상 N이하의 소수를 모두 출력하는 문제
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		prime = new boolean[N+1];
		primeNum(); //소수구하기 함수
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=M; i<=N; i++) {
			if(!prime[i]) //소수이면
				sb.append(i + "\n");
		}
		
		System.out.print(sb);

	}
	
	//에라토스테네스의 체
	public static void primeNum() {
		//소수가 아니면 true; 소수면 false
		prime[0] = true;
		prime[1] = true;
		
		for(int i=2; i<=Math.sqrt(prime.length); i++) {
			if(prime[i]) continue; //이미 체에 걸러졌으면 continue
			for(int j=i*i; j<prime.length; j+=i) {
				prime[j] = true;
			}
		}
	}

}

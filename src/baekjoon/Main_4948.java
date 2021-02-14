package baekjoon;

import java.io.*;

public class Main_4948 {
	//베르트랑 공준 문제(n보다 크고, 2n보다 작거나 같은 소수의 개수

	public static boolean prime[]; 
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			int n = Integer.parseInt(br.readLine());
			if(n == 0) //0이면 종료
				break;
			
			prime = new boolean[2*n+1];
			int cnt = 0; //소수 개수
			
			primeNum();
			
			for(int i=n+1; i<=2*n; i++) {
				if(!prime[i]) {
					cnt++;
				}
			}
			sb.append(cnt + "\n");
			
		}
		
		System.out.println(sb);
		
		
		
		

	}
	//에라토스테네스의 체
	public static void primeNum() {
		//소수가 아니면 true 소수이면 false
		prime[0] = true;
		prime[1] = true;
		
		for(int i=2; i<=Math.sqrt(prime.length); i++) {
			if(prime[i]) continue;
			for(int j=i*i; j<prime.length; j+=i) {
				prime[j] = true;
			}
		}
	}

}

package baekjoon;

import java.io.*;

public class Main_2581 {

	public static boolean prime[];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		//M이상 N이하의 자연수 중 소수인 것을 모두 골라 이들 소수의 합과 최솟값을 찾는 문제
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		
		prime = new boolean[N+1];
		primeNum();
		
		int sum = 0; //소수의 합
		int min = -1; //M~N 사이에서 나올 수 없는 수로 초기화
		
		for(int i=M; i<=N; i++) {
			if(!prime[i]) {
				sum += i;
				if(min == -1) //처음 if문 안으로 들어왔을 때
					min = i;
			}
		}
		
		if(sum == 0) //소수가 없으면 -1출력
			System.out.println(-1);
		
		else {
			System.out.println(sum);
			System.out.println(min);
		}
		
		
	}
	
	public static void primeNum() {
		//true면 소수X, false면 소수
		prime[0] = true;
		prime[1] = true;
		
		//에라토스테네스의 체 알고리즘
		for(int i=2; i<=Math.sqrt(prime.length); i++) {
			if(prime[i]) continue; //이미 소수가 아닌걸로 걸려졌으면 continue
			for(int j=i*i; j<prime.length; j+=i) {
				prime[j] = true;
			}
		}
		
	}
}

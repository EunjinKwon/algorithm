package baekjoon;

import java.io.*;

public class Main_11653 {

	public static void main(String[] args) throws IOException {
		//N을 소인수분해하는 문제
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
/*비교적 비효율적인 방법		
		if(N == 1)
			return;
		
		else if(N == 2) {
			System.out.println(2);
			return;
		}
		
		int d = 2;
		int num = N;
		boolean isPrime = true;
		
		while(num!=1) {
			
			if(num % d == 0) { //d가 num의 약수이면
				num /= d; //계속 나눠져서 num이 1이 되면 그 다음에 while문을 빠져나간다.
				sb.append(d+"\n");
				isPrime = false; //한 번이라도 이 if문이 실행됐으면 N은 소수가 아니다.
			}
			else
				d++;
			
			if(isPrime == true && d == N) { //소수일 때
				sb.append(d+"\n");
				break;
			}
		}
		
		System.out.println(sb);
*/
		
		
//더 효율적인 방법!!
		
		for(int i=2; i*i<=N; i++) { //N의 제곱근 까지만 탐색한다.
			while(N % i == 0) { //N이 i로 나눠지는 동안
				sb.append(i + "\n");
				N /= i;
			}
		}
		
		/*
		 * ex) N이 6인 경우, i=2까지만 위의 for문이 진행되기 때문에
		 * sb에 N(=3)을 append해줘야 한다.
		 * 그리고 N이 원래 2 or 3인 경우에도 위의 for문에 못들어가므로 밑의 if문이 필요하다.
		 */
		
		if(N!=1)
			sb.append(N);
		
		System.out.println(sb);
		
	}

}

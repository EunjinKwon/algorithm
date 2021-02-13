package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Main_1929 {
	
	public static boolean prime[];

	public static void main(String[] args) throws IOException {
		//M�̻� N������ �Ҽ��� ��� ����ϴ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		prime = new boolean[N+1];
		primeNum(); //�Ҽ����ϱ� �Լ�
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=M; i<=N; i++) {
			if(!prime[i]) //�Ҽ��̸�
				sb.append(i + "\n");
		}
		
		System.out.print(sb);

	}
	
	//�����佺�׳׽��� ü
	public static void primeNum() {
		//�Ҽ��� �ƴϸ� true; �Ҽ��� false
		prime[0] = true;
		prime[1] = true;
		
		for(int i=2; i<=Math.sqrt(prime.length); i++) {
			if(prime[i]) continue; //�̹� ü�� �ɷ������� continue
			for(int j=i*i; j<prime.length; j+=i) {
				prime[j] = true;
			}
		}
	}

}

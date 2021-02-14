package baekjoon;

import java.io.*;

public class Main_4948 {
	//����Ʈ�� ���� ����(n���� ũ��, 2n���� �۰ų� ���� �Ҽ��� ����

	public static boolean prime[]; 
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			int n = Integer.parseInt(br.readLine());
			if(n == 0) //0�̸� ����
				break;
			
			prime = new boolean[2*n+1];
			int cnt = 0; //�Ҽ� ����
			
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
	//�����佺�׳׽��� ü
	public static void primeNum() {
		//�Ҽ��� �ƴϸ� true �Ҽ��̸� false
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

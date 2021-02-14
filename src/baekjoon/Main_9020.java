package baekjoon;
import java.io.*;

public class Main_9020 {
	//�������� ����(2���� ū ��� ¦���� �� �Ҽ��� ������ ��Ÿ�� �� �ִ�)
	
	public static boolean[] prime = new boolean[10001];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		primeNum();
		
		for(int i=0; i<T; i++) {
			
			int n = Integer.parseInt(br.readLine());
			int p = n / 2;
			int q = n / 2;
			
			while(true) {
				if(prime[p] == false && prime[q] == false) {
					sb.append(p + " " + q + "\n");
					break;
				}
				p--;
				q++;
			}
			
		}
		System.out.println(sb);

	}
	
	//�����佺�׳׽��� ü
	public static void primeNum() {
		//�Ҽ��̸� false, �Ҽ��� �ƴϸ� true
		prime[0] = prime[1] = true;
		
		for(int i=2; i<=Math.sqrt(prime.length); i++) {
			if(prime[i]) continue;
			for(int j=i*i; j<prime.length; j+=i) {
				prime[j] = true;
			}
		}
	}

}

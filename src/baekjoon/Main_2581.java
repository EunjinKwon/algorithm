package baekjoon;

import java.io.*;

public class Main_2581 {

	public static boolean prime[];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		//M�̻� N������ �ڿ��� �� �Ҽ��� ���� ��� ��� �̵� �Ҽ��� �հ� �ּڰ��� ã�� ����
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		
		prime = new boolean[N+1];
		primeNum();
		
		int sum = 0; //�Ҽ��� ��
		int min = -1; //M~N ���̿��� ���� �� ���� ���� �ʱ�ȭ
		
		for(int i=M; i<=N; i++) {
			if(!prime[i]) {
				sum += i;
				if(min == -1) //ó�� if�� ������ ������ ��
					min = i;
			}
		}
		
		if(sum == 0) //�Ҽ��� ������ -1���
			System.out.println(-1);
		
		else {
			System.out.println(sum);
			System.out.println(min);
		}
		
		
	}
	
	public static void primeNum() {
		//true�� �Ҽ�X, false�� �Ҽ�
		prime[0] = true;
		prime[1] = true;
		
		//�����佺�׳׽��� ü �˰���
		for(int i=2; i<=Math.sqrt(prime.length); i++) {
			if(prime[i]) continue; //�̹� �Ҽ��� �ƴѰɷ� �ɷ������� continue
			for(int j=i*i; j<prime.length; j+=i) {
				prime[j] = true;
			}
		}
		
	}
}

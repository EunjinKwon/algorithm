package baekjoon;

import java.io.*;

public class Main_11653 {

	public static void main(String[] args) throws IOException {
		//N�� ���μ������ϴ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
/*���� ��ȿ������ ���		
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
			
			if(num % d == 0) { //d�� num�� ����̸�
				num /= d; //��� �������� num�� 1�� �Ǹ� �� ������ while���� ����������.
				sb.append(d+"\n");
				isPrime = false; //�� ���̶� �� if���� ��������� N�� �Ҽ��� �ƴϴ�.
			}
			else
				d++;
			
			if(isPrime == true && d == N) { //�Ҽ��� ��
				sb.append(d+"\n");
				break;
			}
		}
		
		System.out.println(sb);
*/
		
		
//�� ȿ������ ���!!
		
		for(int i=2; i*i<=N; i++) { //N�� ������ ������ Ž���Ѵ�.
			while(N % i == 0) { //N�� i�� �������� ����
				sb.append(i + "\n");
				N /= i;
			}
		}
		
		/*
		 * ex) N�� 6�� ���, i=2������ ���� for���� ����Ǳ� ������
		 * sb�� N(=3)�� append����� �Ѵ�.
		 * �׸��� N�� ���� 2 or 3�� ��쿡�� ���� for���� �����Ƿ� ���� if���� �ʿ��ϴ�.
		 */
		
		if(N!=1)
			sb.append(N);
		
		System.out.println(sb);
		
	}

}

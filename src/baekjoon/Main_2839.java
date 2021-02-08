package baekjoon;

import java.io.*;

public class Main_2839 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//5�� 3�� �ּ� Ƚ���� ���Ͽ� N�� ����� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		//��Ģ�� ã�ƾ� �Ѵ�.
		if (n == 4 || n == 7) { // 1. n�� 4 �Ǵ� 7�� ���
			System.out.println(-1);
		}
		else if (n % 5 == 0) { // 2. n�� 5�� ����� ���
			System.out.println(n / 5);
		}
		else if (n % 5 == 1 || n % 5 == 3) { // 3. n�� 5�� ���+1 �Ǵ� 5�� ���+3�� ���
			System.out.println((n / 5) + 1);
		}
		else if (n % 5 == 2 || n % 5 == 4) { // 4. n�� 5�� ���+2 �Ǵ� 5�� ���+4�� ���
			System.out.println((n / 5) + 2);
		}
	}

}

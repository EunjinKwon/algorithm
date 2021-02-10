package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Main_1978 {

	public static void main(String[] args) throws IOException {
		//�־��� �� N�� �߿��� �Ҽ��� �� ������ ã�Ƽ� ����ϴ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int cnt = 0;
		
		while(st.hasMoreTokens()) {
			
			boolean isPrime = true; //�Ҽ��̸� true, �ƴϸ� false
			int num = Integer.parseInt(st.nextToken());
			
			if(num == 1)
				continue;
			
			for(int i=2; i<=Math.sqrt(num); i++) {
				if(num % i == 0) {
					isPrime = false;
					break;
					}
				}
			
			if(isPrime == true) //���� for���� ����� true��� �Ҽ�
				cnt++;
			
		}
		System.out.println(cnt);
		

	}

}

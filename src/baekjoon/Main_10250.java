package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Main_10250 {

	public static void main(String[] args) throws IOException {
		//ȣ�� �� ��ȣ�� ��Ģ�� ã�� ����ϴ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int H = Integer.parseInt(st.nextToken()); //ȣ���� �� ��
			int W = Integer.parseInt(st.nextToken()); //�� ���� �� ��
			int N = Integer.parseInt(st.nextToken()); //N��° �մ�
			
			int guestH; //�մ��� ������ ��
			int guestW; //�մ��� ������ ȣ
			
			if(N % H == 0) { //N�� ������ ����� ��
				guestH = H * 100;
				guestW = N / H;
			}
				
			else {
				guestH = (N % H) * 100;
				guestW = N / H + 1;
			}
			
			System.out.println(guestH + guestW);
			
			/*�Ʒ��� ���� guestH�� guestW�� ������ ������ �ʰ� �ٷ� ����� ���� �ִ�.
			 * 
			 * if(N % H == 0){
			 * System.out.println(H*100 + N/H);
			 * }
			 * else{
			 * System.out.println(((N % H) * 100) + (( N / H ) + 1));
			 *} 
			 *
			 *�׸��� StringBuilder�� ����ؼ� �׽�Ʈ���̽��� ����� �ѹ��� ����� ���� �ִ�.
			 */
			
		}
		
	}
		
}

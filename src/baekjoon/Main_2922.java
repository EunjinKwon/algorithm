package baekjoon;
import java.io.*;

public class Main_2922 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//������ �����Ǵ� ��Ģ�� ���� ������ ��ġ�� ���ϴ� ����
		//1,7(+6),19(+12),37(+18),61(+24)...�� ����Ǵ� �����̴�. �������� ���������� �̷�� �ִ�.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int cnt = 1;
		int range = 2; 
		
		if(N == 1)
			System.out.println(1);
		
		else {
			while(range<=N) {
				range += cnt*6;
				cnt++;
			}
			System.out.println(cnt);
		}
		

	}

}

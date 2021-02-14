package baekjoon;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_1085 {
	//���簢���� ���� �Ÿ��� ���ϴ� ����

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		int d1 = Math.min(x, w - x); //x�� �ּҰŸ�
		int d2 = Math.min(y, h - y); //y�� �ּҰŸ�
		
		System.out.println(Math.min(d1, d2)); //�� �Ÿ� �� �ּҰŸ�
		
		
	}

}

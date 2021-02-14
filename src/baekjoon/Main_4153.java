package baekjoon;
import java.io.*;
//import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_4153 {
	//�� ���� �����ﰢ���� �̷�� �� ���ϴ� ����
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
							
			if(a == 0 && b == 0 && c == 0)
				break;
			
			if((a*a + b*b) == c*c) //c�� ���� �� ���� ��
				sb.append("right\n");
			
			else if((b*b + c*c) == a*a) //a�� ���� �� ���� ��
				sb.append("right\n");
			
			else if((a*a + c*c) == b*b) //b�� ���� �� ���� ��
				sb.append("right\n");
			
			/*
			 *�迭�� ����, �����ؼ� �ϴ� ����� ����
			 *int[] arr = {a,b,c};
			 *Arrays.sort(arr);
			 *if((arr[0]*arr[0] + arr[1]*arr[1]) == arr[2]*arr[2])
			 *	sb.append("right\n");
			 */
						
			else
				sb.append("wrong\n");
		}
		
		System.out.println(sb);
	}

}

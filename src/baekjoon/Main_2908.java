package baekjoon;
import java.io.*;
import java.util.*;

public class Main_2908 {

	public static void main(String[] args) throws IOException {
		//���ڸ� ����� ���ϴ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		String s1 = "";
		String s2 = "";
		
		for(int i=0; i<3; i++) {
			s1 += str[0].charAt(2-i);
			s2 += str[1].charAt(2-i);
		}
		
		int num1 = Integer.parseInt(s1);
		int num2 = Integer.parseInt(s2);
		
		/* �ٸ� Ǯ�� ��� StringBuilder.reverse() ���
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
		int num1 = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		int num2 = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		
		 */
				
		System.out.print(num1 > num2 ? num1 : num2);
		
	}

}

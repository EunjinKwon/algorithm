package baekjoon;
import java.io.*;

public class Main_10872 {
	//��͸� �̿��ؼ� N!�� ����ϴ� ����
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		System.out.println(factorial(N));
		
	}
	
	//n!�� ���ϴ� �Լ�
	public static int factorial(int n) {
		if(n == 0)
			return 1;
		
		else
			return n * factorial(n-1);
	}

}

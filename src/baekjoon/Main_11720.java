package baekjoon;
import java.util.Scanner;

public class Main_11720 {

	public static void main(String[] args) {
		//������ ���ڿ��� �Է¹޴� ����
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String a = sc.next();
		int total = 0;
		sc.close();
		
		for(int i=0; i<n; i++) {
			total += a.charAt(i) - '0';
		}
		System.out.println(total);

	}

}

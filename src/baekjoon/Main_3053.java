package baekjoon;
import java.io.*;

public class Main_3053 {
	//��Ŭ���� �����а� �ý� �����п� ���� ����
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double R = Double.parseDouble(br.readLine());
		
		//��Ŭ���� �����п����� ���� ���� = PI*r^2
		//�ý� �����п����� ���� ���� = 2*r^2
		
		System.out.println(R * R * Math.PI);
		System.out.println(2 * R * R);
		
	}
}

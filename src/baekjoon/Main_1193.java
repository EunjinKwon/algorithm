package baekjoon;
import java.io.*;

public class Main_1193 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//�м��� �������� ��Ģ�� ã�� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine()); // X��°
		
		int n = 0; //��� ° �׷�(�밢��)����
		int range = 0; //��� �������� ��
		
		while(range < X) {
			n++; 
			range += n;
		}
		
		int i = X - (range - n); //���ϴ� ���� n��° �밢������ i��° �м�
		
		if(n%2 == 0) //¦����° �밢���� ��
			System.out.println(i + "/" + (n+1-i)); //���ڿ� �и��� ���� n+1���� �����ϴ�.
		else //Ȧ����° �밢���� ��
			System.out.println((n+1-i) + "/" + i); //���ڿ� �и��� ���� n+1���� �����ϴ�.
		
	}

}

package baekjoon;
import java.io.*;

public class Main_3009 {
//�� ���� �־����� ��, �࿡ ������ ���簢���� ����� ���ؼ� �ʿ��� �� ��° ���� ã�� ����
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] point_1 = br.readLine().split(" ");
		String[] point_2 = br.readLine().split(" ");
		String[] point_3 = br.readLine().split(" ");
		
		String x;
		String y;
		
		//x��ǥ ���ϱ�
		if(point_1[0].equals(point_2[0]))
			x = point_3[0];
		
		else if(point_1[0].equals(point_3[0]))
			x = point_2[0];
		
		else
			x = point_1[0];
		
		//y��ǥ ���ϱ�
		if(point_1[1].equals(point_2[1]))
			y = point_3[1];
		
		else if(point_1[1].equals(point_3[1]))
			y = point_2[1];
		
		else
			y = point_1[1];
		
		System.out.println(x + " " + y);
		

	}

}

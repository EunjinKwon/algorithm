package baekjoon;
import java.io.*;

public class Main_3009 {
//세 점이 주어졌을 때, 축에 평행한 직사각형을 만들기 위해서 필요한 네 번째 점을 찾는 문제
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] point_1 = br.readLine().split(" ");
		String[] point_2 = br.readLine().split(" ");
		String[] point_3 = br.readLine().split(" ");
		
		String x;
		String y;
		
		//x좌표 비교하기
		if(point_1[0].equals(point_2[0]))
			x = point_3[0];
		
		else if(point_1[0].equals(point_3[0]))
			x = point_2[0];
		
		else
			x = point_1[0];
		
		//y좌표 비교하기
		if(point_1[1].equals(point_2[1]))
			y = point_3[1];
		
		else if(point_1[1].equals(point_3[1]))
			y = point_2[1];
		
		else
			y = point_1[1];
		
		System.out.println(x + " " + y);
		

	}

}

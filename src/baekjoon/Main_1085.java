package baekjoon;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_1085 {
	//직사각형과 점의 거리를 구하는 문제

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		int d1 = Math.min(x, w - x); //x축 최소거리
		int d2 = Math.min(y, h - y); //y축 최소거리
		
		System.out.println(Math.min(d1, d2)); //두 거리 중 최소거리
		
		
	}

}

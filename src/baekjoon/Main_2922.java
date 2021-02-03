package baekjoon;
import java.io.*;

public class Main_2922 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//벌집이 형성되는 규칙에 따라 벌집의 위치를 구하는 문제
		//1,7(+6),19(+12),37(+18),61(+24)...로 진행되는 수열이다. 증가값이 등차수열을 이루고 있다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int cnt = 1;
		int range = 2; 
		
		if(N == 1)
			System.out.println(1);
		
		else {
			while(range<=N) {
				range += cnt*6;
				cnt++;
			}
			System.out.println(cnt);
		}
		

	}

}

package baekjoon;
import java.io.*;

public class Main_1193 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//분수의 순서에서 규칙을 찾는 문제
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine()); // X번째
		
		int n = 0; //몇번 째 그룹(대각선)인지
		int range = 0; //요소 개수들의 합
		
		while(range < X) {
			n++; 
			range += n;
		}
		
		int i = X - (range - n); //구하는 것은 n번째 대각선에서 i번째 분수
		
		if(n%2 == 0) //짝수번째 대각선일 때
			System.out.println(i + "/" + (n+1-i)); //분자와 분모의 합이 n+1으로 일정하다.
		else //홀수번째 대각선일 때
			System.out.println((n+1-i) + "/" + i); //분자와 분모의 합이 n+1으로 일정하다.
		
	}

}

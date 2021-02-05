package baekjoon;

import java.io.*;

public class Main_2775 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//층과 거주자 수의 규칙을 찾는 문제
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine()); //테스트케이스 개수
		
		for(int cnt=0; cnt<T; cnt++) {
			
			int[][] apart = new int[15][15]; //사람수를 저장할 아파트 배열

			int k = Integer.parseInt(br.readLine()); //층
			int n = Integer.parseInt(br.readLine()); //호
			
			for(int i=0; i<=k; i++) { //0층~k층까지 for문
				for(int j=1; j<=n; j++ ) { //1호~n호까지 for문
					if(i == 0)  //0층 j호에는 j명이 산다.
						apart[i][j] = j;
					
					else {
						for(int h=1; h<=j;h++) //i층j호에 사는 사람수는 (i-1)층 1~j호에 사는 사람수의 합
							apart[i][j] += apart[i-1][h];
					}
				}
				
			}
			
			System.out.println(apart[k][n]);
		}

	}

}

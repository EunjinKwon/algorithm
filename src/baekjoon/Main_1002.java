package baekjoon;
import java.io.*;
import java.util.StringTokenizer;

public class Main_1002 {
	//두 원의 교점의 개수를 구하는 문제
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int r1 = Integer.parseInt(st.nextToken());
 
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int r2 = Integer.parseInt(st.nextToken());
			
			sb.append(contact_point(x1, y1, r1, x2, y2, r2) + "\n");
			
		}
		System.out.println(sb);
		
	}
	
	//두 원의 교점의 개수를 구하는 함수
	public static int contact_point(int x1, int y1, int r1, int x2, int y2, int r2) {
		
		int distance_pow =(int)(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2)); //중점 사이의 거리의 제곱
		
		//중점이 같으면서 반지름도 같을 때(겹치는 좌표가 무한개)
		if(x1 == x2 && y1 == y2 && r1 == r2)
			return -1;
		
		//한 원이 다른 원 안에 있을 때(내접X)
		else if(distance_pow < Math.pow(r1-r2, 2))
			return 0;
		
		//두 원이 멀리 떨어져서 만나지 않을 때
		else if(distance_pow > Math.pow(r1+r2, 2))
			return 0;
		
		//내접할 때
		else if(distance_pow == Math.pow(r1-r2, 2))
			return 1;
		
		//외접할 때
		else if(distance_pow == Math.pow(r1+r2, 2))
			return 1;
		
		else //이 외의 경우는 원이 두 지점에서 만난다.
			return 2;
	}

}

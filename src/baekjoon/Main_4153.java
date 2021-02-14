package baekjoon;
import java.io.*;
//import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_4153 {
	//세 점이 직각삼각형을 이루는 지 구하는 문제
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
							
			if(a == 0 && b == 0 && c == 0)
				break;
			
			if((a*a + b*b) == c*c) //c가 가장 긴 변일 때
				sb.append("right\n");
			
			else if((b*b + c*c) == a*a) //a가 가장 긴 변일 때
				sb.append("right\n");
			
			else if((a*a + c*c) == b*b) //b가 가장 긴 변일 때
				sb.append("right\n");
			
			/*
			 *배열로 저장, 정렬해서 하는 방법도 가능
			 *int[] arr = {a,b,c};
			 *Arrays.sort(arr);
			 *if((arr[0]*arr[0] + arr[1]*arr[1]) == arr[2]*arr[2])
			 *	sb.append("right\n");
			 */
						
			else
				sb.append("wrong\n");
		}
		
		System.out.println(sb);
	}

}

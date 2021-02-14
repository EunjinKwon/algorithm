package baekjoon;
import java.io.*;

public class Main_3053 {
	//유클리드 기하학과 택시 기하학에 대한 문제
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double R = Double.parseDouble(br.readLine());
		
		//유클리드 기하학에서의 원의 넓이 = PI*r^2
		//택시 기하학에서의 원의 넓이 = 2*r^2
		
		System.out.println(R * R * Math.PI);
		System.out.println(2 * R * R);
		
	}
}

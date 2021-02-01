package baekjoon;
import java.io.*;
import java.util.StringTokenizer;

public class Main_1152 {

	public static void main(String[] args) throws IOException {
		//단어의 개수를 구하는 문제
		BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		System.out.print(st.countTokens());
		
	}

}
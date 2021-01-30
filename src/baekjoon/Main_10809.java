package baekjoon;
import java.io.*;

public class Main_10809 {

	public static void main(String[] args) throws IOException {
		//한 단어에서 각 알파벳이 처음 등장하는 위치를 찾는 문제
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] alphabet = new int[26];
		String s = br.readLine();
		
		for(int i=0; i<alphabet.length; i++) {
			alphabet[i] = -1; // -1로 배열 초기화
		}
		
		for(int i=0; i<s.length(); i++) {
			if(alphabet[s.charAt(i)-'a'] == -1) { //처음 등장하는 위치이므로 -1일때만 적용
				alphabet[s.charAt(i)-'a'] = i; 
			}
		}
		
		for(int i=0; i<alphabet.length; i++) {
			System.out.print(alphabet[i]+ " ");
		}
		

	}

}

package baekjoon;
import java.io.*;

public class Main_1157 {

	public static void main(String[] args) throws IOException {
		//주어진 단어에서 가장 많이 사용된 알파벳을 출력하는 문제
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] alphabet = new int[26]; //알파벳 개수를 저장하는 배열
		String s = br.readLine(); //단어 입력
		s = s.toUpperCase(); //단어를 대문자로 변경

		for(int i=0; i<s.length(); i++) {
			alphabet[s.charAt(i)-'A']++; //i번째 알파벳 개수 배열을 +1
		}
		
		int max = -1;
		char answer = '?'; //가장 많이 사용된 알파벳을 저장
				
		for(int i=0; i<alphabet.length; i++) {
			if(max < alphabet[i]) {
				max = alphabet[i];
				answer = (char) (i + 'A');
			}
			else if(max == alphabet[i]) {
				answer = '?'; //가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 '?'으로 다시 할당
			}
		}
		
		System.out.println(answer);
		
		

	}

}

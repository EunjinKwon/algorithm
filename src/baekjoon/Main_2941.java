package baekjoon;
import java.io.*;

public class Main_2941 {

	public static void main(String[] args) throws IOException {
		//크로아티아 알파벳의 개수를 세는 문제
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int cnt = 0; //알파벳의 개수
		int len = s.length();
		
		for(int i=0; i<len; i++) {
			
			char ch = s.charAt(i);
						
			if(ch == 'c' && i < len - 1) { //c=이거나 c-일 때
				if(s.charAt(i+1) == '=' || s.charAt(i+1) == '-')
					i++; // =이나 -까지가 한 단어이므로 i를 1증가
				}
			else if(ch == 'd' && i < len - 1) {
				if(s.charAt(i+1) == '-') //d-일 때
					i++;
				else if(s.charAt(i+1) == 'z' && i < len - 2) { //dz= 일 때 
					if(s.charAt(i+2) == '=')
						i += 2;
				}
			}
			else if(ch == 'l' && i < len - 1) {
				if(s.charAt(i+1) == 'j')
					i++;
			}
			else if(ch == 'n' && i < len - 1) {
				if(s.charAt(i+1) == 'j')
					i++;
			}
			else if(ch == 's' && i < len - 1) {
				if(s.charAt(i+1) == '=')
					i++;
			}
			else if(ch == 'z' && i < len - 1) {
				if(s.charAt(i+1) == '=')
					i++;
			}
			//위에 해당하지 않으면 글자 하나가 한 단어에 해당
			cnt++; //단어 개수 증가
			
		}
		System.out.println(cnt);

	}

}

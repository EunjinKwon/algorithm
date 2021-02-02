package baekjoon;
import java.io.*;

public class Main_1316 {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws NumberFormatException, IOException {
		//조건에 맞는 문자열을 찾는 문제
		int N = Integer.parseInt(br.readLine()); //단어의 개수 N
		int cnt = 0; //그룹 단어의 개수
		
		for(int i=0; i<N; i++) {
			if(check() == true)
				cnt++;
		}
		System.out.println(cnt);

	}
	
	public static boolean check() throws IOException {
		boolean[] check = new boolean[26];
		String s = br.readLine();
		int prev = 0;

		for(int i=0; i<s.length(); i++) {
			int now = s.charAt(i); //현재 문자
			
			if(now != prev) { //이전 문자와 현재 문자가 다를 때.그룹 단어가 바뀔 때
				if(check[now - 'a'] == false) {//처음 나오는 문자이면
					check[now - 'a'] = true; //true로 바꿔준다
					prev = now; //prev를 now로 변경해준다ㅣ
					}
				else {
					return false; //check[now-'a']가 true이면 그룹단어가 아닌 경우이다.
					}
				}
			//이전 문자와 현재 문자가 같을 때는 continue
			}
		
		return true;
		}

}

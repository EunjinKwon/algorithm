package baekjoon;

import java.io.*;

public class Main_2775 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//���� ������ ���� ��Ģ�� ã�� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine()); //�׽�Ʈ���̽� ����
		
		for(int cnt=0; cnt<T; cnt++) {
			
			int[][] apart = new int[15][15]; //������� ������ ����Ʈ �迭

			int k = Integer.parseInt(br.readLine()); //��
			int n = Integer.parseInt(br.readLine()); //ȣ
			
			for(int i=0; i<=k; i++) { //0��~k������ for��
				for(int j=1; j<=n; j++ ) { //1ȣ~nȣ���� for��
					if(i == 0)  //0�� jȣ���� j���� ���.
						apart[i][j] = j;
					
					else {
						for(int h=1; h<=j;h++) //i��jȣ�� ��� ������� (i-1)�� 1~jȣ�� ��� ������� ��
							apart[i][j] += apart[i-1][h];
					}
				}
				
			}
			
			System.out.println(apart[k][n]);
		}

	}

}

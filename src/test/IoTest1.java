package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IoTest1 {
	public static void main(String[] args) throws IOException {
		char c;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do {
			c = (char) br.read();
			System.out.print(c);
			
		}while(c !='q');
	}
}

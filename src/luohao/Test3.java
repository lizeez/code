package luohao;

import java.io.UnsupportedEncodingException;

public class Test3 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String s1 = "ÄãºÃ";
		String s2 = new String(s1.getBytes("GB2312"), "ISO-8859-1");
		System.out.println(s1);
		System.out.println(s2);
	}
}
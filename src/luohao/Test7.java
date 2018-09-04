package luohao;

import java.io.File;
public class Test7 {
	public static void main(String[] args) {
		File f = new File("/User/Hao/Downloads");
		for(File temp : f.listFiles()) {
			if(temp.isFile()) {
				System.out.println(temp.getName());
			}
		}
	}
}

package luohao;

import java.io.File;

public class Test8 {
	public static void main(String[] args) {
		showDirectory(new File("/User/Hao/Downloads"));
	}

	public static void showDirectory(File file) {
		// TODO Auto-generated method stub
		walkDirectory(file, 0);
	}

	public static void walkDirectory(File file, int level) {
		// TODO Auto-generated method stub
		if(file.isDirectory()) {
			for(File temp: file.listFiles()) {
				walkDirectory(temp, level + 1);
			}
		}else {
			for(int i=0; i<level-1; i++) {
				System.out.print("\t");
			}
			System.out.println(file.getName());
		}
	}
}

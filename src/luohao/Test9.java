package luohao;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;


public class Test9 {
	public static void main(String[] args) throws IOException {
		Path initPath = Paths.get("/User/Hao/Downloads");
		Files.walkFileTree(initPath, new SimpleFileVisitor<Path>() {
			
			@Override
			public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)throws IOException{
				System.out.println(file.getFileName().toString());
				return FileVisitResult.CONTINUE;
			}
		});
	}
}

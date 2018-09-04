package luohao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Test5 {
	private Test5() {
		throw new AssertionError();
	}
	
	public static void fileCopy(String source, String target) throws IOException {
		try(InputStream in = new FileInputStream(source)){
			try(OutputStream out = new FileOutputStream(target)){
				byte[] buffer = new byte[4096];
				int bytesTORead;
				while((bytesTORead = in.read(buffer))!=-1) {
					out.write(buffer, 0, bytesTORead);
				}
			}
		}
		
	}
	
	public static void fileCopyNIO(String source, String target) throws IOException {
		try(FileInputStream in = new FileInputStream(source)){
			try(FileOutputStream out = new FileOutputStream(target)){
				FileChannel inChannel = in.getChannel();
				FileChannel outChannel = out.getChannel();
				ByteBuffer buffer = ByteBuffer.allocate(4096);
				while(inChannel.read(buffer) != -1) {
					buffer.flip();
					outChannel.write(buffer);
					buffer.clear();
					
				}
			}
		}
	}
}

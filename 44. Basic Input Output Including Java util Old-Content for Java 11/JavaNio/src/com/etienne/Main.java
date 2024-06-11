package com.etienne;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		try (FileOutputStream binFile = new FileOutputStream("filesoldjava11/data.dat");
			 FileChannel binChannel = binFile.getChannel()) {

			byte[] outputBytes = "Hello World!".getBytes();
			ByteBuffer buffer = ByteBuffer.allocate(outputBytes.length);
			buffer.put(outputBytes);

			buffer.flip();
			int numBytes = binChannel.write(buffer);
			System.out.println("numBytes written was : " + numBytes);

			ByteBuffer intBuffer = ByteBuffer.allocate(Integer.BYTES);
			intBuffer.putInt(245);
			intBuffer.flip();
			numBytes = binChannel.write(intBuffer);
			System.out.println("numBytes written was: " + numBytes);

			intBuffer.flip();
			intBuffer.putInt(-98765);
			intBuffer.flip();
			numBytes = binChannel.write(intBuffer);
			System.out.println("numBytes written was: " + numBytes);
			// Write NIO : FileInputStream - Path without try resources
			// FileInputStream file = new FileInputStream("filesoldjava11/data.txt");
			// FileChannel channel = file.getChannel();

			// Path dataPath = FileSystems.getDefault().getPath("filesoldjava11/data.txt");
			// Files.write(dataPath, "\nLine 5".getBytes("UTF-8"), StandardOpenOption.APPEND);
			// List<String> lines = Files.readAllLines(dataPath);
			// for (String line : lines) {
			//	System.out.println(line);
			// }

			// Reading NIO
			RandomAccessFile ra = new RandomAccessFile("filesoldjava11/data.dat", "rwd");
			FileChannel channel = ra.getChannel();
			outputBytes[0] = 'a';
			outputBytes[1] = 'b';
			buffer.flip();
			long numBytesRead = channel.read(buffer);
			if (buffer.hasArray()) {
				System.out.println("outputBytes = " + new String(outputBytes));
				//System.out.println("Byte buffer = " + new String(buffer.array()));

			}

			// Absolute Read

			intBuffer.flip();
			numBytesRead = channel.read(intBuffer);
			System.out.println(intBuffer.getInt(0));
			intBuffer.flip();
			numBytesRead = channel.read(intBuffer);
			intBuffer.flip();
			System.out.println(intBuffer.getInt(0));
			System.out.println(intBuffer.getInt());

			// Relative Read
			/*intBuffer.flip();
			numBytesRead = channel.read(intBuffer);
			intBuffer.flip();
			System.out.println(intBuffer.getInt());
			intBuffer.flip();
			numBytesRead = channel.read(intBuffer);
			intBuffer.flip();
			System.out.println(intBuffer.getInt());*/

			channel.close();
			ra.close();

			/*RandomAccessFile ra = new RandomAccessFile("filesoldjava11/data.dat", "rwd");
			byte[] b = new byte[outputBytes.length];
			ra.read(b);
			System.out.println(new String(b));

			long int1 = ra.readInt();
			long int2 = ra.readInt();
			System.out.println(int1);
			System.out.println(int2);*/
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

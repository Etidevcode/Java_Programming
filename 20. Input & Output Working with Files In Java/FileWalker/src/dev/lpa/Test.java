package dev.lpa;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class Test {

	public static void main(String[] args) {

		Path startingPath = Path.of("..");
		try {
			Files.walkFileTree(startingPath, new SimpleFileVisitor<>() {
				@Override
				public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
					if (file.toString().contains("$Recycle.Bin")) {
						return FileVisitResult.CONTINUE;
					}
					System.out.println(file);
					// Your processing logic here
					return FileVisitResult.CONTINUE;
				}

				@Override
				public FileVisitResult visitFileFailed(Path file, IOException exc) {
					// Handle access denial exceptions here
					System.err.println("Access denied to file: " + file);
					return FileVisitResult.CONTINUE;
				}
			});
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

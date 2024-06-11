package com.etienne;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class Main {

	public static void main(String[] args) {

		try {

			// Delete

			Path fileToDelete = FileSystems.getDefault().getPath("filesoldjava11", "Examples", "Dir1", "file1copy.txt");
			// Files.delete(fileToDelete);
			Files.deleteIfExists(fileToDelete);

			// Move And Rename
			/*
			Path fileToMove = FileSystems.getDefault().getPath("filesoldjava11", "Examples", "file1.txt");
			Path destination = FileSystems.getDefault().getPath("filesoldjava11", "Examples", "file2.txt");
			Files.move(fileToMove, destination);
			*/

			// Copy
			/*
			Path sourceFile = FileSystems.getDefault().getPath("filesoldjava11", "Examples", "file1.txt");
			Path copyFile = FileSystems.getDefault().getPath("filesoldjava11", "Examples", "file1copy.txt");
			Files.copy(sourceFile, copyFile, StandardCopyOption.REPLACE_EXISTING);
			//Files.copy(sourceFile, copyFile);
			sourceFile = FileSystems.getDefault().getPath("filesoldjava11", "Examples", "Dir1");
			copyFile = FileSystems.getDefault().getPath("filesoldjava11", "Examples", "Dir4");
			Files.copy(sourceFile, copyFile, StandardCopyOption.REPLACE_EXISTING);
			*/


		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}

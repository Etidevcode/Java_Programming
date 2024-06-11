package com.etienne;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class Main {

	public static void main(String[] args) {

		/*

		DirectoryStream.Filter<Path> filter =
				new DirectoryStream.Filter<Path>() {
					@Override
					public boolean accept(Path path) throws IOException {
						return (Files.isRegularFile(path));
					}
				};

				*/

		DirectoryStream.Filter<Path> filter = p -> Files.isRegularFile(p);

		// Path directory = FileSystems.getDefault().getPath("filesoldjava11", "FileTree/Dir2");
		Path directory = FileSystems.getDefault().getPath("filesoldjava11", "FileTree" + File.separator,"Dir2");
		try (DirectoryStream<Path> contents = Files.newDirectoryStream(directory, filter)) {
			for (Path file : contents) {
				System.out.println(file.getFileName());
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		String separator = File.separator;
		System.out.println(separator);
		separator = FileSystems.getDefault().getSeparator();
		System.out.println(separator);

		try {
			Path tempFile = Files.createTempFile("myapp", ".appext");
			System.out.println("Temporary file path = " + tempFile.toAbsolutePath());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("**".repeat(30));
		Iterable<FileStore> stores = FileSystems.getDefault().getFileStores();
		for (FileStore store : stores) {
			System.out.println("Volume name/Drive letter = " + store);
			System.out.println("file store = " + store.name());
		}

		System.out.println("**".repeat(30));
		Iterable<Path> rootPaths = FileSystems.getDefault().getRootDirectories();
		for (Path path : rootPaths) {
			System.out.println(path);
		}

		System.out.println("**".repeat(30));
		System.out.println("---- Walking Tree for Dir2 ----");
		System.out.println("**".repeat(30));
		Path dir2Path = FileSystems.getDefault().getPath("filesoldjava11/FileTree" + File.separator + "Dir2");
		try {
			Files.walkFileTree(dir2Path, new PrintName());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("**".repeat(30));
		System.out.println("---- Copy Dir2 to Dir4/Dir2Copy----");
		System.out.println("**".repeat(30));
		Path copyPath = FileSystems.getDefault().getPath("filesoldjava11/FileTree" + File.separator + "Dir4" + File.separator + "Dir2Copy");
		try {
			Files.walkFileTree(dir2Path, new CopyFiles(dir2Path, copyPath));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("**".repeat(30));
		System.out.println("----- Mapping IO and NIO Methods----");
		System.out.println("**".repeat(30));

		File file = new File("/filesoldjava11/Examples/file.txt");
		Path convertedFile = file.toPath();
		System.out.println("convertedFile = " + convertedFile);

		File parent = new File("/filesoldjava11/Examples");
		File resolvedFile = new File(parent, "dir/file.txt");
		System.out.println("resolvedPath = " + resolvedFile);

		resolvedFile = new File("/filesoldjava11/Examples", "dir/file.txt");
		System.out.println(resolvedFile.toPath());


		Path parentPath = Paths.get("/filesoldjava11/Examples");
		Path childRelativePath = Paths.get("dir/file.txt");;
		System.out.println(parentPath.resolve(childRelativePath));

		File workingDirectory = new File("").getAbsoluteFile();
		System.out.println("Working directory = " + workingDirectory.getAbsolutePath());

		System.out.println("**".repeat(30));
		System.out.println("----- Print Dir2 contents using list() ----");
		System.out.println("**".repeat(30));
		File dir2File = new File(workingDirectory, "/filesoldjava11/FileTree/Dir2");
		String[] dir2Contents = dir2File.list();
		for (int i = 0; i < dir2Contents.length; i++) {
			System.out.println("i = " + i + ": " + dir2Contents[i]);
		}

		System.out.println("**".repeat(30));
		System.out.println("----- Print Dir2 contents using listFiles() ----");
		System.out.println("**".repeat(30));
		File[] dir2Files = dir2File.listFiles();
		for (int i = 0; i < dir2Files.length; i++) {
			System.out.println("i = " + i + ": " + dir2Files[i].getName());
		}
	}
}

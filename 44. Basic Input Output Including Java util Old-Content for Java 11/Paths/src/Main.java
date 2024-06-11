import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

	public static void main(String[] args) {

		Path path = FileSystems.getDefault().getPath("filesoldjava11", "WorkingDirectoryFile.txt");
		printFile(path);
		System.out.println("-".repeat(60));
		// Path filePath = FileSystems.getDefault().getPath("filesoldjava11/files", "SubDirectoryFile.txt");
		Path filePath = Paths.get("filesoldjava11/files", "SubDirectoryFile.txt");
		printFile(filePath);
		System.out.println("-".repeat(60));
		// filePath = Paths.get("filesoldjava11", "OutThere.txt");
		filePath = Paths.get("C:/Java-Programming-Masterclass-updated-to-java17","/filesoldjava11", "OutThere.txt");
		printFile(filePath);
		System.out.println("-".repeat(60));
		filePath = Paths.get("filesoldjava11", ".");
		System.out.println(filePath.toAbsolutePath());
		System.out.println("-".repeat(60));
		Path path2 = FileSystems.getDefault().getPath(".","filesoldjava11", "..", "files", "SubDirectoryFile.txt");
		System.out.println(path2.normalize().toAbsolutePath());
		System.out.println(path2.normalize());

		System.out.println("-".repeat(60));
		Path path3 = FileSystems.getDefault().getPath("filesoldjava11","thisfiledoesntexist.txt");
		System.out.println(path3.normalize());

		System.out.println("-".repeat(60));
		Path path4 = Paths.get("C:/Java-Programming-Masterclass-updated-to-java17", "/filesoldjava11", "wathever.txt");
		System.out.println(path4.toAbsolutePath());

		System.out.println("-".repeat(60));
		filePath = FileSystems.getDefault().getPath("filesoldjava11", "files");
		System.out.println("Exists = " + Files.exists(filePath));
		System.out.println("Exists = " + Files.exists(path4));
	}

	public static void printFile(Path path) {
		try  (BufferedReader fileReader = Files.newBufferedReader(path)) {
			String line;
			while ((line = fileReader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

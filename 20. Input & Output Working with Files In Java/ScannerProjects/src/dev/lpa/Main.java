package dev.lpa;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.MatchResult;

public class Main {
	public static void main(String[] args) {

		// new File("files/fixedWidth.txt")
		// Path.of("files/fixedWidth.txt")

		try (Scanner scanner = new Scanner(new FileReader("files/fixedWidth.txt"))) {

			/*
			while (scanner.hasNext()) {
				System.out.println(scanner.nextLine());
			}
			*/

			/*
			System.out.println(scanner.delimiter());
			scanner.useDelimiter("$");
			scanner.tokens().forEach(System.out::println);
			*/

			/*
			scanner.findAll("[A-Za-z]{10,}")
					.map(MatchResult::group)
					.distinct()
					.sorted()
					.forEach(System.out::println);
			*/
			var results = scanner.findAll(
					"(.{15})(.{3})(.{12})(.{8})(.{2}).*")
					.skip(1)
					.map(m -> m.group(3).trim())
					.distinct()
					.sorted()
					.toArray(String[]::new);
			System.out.println(Arrays.toString(results));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}

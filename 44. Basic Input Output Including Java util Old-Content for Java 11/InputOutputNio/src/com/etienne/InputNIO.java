package com.etienne;

import java.io.*;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class InputNIO implements Map<Integer, Location> {

	private static Map<Integer, Location> locations = new LinkedHashMap<Integer, Location>();

	public static void main(String[] args) throws IOException {

		Path locPath = FileSystems.getDefault().getPath("filesoldjava11/locations_big.txt");
		Path dirPath = FileSystems.getDefault().getPath("filesoldjava11/directions_big.txt");

		try (BufferedWriter locFile = Files.newBufferedWriter(locPath);
			BufferedWriter dirFile = Files.newBufferedWriter(dirPath)) {

			for (Location location : locations.values()) {
				locFile.write(location.getLocationID() + "," + location.getDescription() + "\n");
				for (String direction : location.getExits().keySet()) {
					if (!direction.equalsIgnoreCase("Q")) {
						dirFile.write(location.getLocationID() + "," + direction + " ," +
								location.getExits().get(direction) + "\n");
					}
				}
			}
		}catch (IOException e) {
			System.out.println("IOException: " + e.getMessage());
		}
	}

	// 1. The first four bytes will contain the number of locations (bytes 0-3)
	// 2. The next four byte will contain the start offset of the locations section(bytes 4-7)
	// 3. The next section of the file will contain the index (the index is 1962 bytes long. It will start at byte 8 and end at byte 1699
	// 4. The final section of the file will contain the location records (the data). It will start at byte 1700

	static {

		try(ObjectInputStream locFile = new ObjectInputStream(new BufferedInputStream(new FileInputStream("filesoldjava11/locations.dat")))) {
			boolean eof = false;
			while (!eof) {
				try {
					Location location = (Location) locFile.readObject();
					System.out.println("Read location " + location.getLocationID() + " : " + location.getDescription());
					System.out.println("Found " + location.getExits().size() + " exits");

					locations.put(location.getLocationID(), location);
				} catch (EOFException e) {
					eof = true;
				}
			}
		} catch (InvalidClassException e) {
			System.out.println("InvalidClassException " + e.getMessage());
		} catch(IOException io) {
			System.out.println("IO Exception" + io.getMessage());
		} catch(ClassNotFoundException e) {
			System.out.println("ClassNotFoundException " + e.getMessage());
		}
	}

	@Override
	public int size() {
		return locations.size();
	}

	@Override
	public boolean isEmpty() {
		return locations.isEmpty();
	}

	@Override
	public boolean containsKey(Object key) {
		return locations.containsKey(key);
	}

	@Override
	public boolean containsValue(Object value) {
		return locations.containsValue(value);
	}

	@Override
	public Location get(Object key) {
		return locations.get(key);
	}

	@Override
	public Location put(Integer key, Location value) {
		return locations.put(key, value);
	}

	@Override
	public Location remove(Object key) {
		return locations.remove(key);
	}

	@Override
	public void putAll(Map<? extends Integer, ? extends Location> m) {

	}

	@Override
	public void clear() {
		locations.clear();

	}

	@Override
	public Set<Integer> keySet() {
		return locations.keySet();
	}

	@Override
	public Collection<Location> values() {
		return locations.values();
	}

	@Override
	public Set<Entry<Integer, Location>> entrySet() {
		return locations.entrySet();
	}
}

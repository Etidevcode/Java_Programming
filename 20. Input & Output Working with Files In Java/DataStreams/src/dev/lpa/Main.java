package dev.lpa;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Player implements Serializable {

	private final static long serialVersionUID = 1L;
	private final static int version = 2;
	private String name;
	private long topScore;
	private long bigScore;
	private final transient long accountId;
	private List<String> collectWeapons = new LinkedList<>();//ArrayList<>();

	public Player(long accountId, String name, int topScore, List<String> collectWeapons) {
		this.accountId = accountId;
		this.name = name;
		this.topScore = topScore;
		this.collectWeapons = collectWeapons;
	}

	@Override
	public String toString() {
		return "Player{" +
				"id='" + accountId + ", " +
				"name='" + name + '\'' +
				", topScore=" + topScore +
				", collectWeapons=" + collectWeapons +
				'}';
	}

	@Serial
	@SuppressWarnings("unchecked")
	private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException {

		// stream.defaultReadObject();
		// bigScore = (bigScore == 0) ? 1_000_000_000L : bigScore;
		var serializedVer = stream.readInt();
		collectWeapons = (List<String>) stream.readObject();
		name = stream.readUTF();
		//topScore = stream.readInt();
		topScore = (serializedVer == 1) ? stream.readInt() : stream.readLong();
	}

	@Serial
	private void writeObject(ObjectOutputStream stream) throws IOException{

		System.out.println("--> Customized Writing");
		stream.writeInt(version);
		stream.writeObject(collectWeapons);
		stream.writeUTF(name);
		stream.writeLong(topScore);
	}
}
public class Main {

	public static void main(String[] args) {

		/*
		Path dataFile = Path.of("data.dat");
		System.out.println("--".repeat(30));
		writeData(dataFile);
		System.out.println("--".repeat(30));
		readData(dataFile);
		*/


		System.out.println("--".repeat(30));
		Player tim = new Player(555, "Tim", 100_00_010,
				List.of("knife", "machete", "pistol"));
		System.out.println(tim);
		Path timFile = Path.of("tim.dat");
		writeObject(timFile, tim);
		Player reconstitutedTim = readObject(timFile);
		System.out.println(reconstitutedTim);
		System.out.println("--".repeat(30));

		Player joe = new Player(556, "Joe", 75, List.of("crossbow", "rifle", "pistol"));
		Path joeFile = Path.of("joe.dat");
		writeObject(joeFile, joe);
		Player reconstitutedJoe = readObject(joeFile);
		System.out.println(joe);
		System.out.println(reconstitutedJoe);

	}

	private static void writeData(Path dataFile) {

		try (DataOutputStream dataStream =
				new DataOutputStream(
						new BufferedOutputStream(
								new FileOutputStream(dataFile.toFile())));
		) {
			int myInt = 17;
			long myLong = 100_000_000_000_000L;
			boolean myBoolean = true;
			char myChar = 'Z';
			float myFloat = 77.7f;
			double myDouble = 98.6;
			String myString = "Hello World";

			long position = 0;

			dataStream.writeInt(myInt);
			System.out.println("WriteInt writes " + (dataStream.size() - position));
			position = dataStream.size();

			dataStream.writeLong(myLong);
			System.out.println("WriteLong writes " + (dataStream.size() - position));
			position = dataStream.size();

			dataStream.writeBoolean(myBoolean);
			System.out.println("WriteBoolean writes " + (dataStream.size() - position));
			position = dataStream.size();

			dataStream.writeChar(myChar);
			System.out.println("WriteChar writes " + (dataStream.size() - position));
			position = dataStream.size();

			dataStream.writeFloat(myFloat);
			System.out.println("WriteFloat writes " + (dataStream.size() - position));
			position = dataStream.size();

			dataStream.writeDouble(myDouble);
			System.out.println("WriteDouble writes " + (dataStream.size() - position));
			position = dataStream.size();

			dataStream.writeUTF(myString);
			System.out.println("WriteString writes " + (dataStream.size() - position));
			position = dataStream.size();

		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	private static void readData(Path dataFile) {

		try (DataInputStream dataStream = new DataInputStream(
				Files.newInputStream(dataFile)
		)) {
			System.out.println("myInt = " + dataStream.readInt());
			System.out.println("myLong = " + dataStream.readLong());
			System.out.println("myBoolean = " + dataStream.readBoolean());
			System.out.println("myChar = " + dataStream.readChar());
			System.out.println("myFloat = " + dataStream.readFloat());
			System.out.println("myDouble = " + dataStream.readDouble());
			System.out.println("myString = " + dataStream.readUTF());

		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	private static void writeObject(Path dataFile, Player player) {

		try (ObjectOutputStream objStream =
				new ObjectOutputStream(Files.newOutputStream(dataFile))) {
			objStream.writeObject(player);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	private static Player readObject(Path dataFile) {

		try (ObjectInputStream objStream =
				new ObjectInputStream(Files.newInputStream(dataFile))) {
			return (Player) objStream.readObject();
		} catch (IOException | ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}
}

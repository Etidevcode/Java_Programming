package dev.lpa;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

record Person(String firstName, String lastName, int age) {

	public static final String[] firsts =
			{"Able", "Bob", "Charlie", "Donna", "Eve", "Fred"};

	public static final String[] lasts =
			{"Norton", "OHara", "Petersen", "Quincy", "Richardson", "Smith"};

	public static final Random random = new Random();

	public Person() {
		this(firsts[random.nextInt(firsts.length)],
				lasts[random.nextInt(lasts.length)],
				random.nextInt(18, 100));
	}

	@Override
	public String toString() {
		return  "%s, %s (%d)".formatted(lastName, firstName, age);
	}
}
public class Main {

	public static void main(String[] args) {
		var persons = Stream.generate(Person::new)
										.limit(10)
										.sorted(Comparator.comparing(Person::lastName))
										.toArray();
		for (var person : persons) {
			System.out.println(person);
		}

		System.out.println("-".repeat(30));
		//Stream.generate(Person::new)
		Arrays.stream(persons)
				.limit(10)
				.parallel()
				//.sorted(Comparator.comparing(Person::lastName))
				//.forEachOrdered(System.out::println);
				.forEach(System.out::println);


		System.out.println("-".repeat(30));
		int sum = IntStream.range(1, 101)
				.parallel()
				.reduce(0, Integer::sum);

		System.out.println("The sum of the number is: " + sum);


		String humptyDumpty = """
    			Humpty Dumpty sat on a wall
    			Humpty Dumpty had a great fall.
    			All the king's horses and all the king's men
    			couldn't put Humpty together again.
				""";

		System.out.println("-".repeat(30));
		var words = new Scanner(humptyDumpty).tokens().toList();
		words.forEach(System.out::println);
		System.out.println("-".repeat(30));

		var backTogetherAgain = words
				.parallelStream()
				//		.collect(Collectors.joining(" "));
				//		.reduce("", (s1, s2) -> s1.concat(s2).concat(" "));
						.collect(Collectors.joining(" "));

				/*.stream()
				.reduce(
						new StringJoiner(" "),
						StringJoiner::add,
						StringJoiner::merge
				);*/
		System.out.println(backTogetherAgain);

		System.out.println("-".repeat(30));

		Map<String, Long> lastNameCounts =
				Stream.generate(Person::new)
						.limit(10000)
						.parallel()
						.collect(Collectors.groupingByConcurrent( //groupingBy(
								Person::lastName,
								Collectors.counting()
						));
		lastNameCounts.entrySet().forEach(System.out::println);

		System.out.println("-".repeat(30));
		long total = 0;
		for (long count : lastNameCounts.values()) {
			total += count;
		}
		System.out.println("Total = " + total);

		System.out.println(lastNameCounts.getClass().getName());

		System.out.println("-".repeat(30));

		// var lastCounts = new ConcurrentSkipListMap<String, Long>();//new TreeMap<String, Long>();
		var lastCounts = Collections.synchronizedMap(
				new TreeMap<String, Long>());
		Stream.generate(Person::new)
				.limit(10000)
				.parallel()
				.forEach((person) -> lastCounts.merge(person.lastName(), 1L, Long::sum));
		System.out.println(lastCounts);


		total = 0;
		for (long count : lastCounts.values()) {
			total += count;
		}
		System.out.println("Total = " + total);

		System.out.println(lastCounts.getClass().getName());

		System.out.println("-".repeat(30));
	}
}

import java.util.*;

public class Main {

    enum WeekDay {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}
    public static void main(String[] args) {

        List<WeekDay> annsWorksDays = new ArrayList<>(List.of(WeekDay.MONDAY, WeekDay.TUESDAY, WeekDay.THURSDAY, WeekDay.FRIDAY));
        var annsDaysSet = EnumSet.copyOf(annsWorksDays);
        System.out.println(annsDaysSet.getClass().getSimpleName());
        annsDaysSet.forEach(System.out::println);

        System.out.println("-".repeat(20));
        var allDaySet = EnumSet.allOf(WeekDay.class);
        allDaySet.forEach(System.out::println);

        System.out.println("-".repeat(20));
        Set<WeekDay> newPersonDays = EnumSet.complementOf(annsDaysSet);
        newPersonDays.forEach(System.out::println);

        System.out.println("-".repeat(20));
        Set<WeekDay> anotherWay = EnumSet.copyOf(annsDaysSet);
        anotherWay.removeAll(annsDaysSet);
        anotherWay.forEach(System.out::println);


        Set<WeekDay> businessDays = EnumSet.range(WeekDay.MONDAY, WeekDay.FRIDAY);
        businessDays.forEach(System.out::println);

        System.out.println("-".repeat(20));
        Map<WeekDay, String[]> employeeMap = new EnumMap<>(WeekDay.class);
        employeeMap.put(WeekDay.FRIDAY, new String[]{"Ann", "Mary", "Bob"});
        employeeMap.put(WeekDay.MONDAY, new String[]{"Mary", "Bob"});
        employeeMap.forEach(
                (k, v) -> System.out.println(k + " : " + Arrays.toString(v))
        );
    }
}

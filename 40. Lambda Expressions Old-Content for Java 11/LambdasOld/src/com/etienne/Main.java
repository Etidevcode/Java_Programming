package com.etienne;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Etienne KOA
 */

public class Main {

	public static void main(String[] args) {

		// Without Lambdas
		/*new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Printing from the Runnable");
			}
		}).start();
	}*/

		// With Lambdas
		new Thread(() -> {
			System.out.println("Printing from the Runnable");
			System.out.println("Line 2");
			System.out.format("This is line %d\n", 3);
		}).start();

		Employee john = new Employee("John Doe", 30);
		Employee etienne = new Employee("Etienne KOA", 28);
		Employee jack = new Employee("Jack Hill", 40);
		Employee snow = new Employee("Snow While", 22);

		List<Employee> employees = new ArrayList<>();
		employees.add(john);
		employees.add(etienne);
		employees.add(jack);
		employees.add(snow);

		employees.forEach(employee -> {
			System.out.println(employee.getName());
			System.out.println(employee.getAge());
		});
		/*for (Employee employee : employees) {
			System.out.println(employee.getName());
			new Thread(() ->System.out.println(employee.getAge())).start();
		}
		System.out.println("==".repeat(20));
		for (int i = 0; i < employees.size(); i++) {
			Employee employee = employees.get(i);
			System.out.println(employee.getName());
			new Thread(() -> System.out.println(employee.getAge())).start();
		}*/


		// Without Lambdas
		/*Collections.sort(employees, new Comparator<Employee>() {
			@Override
			public int compare(Employee employee1, Employee employee2) {
				return employee1.getName().compareTo(employee2.getName());
			}
		});*/

		// With Lambdas
		/*Collections.sort(employees, (Employee employee1, Employee employee2) -> employee1.getName().compareTo(employee2.getName()));
		for (Employee employee : employees) {
			System.out.println(employee.getName());
		}*/

		// Without Lamdas
		/*String sillString = doStringStuff(new UpperConcat() {
			@Override
			public String upperAndConcat(String s1, String s2) {
				return s1.toUpperCase() + s2.toUpperCase();
			}
		},
				employees.get(0).getName(), employees.get(1).getName());
		System.out.println(sillString);*/

		// With Lambdas
		//UpperConcat uc = (String s1, String s2) -> s1.toUpperCase() + s2.toUpperCase();
		UpperConcat uc = (s1, s2) -> {
			String result = s1.toUpperCase() + s2.toUpperCase();
			return result;
		};
		String sillString = doStringStuff(uc, employees.get(0).getName(), employees.get(1).getName());
		System.out.println(sillString);

		AnotherClass anotherClass = new AnotherClass();
		String s = anotherClass.doSomething();
		System.out.println(s);
	}


	public static final String doStringStuff(UpperConcat uc, String s1, String s2) {
		return uc.upperAndConcat(s1, s2);
	}
}

class Employee {

	private String name;
	private int age;

	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

interface UpperConcat {
	public String upperAndConcat(String s1, String s2);
}

class AnotherClass{

	public String doSomething() {
		//With Lambdas

		/*
		UpperConcat uc = (s1, s2) -> {
			System.out.println("The lambda expression's class is " + getClass().getSimpleName());
			String result = s1.toUpperCase() + s2.toUpperCase();
			return result;
		};
		System.out.println("The Another Class's name is " + getClass().getSimpleName());
		return Main.doStringStuff(uc, "String1", "String2");
		*/

		int i = 0;
		UpperConcat uc = (s1, s2) -> {
					System.out.println("The lambda expression's class is " + getClass().getSimpleName());
					System.out.println("i in the lambda expression = " + i);
					String result = s1.toUpperCase() + s2.toUpperCase();
					return result;
			};
			System.out.println("The AnotherClass class's name is " + getClass().getSimpleName());
			return Main.doStringStuff(uc, "String1 ", "String2");
		}

		public void printValue() {

			int number = 25;
			Runnable r = () -> {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("The value is " + number);
			};
			new Thread(r).start();
		}

		// Without Lambdas
		/*rSystem.out.println("The AnotherClass class's name is: " + getClass().getSimpleName());
		return Main.doStringStuff(new UpperConcat() {
			@Override
			public String upperAndConcat(String s1, String s2) {
				System.out.println("The anonymous class's name is: " + getClass().getSimpleName());
				return s1.toUpperCase() + s2.toUpperCase();
			}
		},"String1", "String2");*/
}
class CodeToRun implements Runnable {

	@Override
	public void run() {
		System.out.println("Printing from the Runnable");
	}
}

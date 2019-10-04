package com.virt.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Customer{
	String name;
	int age;
	String address;
	public Customer(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}
}
public class StreamDemo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		List<Integer> listLess25 = new ArrayList<>();

		for (int i = 0; i <= 100; i++) {
			list.add(new Random().nextInt(100));
		}
		for (int item : list) {
			System.out.print(item + " ");
			System.out.print("");
		}
		for (int item : list) {
			if (item < 25)
				listLess25.add(item);
		}
		// List<Integer> list2=
		list.stream().filter(new Predicate<Integer>() {
			@Override
			public boolean test(Integer t) {
				if (t >= 25)
					return true;
				return false;
			}
		}).collect(Collectors.toList());
		list2.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				// TODO Auto-generated method stub

			}
		});
		list2.forEach((t) -> System.out.print(t + " "));
		System.out.println();

		List<Integer> list3 = list.stream().filter(t -> t >= 25).collect(Collectors.toList());
		list3.forEach((t) -> System.out.print(t + " "));
	}
}
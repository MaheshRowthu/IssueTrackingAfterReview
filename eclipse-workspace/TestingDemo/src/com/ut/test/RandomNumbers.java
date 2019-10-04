package com.ut.test;

public class RandomNumbers {
	public int[] get10randomNumbers(int low, int high) {
		int result[] = new int[10];

		for (int j = 0; j < 10; j++) {
			int randomInt = (int) (10.0 * Math.random());
			if (randomInt < high && randomInt > low) {
				result[j] = randomInt;
				System.out.println(result[j]);
			} else {
				j = j - 1;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		RandomNumbers obj1 = new RandomNumbers();
		obj1.get10randomNumbers(5, 10);
	}
}

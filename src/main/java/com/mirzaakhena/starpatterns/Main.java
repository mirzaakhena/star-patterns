package com.mirzaakhena.starpatterns;

public class Main {

	public static void main(String[] args) {

		StarPattern starPattern = new StarPattern(20);
		
		starPattern.draw((i, j, n) -> {
			return j < i + 1;
		});
		
		System.out.println();
		
		starPattern.draw((i, j, n) -> {
			return i < j + 1;
		});
		
		System.out.println();
		
		starPattern.draw((i, j, n) -> {
			return j < i + 1 && i <= n / 2 || j < n - i && i > n / 2;
		});
	}

}

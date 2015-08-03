package com.mirzaakhena.starpatterns;

import static java.lang.System.out;

public class StarPattern {

	private int n;
	private String charToPrint;

	public void setCharToPrint(String charToPrint) {
		this.charToPrint = charToPrint;
	}

	public StarPattern(int rowColumn) {
		this.n = rowColumn;
		charToPrint = "* ";
	}

	public void draw(DrawStarStrategy drawStarStrategy) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (drawStarStrategy.process(i, j, n)) {
					out.print(charToPrint);
				}
			}
			out.println();
		}

	}

}

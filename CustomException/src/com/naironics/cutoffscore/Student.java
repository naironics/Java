package com.naironics.cutoffscore;

public class Student {

	private int greScore;

	public Student(int score) {
		this.greScore = score;
	}

	public void applyToIvyLeague(int cutOffScore)throws InsufficientGreScoreException {

		if (this.greScore < cutOffScore) {
			throw new InsufficientGreScoreException("Sorry," +
					" Your GRE Score is not meeting University Requirements");
		}
	}

	public static void main(String[] args) {
		// provide argument through command line
		int cutOffScore = Integer.parseInt(args[0]);

		Student jack = new Student(1480);

		try {
			jack.applyToIvyLeague(cutOffScore);
		} catch (InsufficientGreScoreException igse) {
			igse.printStackTrace();
		}

	}

}

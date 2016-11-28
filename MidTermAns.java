class ScoreSorter {
	public static void main(String[] args) {
		Score[] scores = { new Score(100, 100, 100), new Score(50, 90, 100), new Score(70, 80, 90),
				new Score(60, 60, 80), new Score(70, 70, 40), new Score(100, 20, 80), new Score(80, 80, 40),
				new Score(50, 70, 80), new Score(80, 100, 20), new Score(90, 30, 50) };
		java.util.Arrays.sort(scores);
		for (int i = scores.length - 1; i >= 0; i--) {
			scores[i].out();
		}
	}
}

class Score implements Comparable<Score> {
	int chnScore, engScore, mathScore;
	int totalScore;

	Score(int chnScore, int engScore, int mathScore) {
		this.chnScore = chnScore;
		this.engScore = engScore;
		this.mathScore = mathScore;
		totalScore = chnScore + engScore + mathScore;
	}

	@Override
	public int compareTo(Score other) {
		// TODO Auto-generated method stub
		if (totalScore == other.totalScore) {
			if (chnScore == other.chnScore) {
				if (engScore == other.engScore) {
					return mathScore - other.mathScore;
				}
				return engScore - other.engScore;
			}
			return chnScore - other.chnScore;
		}
		return totalScore - other.totalScore;
	}

	public void out() {
		System.out.print("Total: " + (chnScore + engScore + mathScore));
		System.out.print("  Chinese: " + chnScore);
		System.out.print("  English: " + engScore);
		System.out.println("  Math: " + mathScore);
	}
}

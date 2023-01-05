package ch07.home.ex04.case01;

public class MaxMin {
	public static void main(String[] args) {
		int[] scores = {77, 88, 91, 33, 100, 55, 95};
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int score: scores) {
			if(max < score) max = score;
			if(min > score) min = score;
		}
		
		System.out.printf("%d %d\n", max, min);
	}
}
/*
과제: scores에서 최고, 최솟값을 찾아라.
*/
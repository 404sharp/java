package ch07.ex04.case05.test;

import ch07.ex04.case05.domain.Score;
import ch07.ex04.case05.service.ScoreServiceImpl;

public class ScoreServiceTest {
	public static void main(String[] args) {
		ScoreServiceImpl scoreService = new ScoreServiceImpl();
		
		Score[] scores = new Score[5];
		for(int i = 0; i < scores.length; i++)
			// fixture를 준비한다. DAO로부터 얻을 법한 데이터이다. 단위 테스트를 위해서.
			scores[i] = new Score((i + 1) * 10, (i + 1) * 10, (i + 1) * 10);
		
		scoreService.calcScore(scores); // test를 위해서 calcScore를 public으로 만든다. 
		for(Score score: scores) System.out.println(score);
	}
}

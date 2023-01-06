package ch07.ex04.case05.presentation;

import ch07.ex04.case05.domain.Score;
import ch07.ex04.case05.service.ScoreService;

public class ScoreIo {
	private ScoreService scoreService;
	
	public ScoreIo(ScoreService scoreService) { // DI (dependency injection)
		this.scoreService = scoreService;
	}
	
	// 과제: 5명의 국, 영, 수 점수를 user가 입력토록 하라.
	//       interface Console을 만든다.
	/*
	public void play() {
		Score[] scores = new Score[5]; // 실제로는 user가 5개의 데이터를 입력한다.
		int kor = 0;
		int eng = 0;
		int math = 0;
		
		for(int i = 0; i < scores.length; i++)
			scoreService.addScore(
					new Score((i + 1) * 10, (i + 1) * 10, (i + 1) * 10));
		
		scores = scoreService.getScores(); // getScores()는 합계, 평균을 채운다.
		for(Score score: scores)
			System.out.println(score);
	}
	*/
	public void play() {
		Score[] scores = new Score[5];
		int kor = 0;
		int eng = 0;
		int math = 0;
		
		for(int i = 0; i < scores.length; i++) {
			kor = Console.inNum("학생 " + (i + 1) + "의 국어 점수를 입력하세요.");
			eng = Console.inNum("학생 " + (i + 1) + "의 영어 점수를 입력하세요.");
			math = Console.inNum("학생 " + (i + 1) + "의 수학 점수를 입력하세요.");
			
			scoreService.addScore(new Score(kor, eng, math));
		}
		
		scores = scoreService.getScores();
		for(Score score: scores)
			Console.info(score);
	}
}

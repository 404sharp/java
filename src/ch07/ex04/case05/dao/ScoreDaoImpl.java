package ch07.ex04.case05.dao;

import ch07.ex04.case05.domain.Score;

public class ScoreDaoImpl implements ScoreDao {
	private Score[] scores;
	private int cursor; // 각각의 row를 지정하는 인덱스값. 현재 작업중인 row를 가리킨다.
	
	public ScoreDaoImpl(Score[] scores) { // DAO는 database가 있어야 의미가 있다.
		this.scores = scores;
	}
	
	@Override
	public void insertScore(Score score) {
		this.scores[cursor++] = score;
	}
	
	@Override
	public Score[] selectScores() {
		return this.scores;
	}
}

package ch07.ex04.case05.dao;

import ch07.ex04.case05.domain.Score;

public interface ScoreDao {
	void insertScore(Score score);
	Score[] selectScores(); // 읽기는 2가지 경우가 있다: N개를 읽는 경우, 1개를 읽는 경우.
}

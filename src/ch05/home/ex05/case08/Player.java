package ch05.home.ex05.case08;

public class Player {
	private String playerName;
	
	public Ball pass(Ball ball) { // 목적어에 해당하는 것을 파라미터로 갖고 있다.
		return ball;
	}
	
	public Ball kick(Ball ball) { // 목적어에 해당하는 것을 파라미터로 갖고 있다.
		return ball;
	}
	
	public String getPlayerName() {
		return playerName;
	}
	
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
}

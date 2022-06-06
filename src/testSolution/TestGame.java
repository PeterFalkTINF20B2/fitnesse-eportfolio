package testSolution;

import codeToTest.*;

public class TestGame {
	public String playerName;
	public Game game = new Game();

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	
	public boolean addPlayer() {
		game = StaticGame.theGame;
		Player player = game.addPlayer(playerName);
		return game.isPlaying(player);
	}
	
	public int count() {
		return game.getNumberOfPlayers();
	}
	
	public boolean deletePlayer() {
		game = StaticGame.theGame;
		Player player = game.getPlayerNamed(playerName);
		return game.deletePlayer(player);
	}
}

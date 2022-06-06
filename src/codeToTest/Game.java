package codeToTest;

import java.util.ArrayList;

public class Game {
	private ArrayList<Player> players = new ArrayList<>();
	private int numberOfPlayers;

	public Game() {
		players = new ArrayList<>();
		numberOfPlayers = 0;
	}

	public Player addPlayer(Player aPlayer) {
		players.add(aPlayer);
		numberOfPlayers++;
		return aPlayer;
	}

	public Player addPlayer(String playerName) {
		Player aPlayer = new Player(playerName);
		players.add(aPlayer);
		numberOfPlayers++;
		return aPlayer;
	}

	public boolean isPlaying(String playerName) {
		boolean isPlaying = false;
		for (int i = 0; i < players.size(); i++) {
			if (players.get(i).getName().equals(playerName)) {
				isPlaying = true;
			}
		}
		return isPlaying;
	}

	public boolean isPlaying(Player aPlayer) {
		if (players.contains(aPlayer)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean deletePlayer(String playerName) {
		boolean deleted = false;
		if (isPlaying(playerName)) {
			for (int i = 0; i < players.size(); i++) {
				if (players.get(i).getName().equals(playerName)) {
					players.remove(i);
					numberOfPlayers--;
					deleted = true;
				}
			}
		}
		return deleted;
	}

	public boolean deletePlayer(Player aPlayer) {
		boolean deleted = false;
		if (isPlaying(aPlayer)) {
			players.remove(aPlayer);
			numberOfPlayers--;
			deleted = true;
		}
		return deleted;
	}

	public int getNumberOfPlayers() {
		return numberOfPlayers;
	}

	public Player getPlayerNamed(String playerName) {
		boolean isPlaying = isPlaying(playerName);
		Player aPlayer = null;

		if (isPlaying) {
			for (int i = 0; i < players.size(); i++) {
				if (players.get(i).getName().equals(playerName)) {
					aPlayer = players.get(i);
				}
			}
		}

		return aPlayer;
	}
}
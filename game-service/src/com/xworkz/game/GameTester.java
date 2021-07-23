package com.xworkz.game;

import com.xworkz.game.service.GameService;
import com.xworkz.game.service.GameServiceImpl;

public class GameTester {

	public static void main(String[] args) {
		GameDTO dto = new GameDTO("TempleRun", "3.2", "Sunita", 1, 1000, false);

		GameService gameService = new GameServiceImpl();
		String saved = gameService.validateAndSave(dto);
		System.out.println(saved);
	}

}

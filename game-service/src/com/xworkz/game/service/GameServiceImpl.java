package com.xworkz.game.service;

import com.xworkz.game.GameDTO;

public class GameServiceImpl implements GameService {

	@Override
	public String validateAndSave(GameDTO dto) {
		boolean validname = false;
		boolean validversion = false;
		boolean developedByValid = false;
		boolean ValidmaxPlayers = false;
		boolean ValidmemoryRequired = false;
		System.out.println("validate and save method:" + dto);
		if (dto != null) {
			System.out.println("dto is not null so validation will start");
			String name = dto.getName();
			if (name != null && !name.isEmpty() && name.length() >= 3 && name.length() <= 10) {
				System.out.println("name is valid");
				validname = true;
			} else {
				System.out.println("name is invalid");
				validname = false;
			}
			String version = dto.getVersion();
			if (version != null && version.length() > 1 && version.length() < 50) {
				System.out.println("version is valid");
				validversion = true;
			} else {
				System.out.println("invalid version");
				validversion = false;
			}
			String developedBy = dto.getDevelopedBy();
			if (developedBy.length() > 3 && developedBy.length() < 15) {
				System.out.println("developedBy is valid");
				developedByValid = true;
			} else {
				System.out.println("developedBy is invalid");
				developedByValid = false;
			}
			int maximumPlyers = dto.getMaxPlayers();

			if (maximumPlyers >= 1 && maximumPlyers <= 15) {
				System.out.println("maximumPlyaers is valid");
				ValidmaxPlayers = true;
			} else {
				System.out.println("maximumPlyaers is invalid ");
				ValidmaxPlayers = false;
			}
			double memory = dto.getMemoryRequired();
			if (memory > 500 && memory <= 500000) {
				System.out.println("memory is valid");
				ValidmemoryRequired = true;
			} else {
				System.out.println("memory is invalid");
				ValidmemoryRequired = false;
			}
				if (validname && validversion && developedByValid && ValidmaxPlayers && ValidmemoryRequired) {
					System.out.println("data is valid ");
					return "Success";
				}
				System.out.println("dto is invalid returning failed");
				return "Failed";
			}
		
		System.out.println("dto is null, cannot pass to dto");

		return "Failed";

	}
}

package com.xworkz.transformer.service;

import com.xworkz.transformer.TransformerDTO;

public class TransformerServiceImpl implements TransformerService {

	@Override
	public String validateAndSave(TransformerDTO dto) {
		boolean ValidName = false;
		boolean ValidPlace = false;
		boolean ValidAngry = false;
		boolean ValidHappy = false;
		boolean ValidSad = false;
		System.out.println("validate and save method:" + dto);
		if (dto != null) {
			System.out.println("dto is not null so validation will start");
			String name = dto.getName();
			if (name != null && !name.isEmpty() && name.length() > 3 && name.length() <= 10) {
				System.out.println("Name is Valid");
				ValidName = true;
			} else {
				System.out.println("Name is Invalid");
				ValidName = false;
			}
			String place = dto.getPlace();
			if (place != null && !place.isEmpty() && place.length() > 4 && place.length() <= 50) {
				System.out.println("Place is Valid");
				ValidPlace = true;
			} else {
				System.out.println("Place is Invalid");
				ValidPlace = false;
			}
			String angry = dto.getAngry();
			if (angry !=null && !angry.isEmpty() && angry.length() > 4 && angry.length() <=15) {
				System.out.println("Angry is valid");
				ValidAngry = true;
			}else {
				System.out.println("Angry is Invalid");
				ValidAngry = false;
			}
			String happy = dto.getHappy();
			if(happy !=null && !happy.isEmpty() && happy.length() >4 && happy.length() <=50) {
				ValidHappy = true;
			}else {
				System.out.println("Happy is not Valid");
				ValidHappy = false;
			}
			String sad = dto.getSad();
			if(sad != null && !sad.isEmpty() && sad.length() >4 && sad.length() <=12) {
				ValidSad = true;
			}else {
				System.out.println("Sad is Valid");
				ValidSad = false;
			}
			if (ValidName && ValidPlace && ValidAngry && ValidHappy && ValidSad) {
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
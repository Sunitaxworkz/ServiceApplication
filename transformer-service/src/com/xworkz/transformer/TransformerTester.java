package com.xworkz.transformer;

import com.xworkz.transformer.service.TransformerService;
import com.xworkz.transformer.service.TransformerServiceImpl;

public class TransformerTester {

	public static void main(String[] args) {
		TransformerDTO dto = new TransformerDTO("Sunita", "Gadag", null, "When someone irritate",
				"When i m eating chocolate", "When Mom scolded", null);
		TransformerService transformerService = new TransformerServiceImpl();
		String saved = transformerService.validateAndSave(dto);
		System.out.println(saved);

	}

}

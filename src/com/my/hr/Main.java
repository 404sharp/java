package com.my.hr;

import java.util.ArrayList;
import java.util.List;

import com.my.hr.dao.LaborerDao;
import com.my.hr.dao.LaborerDaoImpl;
import com.my.hr.domain.Laborer;
import com.my.hr.presentation.Console;
import com.my.hr.presentation.LaborerIo;
import com.my.hr.service.LaborerService;
import com.my.hr.service.LaborerServiceImpl;

public class Main {
	// 앱은 객체의 집합이다.
	public static void main(String[] args) {
		List<Laborer> laborers = new ArrayList<>();
		
		LaborerDao laborerDao = new LaborerDaoImpl(laborers);
		LaborerService laborerService = new LaborerServiceImpl(laborerDao);
		LaborerIo laborerIo = new LaborerIo(laborerService);
		
		laborerIo.play();
		Console.info("end.");
	}
}

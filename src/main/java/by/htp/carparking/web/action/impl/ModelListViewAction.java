package by.htp.carparking.web.action.impl;

import javax.servlet.http.HttpServletRequest;

import by.htp.carparking.service.CarService;
import by.htp.carparking.web.action.BaseAction;

public class ModelListViewAction implements BaseAction{
	
	public ModelListViewAction() {
	}
	
	private CarService carService;
	
	public void setCarService(CarService carService) {
		
	}
	
	@Override
	public String executeAction(HttpServletRequest request) {
		
		return null;
	}
	
}

package by.htp.carparking.service.impl;

import java.util.List;

import by.htp.carparking.dao.CarDao;
import by.htp.carparking.domain.Car;
import by.htp.carparking.service.CarService;

public class CarServiceImpl implements CarService {
	private CarDao carDao;
	
	public CarServiceImpl() {
	}

	public void setCarDao(CarDao carDao) {
		this.carDao = carDao;
	}




	@Override
	public List<Car> getCarsList() {
		System.out.println("context: " /*+ appContext.getBean("carDao1")*/);
		System.out.println(carDao.readAll() + " #");
		return carDao.readAll();
	}
}

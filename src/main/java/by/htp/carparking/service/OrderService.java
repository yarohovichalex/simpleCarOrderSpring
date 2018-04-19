package by.htp.carparking.service;

import java.util.Date;

public interface OrderService {
	
	void orderCar(int userId, int carId, Date startDate, Date endDate);
	

}

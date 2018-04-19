package by.htp.carparking.dao;

import java.util.Date;

import by.htp.carparking.domain.Order;

public interface OrderDao extends BaseDao<Order> {
	
	void insertNewOrder(int userId, int carId, Date start, Date end);

}

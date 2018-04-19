package by.htp.carparking.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import by.htp.carparking.dao.OrderDao;
import by.htp.carparking.dao.util.DBConnectionHelper;
import by.htp.carparking.domain.Order;

public class OrderDaoDBImpl implements OrderDao {
	
	private static final Logger logger = LogManager.getLogger();

	@Override
	public void create(Order entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public Order read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Order entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void insertNewOrder(int userId, int carId, Date start, Date end) {
		
		Connection conn = DBConnectionHelper.connect();

		try(PreparedStatement ps = conn.prepareStatement(
				"INSERT INTO orders (user_id, car_id, start_date, end_date) VALUES (?,?,?,?)")) {
			
			ps.setInt(1, userId);
			ps.setInt(2, carId);
			ps.setDate(3, new java.sql.Date(start.getTime()));
			ps.setDate(4,  new java.sql.Date(end.getTime()));
			ps.executeUpdate();
			
			logger.info("the order was added");

		} catch (SQLException e) {
			e.printStackTrace();
		} 

	}

}

package by.htp.carparking.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import by.htp.carparking.dao.CarDao;
import by.htp.carparking.dao.util.DBConnectionHelper;
import by.htp.carparking.domain.Car;

public class CarDaoDBImpl implements CarDao {
    private List<Car> list = new ArrayList<>();

	public CarDaoDBImpl() {
	}

	@Override
	public void create(Car entity) {

		Connection conn = DBConnectionHelper.connect();
		
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement("INSERT INTO cars (brand, model) VALUES (?,?)");

			ps.setString(1, "brand1");
			ps.setString(2, "model1");

			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

	@Override
	public Car read(int id) {
		return null;
	}

	@Override
	public List<Car> readAll() {
		
        list.clear();

		Connection conn = DBConnectionHelper.connect();		
		Statement ps = null;
		ResultSet rs = null;
		  try {
			  ps = conn.createStatement();
	          rs = ps.executeQuery("select * from cars;");
	          while (rs.next())
	          {
	              String model = rs.getString("brand");
	              String brand = rs.getString("model");
	              int id = rs.getInt("id");
	              String startDate = rs.getString("start_date");
	              String endDate = rs.getString("end_date");
	              String status = rs.getString("status");
	              list.add(new Car(id, model, brand, startDate, endDate, status));
	          }

		} catch (SQLException e) {
			e.printStackTrace();
		}

         
		return list;		
	}

	@Override
	public void update(Car entity) {

	}

	@Override
	public void delete(int id) {

	}

}

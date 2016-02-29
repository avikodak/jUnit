package com.avikodak.orderservice.dao;

import java.sql.SQLException;

import com.avikodak.orderservice.dao.beans.Order;

public interface OrderDao {

	int create(Order order) throws SQLException;

	Order read(int id) throws SQLException;

	int update(Order order) throws SQLException;

	int delete(int id) throws SQLException;

}

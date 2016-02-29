package com.avikodak.orderservice.service.impl;

import java.sql.SQLException;

import com.avikodak.orderservice.dao.OrderDao;
import com.avikodak.orderservice.dao.beans.Order;
import com.avikodak.orderservice.exception.OrderProcessingException;
import com.avikodak.orderservice.service.OrderService;

public class OrderServiceImpl implements OrderService {

	OrderDao orderDao;

	public Boolean create(Order order) throws OrderProcessingException {
		try {
			int result = orderDao.create(order);
			if (result == 0) {
				return false;
			}
		} catch (SQLException e) {
			throw new OrderProcessingException(e);
		}
		return true;
	}

	public Boolean cancel(int id) throws OrderProcessingException {
		try {
			Order order = orderDao.read(id);
			order.setStatus("Cancel");
			int result = orderDao.update(order);
			if (result == 0) {
				return false;
			}
		} catch (SQLException e) {
			throw new OrderProcessingException(e);
		}
		return true;
	}

	public Boolean delete(int id) throws OrderProcessingException {
		try {
			int result = orderDao.delete(id);
			if (result == 0) {
				return false;
			}
		} catch (SQLException e) {
			throw new OrderProcessingException(e);
		}
		return true;
	}

	public OrderDao getOrderDao() {
		return orderDao;
	}

	public void setOrderDao(OrderDao orderDao) {
		this.orderDao = orderDao;
	}

}

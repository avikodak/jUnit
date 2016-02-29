package com.avikodak.orderservice.service;

import com.avikodak.orderservice.dao.beans.Order;
import com.avikodak.orderservice.exception.OrderProcessingException;

public interface OrderService {

	public Boolean create(Order order) throws OrderProcessingException;

	public Boolean cancel(int id) throws OrderProcessingException;

	public Boolean delete(int id) throws OrderProcessingException;

}

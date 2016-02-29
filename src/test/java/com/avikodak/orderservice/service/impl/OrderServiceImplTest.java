package com.avikodak.orderservice.service.impl;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.avikodak.orderservice.dao.OrderDao;
import com.avikodak.orderservice.dao.beans.Order;
import com.avikodak.orderservice.exception.OrderProcessingException;

public class OrderServiceImplTest {

	@Mock
	private OrderDao orderDao;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void placeOrder_Should_Create_an_Order() throws SQLException, OrderProcessingException {
		OrderServiceImpl orderService = new OrderServiceImpl();
		orderService.setOrderDao(orderDao);
		Order order = new Order();
		when(orderDao.create(order)).thenReturn(1);
		Boolean create = orderService.create(order);
		assertTrue(create);
		verify(orderDao,times(1)).create(order);
	}

}

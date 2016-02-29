package com.avikodak.orderservice.exception;

import java.sql.SQLException;

public class OrderProcessingException extends Exception {

	public OrderProcessingException(SQLException e) {
		super(e);
	}

	private static final long serialVersionUID = 6276697388400741296L;

}

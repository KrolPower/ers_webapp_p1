package com.revature.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.log4j.Logger;

public class ConnectionUtil {

	private static Logger logger = Logger.getLogger(ConnectionUtil.class);
	
	public static Connection getConnection() {
	Connection conn = null;

	try {
		// this is more secure as you don't expose all your credentials
		logger.debug(String.format(
				"Making a database connection with following credentials: \nURL: %s \nUsername: %s \nPassword: %s",
				System.getenv("db_url"), System.getenv("db_username"), System.getenv("db_password")));
		conn = DriverManager.getConnection(System.getenv("db_url"), System.getenv("db_username"),
				System.getenv("db_password"));
		logger.debug("Connection has been successfully established.");
	} catch (SQLException e) {
		logger.warn("Unable to obtain connection to database", e);
	}

	return conn;
}
}

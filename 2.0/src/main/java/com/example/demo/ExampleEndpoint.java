package com.example.demo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.boot.endpoint.Endpoint;
import org.springframework.boot.endpoint.ReadOperation;
import org.springframework.boot.endpoint.WriteOperation;

/**
 * @author Madhura Bhave
 */
@Endpoint(id = "example")
public class ExampleEndpoint {

	private static final Log logger = LogFactory.getLog(ExampleEndpoint.class);

	@ReadOperation
	public String read() {
		return "hello world";
	}

	@WriteOperation
	public void write(String value) {
		logger.info("Printing the value " + value);
	}

}

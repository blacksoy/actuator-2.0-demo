package com.example.demo.web;

import com.example.demo.ExampleEndpoint;

import org.springframework.boot.endpoint.ReadOperation;
import org.springframework.boot.endpoint.web.WebEndpointExtension;
import org.springframework.boot.endpoint.web.WebEndpointResponse;

/**
 * @author Madhura Bhave
 */
@WebEndpointExtension(endpoint = ExampleEndpoint.class)
public class ExampleEndpointWebExtension {

	private final ExampleEndpoint delegate;

	public ExampleEndpointWebExtension(ExampleEndpoint delegate) {
		this.delegate = delegate;
	}

	@ReadOperation
	public WebEndpointResponse<String> read() {
		return new WebEndpointResponse<>("Hello web world");
	}
}

package com.example.demo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.boot.actuate.endpoint.mvc.AbstractEndpointMvcAdapter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Madhura Bhave
 */
public class ExampleMvcEndpoint extends AbstractEndpointMvcAdapter<ExampleEndpoint> {

	private static final Log logger = LogFactory.getLog(ExampleEndpoint.class);

	public ExampleMvcEndpoint(ExampleEndpoint
			delegate) {
		super(delegate);
	}

	@GetMapping
	@ResponseBody
	public String get() {
		return "hello web world";
	}

	@PostMapping
	@ResponseBody
	public void set(@RequestBody String value) {
		logger.info("Printing the value " + value);
	}

}

package com.cg.micoservice.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.micoservice.limitsservice.bean.LimitConfiguration;

@RestController
public class LimitConfigurationController {
	@Autowired
	private Configuration configuration;

	@GetMapping(path = "/limit")
	public LimitConfiguration retriveLimit() {
		return new LimitConfiguration(configuration.getMinimum(),configuration.getMaximum());
	}
}

package com.in28minutes.rest.webservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.rest.webservices.limitsservice.bean.LimitsConfiguration;
@RestController
public class LimitsConfigurationController {
	@Autowired
	Configuration configuration;
	@GetMapping("/limits")
	public LimitsConfiguration retrieveLimitsFromConfiurations() {
		return new LimitsConfiguration(configuration.getMaximum(), configuration.getMinimum());
	}

}
 
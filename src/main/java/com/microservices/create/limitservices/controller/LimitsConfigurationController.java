package com.microservices.create.limitservices.controller;

import com.microservices.create.limitservices.bean.LimitsConfiguration;
import com.microservices.create.limitservices.configuration.ConfigurationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

    @Autowired
    private ConfigurationService configurationService;

    @GetMapping("/limits")
    public LimitsConfiguration retrieveLimitsFromConfiguration()
    {
        return new LimitsConfiguration(configurationService.getMaximum(),configurationService.getMinimum());
    }
}

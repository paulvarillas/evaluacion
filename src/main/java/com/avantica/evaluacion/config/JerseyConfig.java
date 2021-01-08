package com.avantica.evaluacion.config;

import com.avantica.evaluacion.controller.PayOrderController;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig {

  public JerseyConfig() {
    register(PayOrderController.class);
  }

}
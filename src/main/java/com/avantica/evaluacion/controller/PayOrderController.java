package com.avantica.evaluacion.controller;

import com.avantica.evaluacion.service.PayOrderService;
import com.avantica.evaluacion.service.bean.PayOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import java.util.List;

@Component
@Path("/payorder")
public class PayOrderController {

  @Autowired
  private PayOrderService payOrderService;

  @GET
  @Produces("application/json")
  public List<PayOrder> getPayOrders(@QueryParam("officeId") String officeId,
                                     @QueryParam("moneyType") String moneyType) {
    return payOrderService.getPayOrders(officeId, moneyType);
  }
}

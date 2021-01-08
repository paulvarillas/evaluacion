package com.avantica.evaluacion.controller;

import com.avantica.evaluacion.service.PayOrderService;
import com.avantica.evaluacion.service.bean.PayOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
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

  @POST
  @Produces("application/json")
  public PayOrder createPayOrder(@QueryParam("amount") String amount,
                                 @QueryParam("moneyType") String moneyType,
                                 @QueryParam("payDate") String payDate,
                                 @QueryParam("officeId") String officeId) {
    return payOrderService.createPayOrder(amount, moneyType, payDate, officeId);
  }
}

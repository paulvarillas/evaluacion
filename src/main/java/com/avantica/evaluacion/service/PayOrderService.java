package com.avantica.evaluacion.service;

import com.avantica.evaluacion.service.bean.PayOrder;

import java.util.List;

public interface PayOrderService {
  List<PayOrder> getPayOrders(String officeId, String moneyType);
  PayOrder createPayOrder( String amount, String moneyType, String payDate, String officeId);
}

package com.avantica.evaluacion.service.impl;

import com.avantica.evaluacion.service.PayOrderService;
import com.avantica.evaluacion.service.bean.PayOrder;

import java.util.ArrayList;
import java.util.List;

public class PayOrderServiceImpl implements PayOrderService {
  @Override
  public List<PayOrder> getPayOrders(String officeId, String moneyType) {
    return new ArrayList<>();
  }
}

package com.avantica.evaluacion.service.bean;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PayOrder {
  private int id;
  private String amount;
  private String moneyType;
  private String status;
  private String payDate;
}

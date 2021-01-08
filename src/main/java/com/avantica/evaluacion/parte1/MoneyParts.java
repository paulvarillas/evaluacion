package com.avantica.evaluacion.parte1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MoneyParts {
  private static BigDecimal[] denominaciones = new BigDecimal[] {
      new BigDecimal("0.05"),
      new BigDecimal("0.1"),
      new BigDecimal("0.2"),
      new BigDecimal("0.5"),
      new BigDecimal("1.0"),
      new BigDecimal("2.0"),
      new BigDecimal("5.0"),
      new BigDecimal("10.0"),
      new BigDecimal("20.0"),
      new BigDecimal("50.0"),
      new BigDecimal("100.0"),
      new BigDecimal("200.0")};

  public static void main(String[] args){
    build( "10.5");
  }

  private static void build(String cadenaMonto) {
    BigDecimal monto = BigDecimal.valueOf(Double.parseDouble(cadenaMonto));
    List<List<BigDecimal>> resultado = getCombinations(monto, new ArrayList<>());
    printResults(resultado);
  }

  private static List<List<BigDecimal>> getCombinations(BigDecimal monto, List<BigDecimal> combinacionPrevia) {
    List<List<BigDecimal>> resultado = new ArrayList<>();
    for (BigDecimal denom : denominaciones) {
      if (denom.compareTo(monto) == 1) {
        continue;
      }
      List<BigDecimal> combiTemp = new ArrayList<>(combinacionPrevia);
      BigDecimal montoTemp = monto;
      while (montoTemp.compareTo(denom) >= 0) {
        montoTemp = montoTemp.subtract(denom);
        combiTemp.add(denom);
      }

      if (montoTemp.compareTo(BigDecimal.ZERO) == 0) {
        resultado.add(combiTemp);
      } else {
        resultado.addAll(getCombinations(montoTemp, combiTemp));
      }
    }
    return resultado;
  }

  private static void printResults(List<List<BigDecimal>> resultado) {
    resultado.stream().forEach(
        r -> System.out.println(r.stream().map(Object::toString)
            .collect(Collectors.joining(", ", "[", "]")))
    );
  }
}
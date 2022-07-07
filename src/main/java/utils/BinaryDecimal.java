package utils;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

public class BinaryDecimal {
  @Getter
  private enum BinaryCode {
    ONE('1', "0001"),
    TWO('2', "0010"),
    THREE('3', "0011"),
    FOUR('4', "0100"),
    FIVE('5', "0101"),
    SIX('6', "0110"),
    SEVEN('7', "0111"),
    EIGHT('8', "1000"),
    NINE('9', "1001"),
    A('A', "1010"),
    B('B', "1011"),
    C('C', "1100"),
    D('D', "1101"),
    E('E', "1110"),
    F('F', "1111");
    private char c;
    private String code;

    BinaryCode(char c, String code) {
      this.c = c;
      this.code = code;

    }

  }

  public static String decimaToBinary(int d) {
    String binary = "";
    while (d != 0) {
      binary = BinaryCode.values()[(d % 10) - 1].getCode() + binary;
      d /= 10;
    }
    return binary;
  }

  public static int binaryToDecimal(String binary) {
    String num = "";
    for (int x = 0; x < binary.length(); x += 4) {
      String temp = binary.substring(x, x + 4);
      num += Arrays.stream(BinaryCode.values()).filter(binaryCode -> binaryCode.getCode().equals(temp)).findFirst().orElseThrow(IllegalArgumentException::new).getC();
    }
    return Integer.parseInt(num);
  }
}

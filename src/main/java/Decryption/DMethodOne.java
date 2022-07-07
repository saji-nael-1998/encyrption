package Decryption;

public class DMethodOne implements IDecryption {
  @Override
  public String decrypt(String ciphertext) {
    String plaintext = "";
    for (int x = 0; x < ciphertext.length(); x++) {
      int currentChar = ciphertext.charAt(x);

      //step 1
      //convert from decimal to binary
      String binaryCode = Integer.toBinaryString(currentChar);
      System.out.println(binaryCode+"s");
      //step 2
      binaryCode = binaryCode.replaceAll("1", "0");
      System.out.println(binaryCode);
    }
    return null;
  }
}

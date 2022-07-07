package Encryption;

import BinaryTree.BinaryTree;

public class EMethodOne implements IEncryption {
  @Override
  public String encrypt(String plaintext) {
    String ciphertext = "";
    for (int x = 0; x < plaintext.length(); x++) {
      int currentChar = plaintext.charAt(x);

      //step 1
      //convert from decimal to binary
      String binaryCode = Integer.toBinaryString(currentChar);

      //step 2
      //shuffle binary code
      BinaryTree binaryTree = new BinaryTree();

      for (int y = 0; y < binaryCode.length(); y++) {
        char currentBit = binaryCode.charAt(y);
        binaryTree.add(currentBit );
      }
      //set the new binary code
      binaryCode = binaryTree.preorder();

      //step 3
      // convert from binary to decimal
      ciphertext += (char) Integer.parseInt(binaryCode, 2);
    }
    return ciphertext;
  }
}

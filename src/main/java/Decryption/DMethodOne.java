package Decryption;

import BinaryTree.BinaryTree;
import utils.BinaryDecimal;

public class DMethodOne implements IDecryption {
  @Override
  public String decrypt(String ciphertext) {
    String plaintext = "";
    for (int x = 0; x < ciphertext.length(); x++) {
      int currentChar = ciphertext.charAt(x);
      //step 1
      //convert from decimal to binary
      String binaryCode = BinaryDecimal.decimaToBinary(currentChar);
      //step 2
      //repeat preorder 4 times
      for (int y = 0; y < 4; y++) {
        BinaryTree binaryTree = new BinaryTree();
        for (int z = 0; z < binaryCode.length(); z++) {
          binaryTree.add(binaryCode.charAt(z));
        }
        binaryCode = binaryTree.preorder();
      }
      //step 3
      //convert from binary to decimal
      plaintext += (char) BinaryDecimal.binaryToDecimal(binaryCode);
    }
    return plaintext;
  }
}

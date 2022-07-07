import Decryption.DMethodOne;
import Decryption.IDecryption;
import Encryption.IEncryption;
import Encryption.EMethodOne;
import utils.BinaryDecimal;

public class Main {
  public static void main(String[] args) {
    IEncryption preorder=new EMethodOne();
    String plaintext="A";
    String ciphertext=preorder.encrypt(plaintext);
    System.out.println(ciphertext);

    IDecryption pre=new DMethodOne();
    System.out.println(pre.decrypt(ciphertext));

  }
}

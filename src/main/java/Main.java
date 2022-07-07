import Decryption.DMethodOne;
import Decryption.IDecryption;
import Encryption.IEncryption;
import Encryption.EMethodOne;

public class Main {
  public static void main(String[] args) {
    IEncryption preorder=new EMethodOne();
    String plaintext="A";
    System.out.println(preorder.encrypt(plaintext));

    IDecryption pre=new DMethodOne();
    System.out.println(pre.decrypt(preorder.encrypt(plaintext)));
  }
}

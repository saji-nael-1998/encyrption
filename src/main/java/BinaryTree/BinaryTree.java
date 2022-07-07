package BinaryTree;

import BinaryTree.Treversal.IBinaryTreeTreversal;
import BinaryTree.Treversal.Inorder;
import BinaryTree.Treversal.Postorder;
import BinaryTree.Treversal.Preorder;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
  @Getter
  public static class Node {
    char bit;
  }

  List<Node> root;

  public void add(char bit) {
    if (root == null)
      root = new ArrayList<>();
    root.add(newNode(bit));
  }


  public Node newNode(char k) {
    Node node = new Node();
    node.bit = k;
    return node;
  }

  public String preorder() {
    IBinaryTreeTreversal preorder = new Preorder(root);
    return preorder.traversal("", 0);
  }
  public String inorder() {
    IBinaryTreeTreversal inorder = new Inorder(root);
    return inorder.traversal("", 0);
  }

  public String postorder() {
    IBinaryTreeTreversal postorder = new Postorder(root);
    return postorder.traversal("", 0);
  }


}

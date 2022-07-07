package BinaryTree.Treversal;


import java.util.List;

public class Preorder implements IBinaryTreeTreversal {
  private List<BinaryTree.BinaryTree.Node> root;

  public Preorder(List<BinaryTree.BinaryTree.Node> root) {
    this.root = root;
  }

  @Override
  public String traversal(String trevesal, int index) {
    if (root == null)
      return trevesal;
    if (index > root.size() - 1)
      return trevesal;
    trevesal += root.get(index).getBit();
    trevesal = traversal(trevesal, 2 * index + 1);
    trevesal = traversal(trevesal, 2 * index + 2);
    return trevesal;
  }
}

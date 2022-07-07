package BinaryTree.Treversal;



import java.util.List;

public class Inorder implements IBinaryTreeTreversal {
  private List<BinaryTree.BinaryTree.Node> root;

  public Inorder(List<BinaryTree.BinaryTree.Node> root) {
    this.root = root;
  }

  @Override
  public String traversal(String trevesal, int index) {
    if (index > root.size() - 1)
      return trevesal;
    trevesal = traversal(trevesal, 2 * index + 1);
    trevesal += root.get(index).getBit();
    trevesal = traversal(trevesal, 2 * index + 2);
    return trevesal;
  }
}

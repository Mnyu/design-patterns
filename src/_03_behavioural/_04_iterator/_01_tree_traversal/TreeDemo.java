package _03_behavioural._04_iterator._01_tree_traversal;

public class TreeDemo {
    public static void main(String[] args) {
        Node<Integer> root = new Node<>(1, new Node<>(2), new Node<>(3));
        InOrderIterator<Integer> it = new InOrderIterator<>(root);
        while (it.hasNext()) {
            System.out.print("" + it.next() + ",");
        }
        System.out.println();

        BinaryTree<Integer> tree = new BinaryTree<>(root);
        for (int n : tree) {
            System.out.print("" + n + ",");
        }
        System.out.println();

    }
}

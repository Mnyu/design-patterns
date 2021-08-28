package _03_behavioural._04_iterator._01_tree_traversal;

import java.util.Iterator;

public class InOrderIterator<T> implements Iterator<T> {

    private Node<T> root;
    private Node<T> current;
    private boolean yieldedStart;

    public InOrderIterator(Node<T> root) {
        this.root = this.current = root;
        while (current.getLeft() != null) {
            current = current.getLeft();
        }
    }

    private boolean hasRightmostParent(Node<T> node) {
        if (node.getParent() == null) {
            return false;
        } else {
            return (node == node.getParent().getLeft()) || hasRightmostParent(node.getParent());
        }
    }

    @Override
    public boolean hasNext() {
        return current.getLeft() != null
                || current.getRight() != null
                || hasRightmostParent(current);
    }

    @Override
    public T next() {
        if (!yieldedStart) {
            yieldedStart = true;
            return current.getValue();
        }

        if (current.getRight() != null) {
            current = current.getRight();
            while (current.getLeft() != null)
                current = current.getLeft();
            return current.getValue();
        } else {
            Node<T> p = current.getParent();
            while (p != null && current == p.getRight()) {
                current = p;
                p = p.getParent();
            }
            current = p;
            return current.getValue();
        }
    }
}


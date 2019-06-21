package binaryTree;

import java.util.EmptyStackException;

public class Node {
    protected Node left;
    protected Node right;
    protected Node parent;
    protected int value;
    protected int height;

    public Node(int value) {
        left = null;
        right = null;
        this.value = value;
        height = 1;
    }

    public void calculateHigh() {
        height = 1;
        if (left != null) {
            height += left.height;
        }
        if (right != null) {
            height += right.height;
        }
    }

    public int getBalance()
    {
        int balance = 0;
        if (left != null) {
            balance += left.height;
        }
        if (right != null) {
            balance -= right.height;
        }

        return balance;
    }

    public Node balance() {
        calculateHigh();
        int balance = getBalance();
        if (balance > 1) {
            if (left.getBalance() < 0) {
                left = left.rotateLeft();
            }
            return rotateRight();
        } else if (balance < -1) {
            if (right.getBalance() > 0) {
                right = right.rotateRight();
            }
            return rotateLeft();
        }

        return this;
    }

    public Node rotateRight() {
        Node temp = left;
        left = temp.right;
        calculateHigh();
        temp.right = this;
        temp.calculateHigh();
        temp.parent = parent;
        return temp;
    }

    public Node rotateLeft() {
        Node temp = right;
        right = temp.left;
        calculateHigh();
        temp.left = this;
        temp.calculateHigh();
        temp.parent = parent.parent;
        return temp;
    }
}

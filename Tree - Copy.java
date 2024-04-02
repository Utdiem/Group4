/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newTree;

/**
 *
 * @author udiem
 */
class TNode {

    int data;
    TNode left, right;

    TNode(int x) {
        data = x;
        left = right = null;
    }

    TNode(int x, TNode ll, TNode rr) {
        data = x;
        left = ll;
        right = rr;
    }
}

class MyBinaryTree {

    TNode root;

    void taocayT() {
        TNode A = new TNode(7, new TNode(2), new TNode(6));
        TNode B = new TNode(5, null, new TNode(9));
        root = new TNode(2, A, B);
    }

    void duyet1(TNode T) {
        if (T != null) {
            System.out.println(" " + T.data);
            duyet1(T.left);
            duyet1(T.right);
        }
    }

    void duyettientu() {
        duyet1(root);
    }

    void duyet2(TNode T) {
        if (T != null) {
            duyet2(T.left);
            System.out.println(" " + T.data);
            duyet2(T.right);
        }
    }

    void duyettrungtu() {
        duyet2(root);
    }

    public static void main(String[] args) {
        MyBinaryTree T = new MyBinaryTree();
        T.taocayT();
        T.duyettientu();
        T.duyettrungtu();
    }

}

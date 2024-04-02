package taocay;

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
public class MyBinaryTree {

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
}

public class SinglyNode {
    int value;
    SinglyNode next;

    public SinglyNode(int v) {
//        value=v;
//        next=null;
        this(v,null);
    }

    public SinglyNode(int v,SinglyNode n) {
        value=v;
        next=n;
    }
}

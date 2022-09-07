public class SinglyLinkedList {
    SinglyNode head;
    SinglyNode tail;
    int count;
//constructor method

//    whenn linked list is created there will be no nodes in the
    //list so head and tail is null
    //count is 0

    public SinglyLinkedList() {
        head=null;
        tail=null;
        count=0;

    }
    public boolean isEmpty(){
//        if (head==null){
//            return true;
//        }else {
//            return false;
//        }

//        මේක එකපාර කරන්න පුලුවන් මේම
        return head == null;
    }
    public void printAll(){
        if (isEmpty()){
            System.out.println("empty");
        }else {
            SinglyNode current=head;
            while (current !=null){
                System.out.println(current.value+" ");
                current=current.next;
            }

        }
    }
    public void addToHead(int val){
        SinglyNode newNode= new SinglyNode(val);

        if (isEmpty()){
//           SinglyNode newNode= new SinglyNode(val);
        }else {
//            SinglyNode newNode=new SinglyNode(val);
            newNode.next=head;
            head=newNode;
            count++;
        }
    }
}

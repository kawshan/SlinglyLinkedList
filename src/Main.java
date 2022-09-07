public class Main {
    public static void main(String[] args) {
       SinglyNode newNode  =new SinglyNode(8);
            SinglyLinkedList marks=new SinglyLinkedList();
        System.out.println(marks.isEmpty());
        marks.addToHead(80);
        System.out.println(marks.isEmpty());
        marks.printAll();


    }

}

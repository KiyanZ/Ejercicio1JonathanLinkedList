public class Main {
    public static void main(String[] args) {

        MyLinkedList chiiLinkedList = new MyLinkedList();
        chiiLinkedList.insertFirst(1);
        chiiLinkedList.insertLast(3);
        chiiLinkedList.insertLast(6);
        chiiLinkedList.insertLast(9);
        chiiLinkedList.insertLast(12);
        chiiLinkedList.insertLast(15);
        chiiLinkedList.print();
        System.out.println("NEW LINE");
        chiiLinkedList.getObjectAtPosition(3);
        chiiLinkedList.getFirstObject();
        chiiLinkedList.getLastObject();
    }
}

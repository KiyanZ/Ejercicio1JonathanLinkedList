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

        System.out.println();
        System.out.println();

        GenericLinkedList<Integer> ez = new GenericLinkedList<>();
        ez.insertFirst(1);
        ez.insertLast(2);
        ez.insertLast(2);
        ez.insertLast(2);
        ez.print();
        System.out.println("NEW LINE");
        ez.getObjectAtPosition(3);
        ez.getFirstObject();
        ez.getLastObject();
    }
}

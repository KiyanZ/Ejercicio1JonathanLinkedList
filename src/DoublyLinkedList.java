public class DoublyLinkedList<E> {

    private DoublyLinkedList.Element<E> firstElement = null;


    public DoublyLinkedList() {
    }

    public void insertFirst(E first) {
        DoublyLinkedList.Element<E> newElement = new DoublyLinkedList.Element<>(first);
        newElement.next = firstElement;
        newElement.prev = null;
        if (firstElement != null){
            firstElement.prev = newElement;
        }
        firstElement = newElement;
    }


    public void insertLast(E data) {
        DoublyLinkedList.Element<E> newElement = new DoublyLinkedList.Element<>(data);
        if (firstElement == null) {
            newElement.prev = null;
            firstElement = newElement;
        } else {
            DoublyLinkedList.Element<E> currentElement = firstElement;
            while (currentElement.next != null) {
                currentElement = currentElement.next;
            }
            currentElement.next = newElement;
            newElement.prev = currentElement;
        }
    }

    public void print() {
        DoublyLinkedList.Element<E> currentElement = getFirstObject();
        while (currentElement != null) {
            System.out.println(currentElement.data + " ");
            currentElement = currentElement.next;
        }
    }

    public void printFromLast() {
        DoublyLinkedList.Element<E> currentElement = getLastObject();
        System.out.println("Traversal in reverse direction");
        while (currentElement != null) {
            System.out.print(currentElement.data + " ");
            currentElement = currentElement.prev;
        }
    }


    public boolean isEmpty() {
        //if first element is null there is no list
        DoublyLinkedList.Element<E> currentElement = firstElement;
        if (currentElement == null) {
            System.out.println("Linked List is Empty");
            return true;
        }
        return false;
    }

    public Element<E> getFirstObject() {
        System.out.println(firstElement.data);
        return firstElement;
    }

    public Element<E> getLastObject() {
        DoublyLinkedList.Element<E> currentElement = firstElement;
        DoublyLinkedList.Element<E> lastElement = null;

        while (currentElement != null) {
            if (currentElement.next == null) {
                lastElement = currentElement;
            }
            currentElement = currentElement.next;
        }
        System.out.println(lastElement.data);
        return lastElement;
    }

    public Element<E> getObjectAtPosition(int index) {
        DoublyLinkedList.Element<E> currentElement = firstElement;
        int i = 0;
        if (index == 0) {
            System.out.println(firstElement.data);
            return firstElement;
        } else {
            while (currentElement.next != null) {
                if (i == index-1) {
                    System.out.println(currentElement.data);
                    return currentElement;
                }
                currentElement = currentElement.next;
                i++;
            }
            System.out.println("ERROR");
        }
        return null;
    }
    static class Element<E> {

        private E data;
        private Element<E> next;
        private Element<E> prev;

        public Element(E data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

        public void setData(E data) {
            this.data = data;
        }

        public Element<E> getNext() {
            return next;
        }

        public void setNext(Element<E> next) {
            this.next = next;
        }

        public void setPrev(Element<E> prev) {
            this.prev = prev;
        }

        public Element<E> getPrev() {
            return prev;
        }

        public void delete() {
            this.data = null;
            this.next = null;
        }
    }
}

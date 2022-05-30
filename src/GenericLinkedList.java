public class GenericLinkedList<E>{

    private Element<E> firstElement = null;


    public GenericLinkedList() {
    }

    public void insertFirst(E first) {
        Element<E> newElement = new Element<>(first);
        newElement.next = firstElement;
        firstElement = newElement;
    }

    public void insertLast(E last) {
        Element<E> newElement = new Element<>(last);
        if (firstElement == null) {
            firstElement = newElement;
        } else {
            Element<E> currentElement = firstElement;
            while (currentElement.next != null) {
                currentElement = currentElement.next;
            }
            currentElement.next = newElement;
        }
    }

    public void print() {
        Element<E> currentElement = firstElement;
        while (currentElement != null) {
            System.out.println(currentElement.data + " ");
            currentElement = currentElement.next;
        }
    }

    public boolean isEmpty() {
        //if first element is null there is no list
        Element<E> currentElement = firstElement;
        if (currentElement == null) {
            System.out.println("Linked List is Empty");
            return true;
        }
        return false;
    }

    public Object getFirstObject() {
        System.out.println(firstElement.data);
        return firstElement;
    }

    public Object getLastObject() {
        Element<E> currentElement = firstElement;
        Element<E> lastElement = null;

        while (currentElement != null) {
            if (currentElement.next == null) {
                lastElement = currentElement;
            }
            currentElement = currentElement.next;
        }
        System.out.println(lastElement.data);
        return lastElement;
    }

    public Object getObjectAtPosition(int index) {
        Element<E> currentElement = firstElement;
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

        public Element(E data) {
            this.data = data;
            this.next = null;
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

        public void delete() {
            this.data = null;
            this.next = null;
        }
    }
}

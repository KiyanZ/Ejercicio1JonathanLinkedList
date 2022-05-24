public class MyLinkedList {

    private Element firstElement = null;


    public MyLinkedList() {
    }

    public void insertFirst(Object obj) {
        Element newElement = new Element(obj);
        newElement.next = firstElement;
        firstElement = newElement;
    }

    public void insertLast(Object obj) {
        Element newElement = new Element(obj);
        if (firstElement == null) {
            firstElement = newElement;
        } else {
            Element currentElement = firstElement;
            while (currentElement.next != null) {
                currentElement = currentElement.next;
            }
            currentElement.next = newElement;
        }
    }

    public void print() {
        Element currentElement = firstElement;
        while (currentElement != null) {
            System.out.println(currentElement.object + " ");
            currentElement = currentElement.next;
        }
    }

    public boolean isEmpty() {
        //if first element is null there is no list
        Element currentElement = firstElement;
        if (currentElement == null) {
            System.out.println("Linked List is Empty");
            return true;
        }
        return false;
    }

    public Object getFirstObject() {
        System.out.println(firstElement.object);
        return firstElement;
    }

    public Object getLastObject() {
        Element currentElement = firstElement;
        Element lastElement = null;

        while (currentElement != null) {
            if (currentElement.next == null) {
                lastElement = currentElement;
            }
            currentElement = currentElement.next;
        }
        System.out.println(lastElement.object);
        return lastElement;
    }

    public Object getObjectAtPosition(int index) {
        Element currentElement = firstElement;
        int i = 0;
        if (index == 0) {
            System.out.println(firstElement.object);
            return firstElement;
        } else {
            while (currentElement.next != null) {
                if (i == index-1) {
                    System.out.println(currentElement.object);
                    return currentElement;
                }
                currentElement = currentElement.next;
                i++;
            }
            System.out.println("ERROR");
        }
        return null;
    }

    private static class Element {

        private Object object;
        private Element next = null;

        public Element(Object newObject) {
            this.object = newObject;
        }

        public void setNext(Element newNext) {
            this.next = newNext;
        }

        public Element getNext() {
            System.out.println(next);
            return next;
        }

        public Object getObject() {
            System.out.println(object);
            return object;
        }

        public void setObject(Object newObject) {
            this.object = newObject;
        }

        public void delete() {
            this.object = null;
            this.next = null;
        }
    }

}

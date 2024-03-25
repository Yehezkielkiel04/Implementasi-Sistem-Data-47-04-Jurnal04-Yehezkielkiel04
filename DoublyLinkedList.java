import java.util.ListIterator;

public class DoublyLinkedList {
    private Node head, tail;

    public void addFirst(Tugas data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Tugas data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void deleteFirst() {
        if (head != null) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
        }
    }

    public void deleteLast() {
        if (tail != null) {
            tail = tail.prev;
            if (tail != null) {
                tail.next = null;
            } else {
                head = null;
            }
        }
    }

    public void deleteByMataKuliah(String mataKuliah) {
        Node current = head;
        while (current != null) {
            if (current.data.mataKuliah.equals(mataKuliah)) {
                if (current == head) {
                    deleteFirst();
                } else if (current == tail) {
                    deleteLast();
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                break;
            }
            current = current.next;
        }
    }

    public void deleteByNamaTugas(String namaTugas) {
        Node current = head;
        while (current != null) {
            if (current.data.namaTugas.equals(namaTugas)) {
                if (current == head) {
                    deleteFirst();
                } else if (current == tail) {
                    deleteLast();
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                break;
            }
            current = current.next;
        }
    }

    public void printList(boolean fromHead) {
        Node current = fromHead ? head : tail;
        while (current != null) {
            System.out.println(current.data);
            current = fromHead ? current.next : current.prev;
        }
    }

    public void sortByDeadline() {
        // Implementasi pengurutan (sorting) di sini
    }
}


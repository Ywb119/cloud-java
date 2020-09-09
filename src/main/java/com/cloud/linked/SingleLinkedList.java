package com.cloud.linked;

public class SingleLinkedList {

    private Node first = new Node(0, "", "");

    public void add(Node node) {
        Node temp = first;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        temp.setNext(node);
    }

    public void addSort(Node node) throws Exception {
        Node temp = first;
        while (temp.getNext() != null) {
            if (temp.getNext().getId() > node.getId()) {
                //找到元素
                break;
            } else if (temp.getNext().getId() == node.getId()) {
                throw new Exception("数据重复");
            }
            temp = temp.getNext();
        }
        //设置指向
        node.setNext(temp.getNext());
        temp.setNext(node);
    }

    public void list() {
        if (first.getNext() == null) {
            System.out.println("空！！");
            return;
        }
        Node temp = first.getNext();
        while (temp != null) {
            System.out.println(temp);
            temp = temp.getNext();
        }
    }


    public void update(Node node) throws Exception {
        if (first.getNext() == null) {
            throw new Exception("空指针");
        }

        Node temp = first.getNext();
        while (temp != null) {
            if (temp.getId() == node.getId()) {
                temp.setName(node.getName());
                break;
            }
            temp = temp.getNext();
        }
    }


    public void del(int no) {
        Node temp = first;
        while (temp.getNext() != null) {
            if (temp.getNext().getId() == no) {
                //找到链表中需要删除元素的钱一个位置，指向到此位置的下一个的下一个位置 替换掉原来的指向
                temp.setNext(temp.getNext().getNext());
                break;
            }
            temp = temp.getNext();
        }
    }
}

class SingleLinkedMain {


    public static void main(String[] args) throws Exception {
        Node node = new Node(1, "林某某", "财经");
        Node node2 = new Node(3, "李某某", "业务");
        Node node1 = new Node(2, "孙某某", "运营");

        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.addSort(node);
        singleLinkedList.addSort(node2);
        singleLinkedList.addSort(node1);
        System.out.println("============================");
        Node node0 = new Node(1, "sun某某", "财经");
        singleLinkedList.update(node0);
        singleLinkedList.del(3);
        singleLinkedList.list();

    }
}

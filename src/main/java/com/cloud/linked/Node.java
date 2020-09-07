package com.cloud.linked;

public class Node {

    private int id;
    private String name;
    private String dept;
    private Node next;

    public Node() {

    }

    public Node(int id, String name, String dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public Node getNext() {
        return next;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Node node = new Node();
        node.setId(1);
        node.setName("99");
        node.setDept("990");


        Node node1 = new Node();
        node1.setId(2);
        node1.setName("991");
        node1.setDept("9901");

        Node temp = node;
        temp.setName("887");
        temp.setNext(node);


        temp = temp.getNext();
        temp.setName("777");


        System.out.println(temp);
        System.out.println(node);
        System.out.println(node.getNext());

    }
}

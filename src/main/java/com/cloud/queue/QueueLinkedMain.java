package com.cloud.queue;

import java.util.Scanner;


/**
 * 队列特点：先进先出
 * 数组
 * 链表
 * <p>
 * 缺点：数组只能使用一次
 */
public class QueueLinkedMain {

    /**
     * 队列最大容量
     */
    private int maxSize;

    /**
     * 队列尾
     */
    private int rear;

    /**
     * 队列头
     */
    private int front;

    /**
     * 队列头
     */
    private int[] array;


    /**
     * asdfE333
     *
     * @param arrMaxSize 容器最大值
     */
    public QueueLinkedMain(int arrMaxSize) {
        this.maxSize = arrMaxSize;
        array = new int[maxSize];
    }

    public boolean isFull() {
        return (this.rear + 1) % this.maxSize == this.front;
    }

    public boolean isEmpty() {
        return rear == front;
    }

    public void add(int data) throws Exception {
        if (isFull()) {
            throw new Exception("队列满");
        }
        array[rear] = data;
        //将rear后移 这里考虑取模
        rear = (rear + 1) % maxSize;
    }

    public int get() throws Exception {
        if (isEmpty()) {
            throw new Exception("队列空");
        }
        //先把front对应的值保存再一个临时变量，front后移，临时变量返回
        int value = array[front];
        //考虑取模
        front = (front + 1) % maxSize;
        return value;
    }

}

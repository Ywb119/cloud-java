package com.cloud.queue;

import java.util.Scanner;


/**
 * 队列特点：先进先出
 * 数组
 * 链表
 * <p>
 * 缺点：数组只能使用一次
 */
public class QueueArrayMain {

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


    public QueueArrayMain(int maxSize) {
        this.maxSize = maxSize;
        //初始化数组
        array = new int[maxSize];
        //指向队列数据的前一个位置
        front = -1;
        //队列最后一个数据
        rear = -1;
    }

    public boolean isEmpty() {
        return rear == front;
    }

    public boolean isFull() {
        return maxSize - 1 == rear;
    }

    /**
     * 加队列
     */
    public void add(int data) {
        if (isFull()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        //操作尾部指针
        rear++;
        array[rear] = data;
    }

    /**
     * 取队列
     */
    public int get() {
        if (isEmpty()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        front++;
        System.out.println(front);
        return array[front];
    }

    public static void main(String[] args) {
        QueueArrayMain queue = new QueueArrayMain(3);
        Scanner scan = new Scanner(System.in);
        char key = ' ';
        boolean loop = true;
        while (loop) {
            key = scan.next().charAt(0);
            switch (key) {
                case 'a':
                    System.out.println("插入一条数据");
                    int value = scan.nextInt();
                    queue.add(value);
                    break;
                case 'g':
                    try {
                        int res = queue.get();
                        System.out.printf("获取元素值为"+ res);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'e':
                    //退出
                    scan.close();
                    loop = false;
                    break;
                default:
                    break;
            }
        }
    }
}

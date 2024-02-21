package structural.bridge.test;

import structural.bridge.impl.ArrayImpl;
import structural.bridge.impl.LinkedListImpl;
import structural.bridge.list.Queue;
import structural.bridge.list.Stack;

public class BridgeTest {

    public static void main(String[] args) {
        Stack<String> linkedStack = new Stack<>(new LinkedListImpl<>());
        linkedStack.push("aaa");
        linkedStack.push("bbb");
        linkedStack.push("ccc");

        System.out.println(linkedStack.toString());
        System.out.println(linkedStack.pop());
        System.out.println(linkedStack.pop());
        System.out.println(linkedStack.pop());



        Stack<String> arrayStack = new Stack<>(new ArrayImpl<>());
        arrayStack.push("aaa");
        arrayStack.push("bbb");
        arrayStack.push("ccc");

        System.out.println(arrayStack.toString());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());


        Queue<String> arrayQueue = new Queue<>(new ArrayImpl<>());
        arrayQueue.enQueue("aaa");
        arrayQueue.enQueue("bbb");
        arrayQueue.enQueue("ccc");

        System.out.println(arrayQueue.toString());
        System.out.println(arrayQueue.deQueue());
        System.out.println(arrayQueue.deQueue());
        System.out.println(arrayQueue.deQueue());
    }
}

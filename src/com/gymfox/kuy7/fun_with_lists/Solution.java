package com.gymfox.kuy7.fun_with_lists;

import java.util.function.Predicate;

public class Solution {
    static int length(Node head) {
        return head == null ? 0 : length(head.next) + 1;
    }

    static <T> Node<T> filter(Node<T> head, Predicate<T> p) {
        while ( (head != null) && !p.test((T) head.data) ) head = head.next;
        return head == null ? null : new Node(head.data, Solution.filter(head.next, p));
    }
}

class Node<T> {
    public Object data;
    public Node next;

    Node(T data, Node next) {
        this.data = data;
        this.next = next;
    }

    Node(T data) {
        this(data, null);
    }
}
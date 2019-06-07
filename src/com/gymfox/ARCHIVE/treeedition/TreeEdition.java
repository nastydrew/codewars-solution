package com.gymfox.ARCHIVE.treeedition;

public class TreeEdition {
    static TreeEdition flatten(ListNode head) {
        return null;
    }
}

class TreeNode {
    public TreeNode left;
    public TreeNode right;
    public ListNode value;

    TreeNode(ListNode value, TreeNode left, TreeNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    TreeNode(ListNode value) {
        this(value, null, null);
    }
}

class ListNode {
    public int data;
    public ListNode next;

    ListNode(int data, ListNode next) {
        this.data = data;
        this.next = next;
    }

    ListNode(int data) {
        this(data, null);
    }
}

class Helpers {
    public static void testFlatten(Object o, Object o1) {
    }
}
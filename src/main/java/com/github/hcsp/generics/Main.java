package com.github.hcsp.generics;

import java.util.*;

public class Main {
//    static class IntBinaryTreeNode {
//        int value;
//        IntBinaryTreeNode left;
//        IntBinaryTreeNode right;
//    }
//
//    static class StringBinaryTreeNode {
//        String value;
//        StringBinaryTreeNode left;
//        StringBinaryTreeNode right;
//    }
//
//    static class DoubleBinaryTreeNode {
//        double value;
//        DoubleBinaryTreeNode left;
//        DoubleBinaryTreeNode right;
//    }

    // 你看，上面三种"二叉树节点"结构相似，内容重复，请将其泛型化，以节省代码
    static class BinaryTreeNode<T> {
        T value;
        BinaryTreeNode<T> left;
        BinaryTreeNode<T> right;
    }

    // 泛型化之后，请再编写一个算法，对二叉树进行中序遍历，返回中序遍历的结果
    public static <T> List<T> inorderTraversal(BinaryTreeNode<T> root) {
        List<T> list = new ArrayList<>();
        Stack<BinaryTreeNode<T>> stack = new Stack<>();
        BinaryTreeNode<T> binaryTreeNode = root;
        BinaryTreeNode<T> node;
        while (binaryTreeNode != null || !stack.isEmpty()) {
            if (binaryTreeNode == null) {
                node = stack.pop();
                list.add(node.value);
                binaryTreeNode = node.right;
            } else {
                stack.push(binaryTreeNode);
                binaryTreeNode = binaryTreeNode.left;
            }
        }
        return list;
    }
}

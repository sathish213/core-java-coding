package com.trees;

public class PathSum {
    static Node node;
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left = right = null;
        }

        public static void main(String[] args) {
            node = new Node(5);
            node.left = new Node(4);
            node.right = new Node(8);
            node.left.left =new Node(11);
            node.left.left.left = new Node(7);
            node.left.left.right = new Node(2);
            node.right.left = new Node(13);
            node.right.right = new Node(4);
            node.right.right.right = new Node(1);

            System.out.println(pathSum(node,18));
        }

        private static boolean pathSum(Node node, int sum) {
            if (node == null && sum == 0){
                return true;
            }
            if (node != null && sum <= 0){
                return false;
            }
            if (node == null && sum != 0){
                return false;
            }
            boolean isLeft = pathSum(node.left, sum-node.data);
            boolean isRight = pathSum(node.right, sum - node.data);

            if (isLeft || isRight){
                return true;
            }else return false;

        }

        private static boolean tempPathSum(Node node, int sum){
            if (node == null)
                return false;
            //leafNode is no childs
            if (node.left == null && node.right == null && sum-node.data == 0 ){
                return true;
            }

            return tempPathSum(node.right,sum-node.data) || tempPathSum(node.left, sum-node.data);
        }
    }
}

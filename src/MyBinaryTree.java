import java.util.Scanner;

public class MyBinaryTree {
    static class TreeNode {
        public TreeNode left;
        public TreeNode right;
        public char val;

        public TreeNode(char val) {
            this.val = val;
        }
    }
    public TreeNode root;
    public TreeNode temp=root;


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String init=scanner.next();
            /*System.out.println(init);*/

            MyBinaryTree myBinaryTree=new MyBinaryTree();
            myBinaryTree.initialTree(init);
            preOrder(myBinaryTree.root);
            midOrder(myBinaryTree.root);
            lastOrder(myBinaryTree.root);
            getHeight(myBinaryTree.root);
            getSize(myBinaryTree.root);
            getLeafSize(myBinaryTree.root);
        }
        //先序方法创建二叉树
        public static int index=0;//定义一个节点指针
        private void initialTree(String init){
            if (index<init.length()){


            if (init.charAt(0)=='#'){
                System.out.println("创建二叉树失败");
            }
            if (init.charAt(index)!='#') {
                if (index==0){
                    root=new TreeNode(init.charAt(index));
                }
                //添加左节点
//                D.initialTree()左节点递归


//                添加右节点


            }else{
                index++;
            }

            }


        }
        private void initialTreeOfPre(TreeNode root) {
            if (root==null)return;

        }

        //前序遍历
        private static void preOrder(TreeNode root) {
            if (root == null) return;
            System.out.println(root.val);
            preOrder(root.left);
            preOrder(root.right);
        }

        //中序遍历
        private static void midOrder(TreeNode root) {
            if (root == null) return;
            midOrder(root.left);
            System.out.println(root.val);
            midOrder(root.right);
        }

        //后序遍历
        private static void lastOrder(TreeNode root) {
            if (root == null) return;
            lastOrder(root.left);
            lastOrder(root.right);
            System.out.println(root.val);
        }

        //输出该二叉树的高度 思路：左子树的深度和右子树的深度的最大值+1
        private static int getHeight(TreeNode root) {
            if (root == null) {
                return 0;
            }
            int leftHeight = getHeight(root.left);
            int rightHeight = getHeight(root.right);
            int ret = Math.max(leftHeight, rightHeight) + 1;
            return ret;
        }

        //输出二叉树的全部结点数
        private static int usedSized = 0;

        private static void getSize(TreeNode root) {
            if (root == null) {
                return;
            }
            usedSized++;
            getSize(root.left);
            getSize(root.right);
        }

        //输出二叉树的叶子结点数
        private static int usedLeafs = 0;

        private static void getLeafSize(TreeNode root) {
            if (root == null) {
                return;
            }
            if (root.left == null && root.right == null) {
                usedLeafs++;
            }
            getLeafSize(root.left);
            getLeafSize(root.right);
        }


    }


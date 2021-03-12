package leetcode;

public class isValidSerialization_331 {
    static class Solution {
        public boolean isValidSerialization(String preorder) {
            //根结点的入度为0出度为2，其他非叶子结点的入度为1出度为2，叶子节点入度为1出度为0
            int outdegree = 1;
            boolean flag = false;
            String[] node = preorder.split(",");
            for(int i=0;i<node.length;i++){
                if(node[i].equals("#")){
                    outdegree = outdegree - 1;
                }else{
                    outdegree = outdegree + 1;
                }
            }

            if (outdegree == 0)
                flag = true;
            return flag;

        }
    }
    public static void main(String []args){
        Solution s = new Solution();
        String s1 = "9,3,4,#,#,1,#,#,2,#,6,#,#";
        boolean x = s.isValidSerialization(s1);
        System.out.println(x);
    }
}

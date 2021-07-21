package leetcode;

import java.util.*;

public class countOfAtoms_726 {
    int i,n;
    String formula;
    public String countOfAtoms(String formula){
        this.formula = formula;
        this.i = 0;
        this.n = formula.length();

        Deque<Map<String,Integer>> stack = new LinkedList<Map<String,Integer>>();
        stack.push(new HashMap<>());
        while (i<n){
            char ch = formula.charAt(i);
            if (ch == '('){
                i++;
                stack.push(new HashMap<>());
            }else if (ch == ')'){
                i++;
                int num = parseNum();  //
                Map<String,Integer> pop1 = stack.pop();  // 弹出括号内原子数量
                Map<String,Integer> pop2 = stack.peek();    //栈顶 空表
                for (Map.Entry<String,Integer> entry:pop1.entrySet()){
                    String atom = entry.getKey();
                    int count = entry.getValue();
                    pop2.put(atom,pop2.getOrDefault(atom,0) + count * num);
                }
            }else{
                // 括号之间
                String atom = parseAtom();
                int num = parseNum();
                Map<String,Integer> map = stack.peek();
                map.put(atom,map.getOrDefault(atom,0) + num);
            }
        }

        Map<String,Integer> map = stack.pop();
        TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>(map);

        StringBuffer sb = new StringBuffer();
        for (Map.Entry<String,Integer> entry : treeMap.entrySet()){
            String atom = entry.getKey();
            int count = entry.getValue();
            sb.append(atom);
            if (count > 1)
                sb.append(count);
        }
        return sb.toString();
    }

    public String parseAtom(){
        StringBuffer sb = new StringBuffer();
        sb.append(formula.charAt(i++));   // 扫描首字母
        while(i < formula.length() && Character.isLowerCase(formula.charAt(i))){
            sb.append(formula.charAt(i++));
        }
        return sb.toString();
    }

    public int parseNum(){
        if (i == n || !Character.isDigit(formula.charAt(i))){
            return 1;
        }
        int num = 0;
        while (i<n && Character.isDigit(formula.charAt(i))){
            num = num * 10 + formula.charAt(i++) - '0'; // 扫描数字
        }
        return num;
    }


}

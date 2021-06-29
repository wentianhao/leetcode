import sun.awt.datatransfer.DataTransferer;

import java.util.*;

public class minsheng1 {
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();
        int n = Integer.parseInt(str);
        Map<String ,List<Integer>> map = new HashMap<>();
        int i = 0;
        while(i<n){
            List<Integer> scores = new ArrayList<>();
            String score = scn.nextLine();
            String[] s = score.split(" ");
            int total = 0;
            for (int j=1;j<4;j++){
                scores.add(Integer.parseInt(s[j]));
                total += Integer.parseInt(s[j]);
            }
            scores.add(total);
            map.put(s[0],scores);
            i++;
        }
        // 第一种Map排序方式, 根据key排序
        List<Map.Entry<String, List<Integer>>> entryList = new ArrayList<Map.Entry<String, List<Integer>>>(map.entrySet());
        Collections.sort(entryList, new Comparator<Map.Entry<String, List<Integer>>>() {
            @Override
            public int compare(Map.Entry<String, List<Integer>> o1, Map.Entry<String, List<Integer>> o2) {
                //总分相同时，按照总分排序
                if (o1.getValue().get(3).equals(o2.getValue().get(3))){
                    if (o1.getValue().get(0).equals(o2.getValue().get(0))){
                        if (o1.getValue().get(1).equals(o2.getValue().get(1))){
                            // 语文数学都相同则看英语
                            return o2.getValue().get(2) >= o1.getValue().get(2)?1:-1;
                        }else {
                            // 数学不同
                            return o2.getValue().get(1) >= o1.getValue().get(1)?1:-1;
                        }
                    }else{ // 语文不同
                        return o2.getValue().get(0) >= o1.getValue().get(0)?1:-1;
                    }
                }
                return o2.getValue().get(3) >= o1.getValue().get(3)?1:-1;
            }
        });
        System.out.println(entryList);

    }

}

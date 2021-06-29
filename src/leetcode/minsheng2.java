package leetcode;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class minsheng2 {
//    //统计文件的非空行数
//    public static int countlines(String filePath){
//        FileReader fr = null;
//        BufferedReader br = null;
//        int count = 0;
//        try {
//            fr = new FileReader(filePath);
//            br = new BufferedReader(fr);
//
//            String value = br.readLine();
//            while (value != null)
//            {
//                if (!"".equals(value))
//                {
//                    count++;
//                }
//                value = br.readLine();
//            }
//        }
//        catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        catch (IOException e) {
//            e.printStackTrace();
//        }
//        finally {
//            try {
//                if (br != null)
//                    br.close();
//                if (fr != null)
//                    fr.close();
//            }
//            catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//        return count;
//    }
    public static void main(String[]args){
        System.out.println("Menu Function Tets");
        System.out.println("1:Count Lines");
        System.out.println("Q:Quit");
        Scanner scanner=new Scanner(System.in);
        String input =scanner.next();
        boolean flag = true;
        while(flag){
            switch (input){
                case "1":
                    // 输入文件的绝对路径
//                    System.out.println("input filePath to count lines:");
//                    String filePath =scanner.next();

                    ArrayList<String> in = new ArrayList<String>();
                    Scanner s = new Scanner(System.in);
                    while (s.hasNextLine()){
                        // # 结束多行输入
                        String read = s.nextLine();
                        if(read == null || read.equals("#")){ //if the line is empty
                            break;  //exit the loop
                        }
                        if (!read.isEmpty())
                            in.add(read);
                    }
                    System.out.println(in.size());
//                  int count = countlines(filePath);
//                  System.out.println(count);
                    System.out.println("Menu Function Tets");
                    System.out.println("1:Count Lines");
                    System.out.println("Q:Quit");
                    input =scanner.next();
                    break;
                case "Q":
                    System.out.println("Quit");
                    flag = false;
                    break;
                default:
                    System.out.println("Menu Function Tets");
                    System.out.println("1:Count Lines");
                    System.out.println("Q:Quit");
                    input =scanner.next();
                    break;
            }

        }
    }
}

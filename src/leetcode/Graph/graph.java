package leetcode.Graph;

import java.util.Scanner;

public class graph {
    public static class GraphMatrix {
        static final int maxNum = 20;
        int [] vertex = new int[maxNum]; // 保存顶点信息
        int type ; // 图的类型(0：无向图，1：有向图)
        int vertexNum; //顶点的数量
        int edgeNum;  //边的数量
        int[][]edgeWeight = new int[maxNum][maxNum]; // 边的权重
        int[] isTrav = new int[maxNum];
    }

    static Scanner scanner = new Scanner(System.in);

    private static void createGraph(GraphMatrix graphMatrix){
        int weight;
        int start,end; //边的起点和终点

        System.out.println("输入图中各顶点信息：");
        // 输入顶点
        for (int i=0;i<graphMatrix.vertexNum;i++){
            System.out.println("第"+(i+1) + "个顶点");
            graphMatrix.vertex[i] = scanner.nextInt();
        }
        System.out.println("输入边的权重");
        for (int j=0;j<graphMatrix.edgeNum;j++) {
            System.out.println("第" + (j+1) + "边");
            start = Integer.parseInt(scanner.next());
            end = Integer.parseInt(scanner.next());
            weight = scanner.nextInt();
            graphMatrix.edgeWeight[start][end] = weight;
            if (graphMatrix.type == 0){
                graphMatrix.edgeWeight[end][start] = weight;
            }
        }
    }
    // 清空图
    private static void ClearGraph(GraphMatrix graphMatrix){
        for (int i=0;i<graphMatrix.vertexNum;i++){
            for (int j=0;j<graphMatrix.vertexNum;j++){
                graphMatrix.edgeWeight[i][j] = Integer.MAX_VALUE;
            }
        }
    }

    // 遍历输出图
    private static void printGraph(GraphMatrix graphMatrix){
        for (int i=0;i<graphMatrix.vertexNum;i++){
            // 第一行输出顶点信息
            System.out.printf("\t%c",graphMatrix.vertex[i]);
        }
        System.out.println();
        for (int i=0;i<graphMatrix.vertexNum;i++){
            // 输出顶点信息
            System.out.printf("%c",graphMatrix.vertex[i]);
            for (int j=0;j<graphMatrix.vertexNum;j++){
                if (graphMatrix.edgeWeight[i][j] == Integer.MAX_VALUE){
                    System.out.printf("\tZ");
                } else {
                    System.out.printf("\t%d",graphMatrix.edgeWeight[i][j]);
                }
            }
            System.out.println();
        }
    }

    /**
     *     深度优先搜索遍历 , 从第n个节点开始，深度遍历图
     */
    private static void dfs(GraphMatrix graphMatrix,int n){
        graphMatrix.isTrav[n] = 1;
        // 输出节点数据
        System.out.println("->" + graphMatrix.vertex[n]);
        // 添加节点操作
        for (int i=0;i<graphMatrix.vertexNum;i++){
            if (graphMatrix.edgeWeight[n][i]!=Integer.MAX_VALUE && graphMatrix.isTrav[i] == 0) {
                dfs(graphMatrix, i);
            }
        }
    }

    private static void dfsGraph(GraphMatrix graphMatrix){
        for (int i=0;i<graphMatrix.vertexNum;i++){
            graphMatrix.isTrav[i] = 0;
        }
        System.out.println("深度优先遍历结点：");
        for (int i=0;i<graphMatrix.vertexNum;i++){
            // 结点没有遍历
            if (graphMatrix.isTrav[i] == 0){
                dfs(graphMatrix,i);
            }
        }
    }

    public static void main(String[]args){
        GraphMatrix graphMatrix = new GraphMatrix();
        System.out.println("输入生成图的类型");
        graphMatrix.type = scanner.nextInt();
        System.out.println("输入图的顶点数量:");
        graphMatrix.vertexNum = scanner.nextInt();
        System.out.println("输入图的边数量:");
        graphMatrix.edgeNum = scanner.nextInt();
        ClearGraph(graphMatrix);
        createGraph(graphMatrix);
        System.out.println("该图的邻接矩阵数据如下: ");
        printGraph(graphMatrix);
        dfsGraph(graphMatrix);

    }
}

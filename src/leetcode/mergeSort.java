package leetcode;

public class mergeSort {
    public static void mergesort(int[] arr){
        //空数组 或只有一个元素的数组
        if (arr == null || arr.length<=1)
            return;
        mergesort(arr,0,arr.length-1);
    }

    private static void mergesort(int[] arr,int low,int high){ // {6,9,1,4,5,8,7,0,2,3};
        if (low >= high)
            return;

        //计算出中间值，这种算法保证不会溢出
        int mid = low + ((high-low)>> 1); // int mid = (low + high)/2
        // 先对左边排序
        mergesort(arr,low,mid);
        // 先对右边排序
        mergesort(arr,mid+1,high);

        // 归并两个有序的子序列
        merge(arr,low,mid,high);

        System.out.println("low: "+ low + " mid:" + mid + " high:" + high);
        //输出
        print(arr);
    }

    private static void merge(int[] arr,int low,int mid,int high){
        //temp[]是临时数组，包左不包右，所以要额外+1
        int[] temp = new int[high-low+1];
        int left = low; //左侧指针从low开始
        int right = mid+1; //右侧指针从mid+1开始
        int index = 0; //索引
        // 当两个子序列还有元素时，从小到大放入temp
        while (left<=mid && right <= high){
            if (arr[left] < arr[right]){
                temp[index++] = arr[left++];
                // temp[index] = arr[left]; index ++ ; left++
            }else {
                temp[index++] = arr[right++];
            }
        }

        //左边没有元素
        while (left <= mid){
            temp[index++] = arr[left++];
        }

        //右边没有元素
        while (right <= high){
            temp[index++] = arr[right++];
        }

        //重新赋值给arr对应的区间
        for (int i=0;i<temp.length;i++){  // {6,9,1,4,5,8,7,0,2,3};
            arr[low+i] = temp[i];
        }
    }

    //输出数组
    public static void print(int[] arr){
        if (arr == null)
            return;

        for (int i : arr){
            System.out.print(i+"  ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[] arr = {6,9,1,4,5,8,7,0,2,3};

        System.out.println("排序前：    ");
        print(arr);

        mergesort(arr);

        System.out.println("排序后：    ");
        print(arr);
    }
}

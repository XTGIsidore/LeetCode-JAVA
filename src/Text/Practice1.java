package Text;

import java.util.Arrays;
import java.util.Scanner;

/*
* 题目：在一在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
* 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数
*
*
* */
public class Practice1 {
    public static void main(String[] args) {
        int n;
        int m;
        int num = 5;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入n: ");
        n = sc.nextInt();
        System.out.println("请输入m：");
        m = sc.nextInt();
        System.out.println("请输入"+ n*m + "个数：");
        int[][] array = new int[n][m];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j]  = sc.nextInt();
            }
        }
        Arrays.sort(array);
        boolean result = findNumberInArray(array, num);
        System.out.println("能否找到：" + result);
    }

    public static boolean findNumberInArray(int[][] array, int target){
        int x = array[0].length-1;
        int y = 0;
        while(x >= 0 && y <= array.length-1){
            if(target > array[y][x]){
                y++;
            }
            else if(target < array[y][x]){
                x--;
            }
            else {
                return true;
            }
        }
        return false;
    }

}

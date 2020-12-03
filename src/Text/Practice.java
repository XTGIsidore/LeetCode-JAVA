package Text;
/*
* 题目：在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
*方法：
* 1、使用set集合，哈希集合中加入相同的返回false
*   public int findRepeatNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num))
                return num;
        }
        return -1;
    }

* 2、先排序在查找，排序之后重复的肯定挨着，所以前后两两比较，如果有重复的直接返回
*     public int findRepeatNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1])
                return nums[i];
        }
        return -1;
    }
* */
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("请输入一个数：");
        n = sc.nextInt();
        int[] num = new int[n];
        System.out.println("请输入N个数字：");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        int[] repeatNumber = findRepeatNumber(num);
        System.out.println("重复的数字是：");
        for (int k = 0; k < repeatNumber.length; k++) {
            if(repeatNumber[k] != 0){
                System.out.println(repeatNumber[k]);
            }
        }
    }

    public static int[] findRepeatNumber(int[] num){
        int[] temp = new int[num.length];
        int[] result = new int[num.length];
        for (int j = 0; j < num.length; j++) {
            temp[num[j]]++;
            if(temp[num[j]] > 1){
                result[j] = num[j];
            }
        }
        return result;
    }
}

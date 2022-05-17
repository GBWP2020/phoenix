package ArrayTest;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {

    //声明数组：什么都不知道
    int arryNull[];

    //定义数组：只知道元素个数
    String arryStr[] = new String[4];
    int arryNull2[]= new int[4];

    //初始化数组：知道数组的每个元素
    int arryNum[]={1,2,3,4};

    System.out.println("遍历方法一：for 循环:");
    //遍历方法一：for 循环
    for(int i=0;i<arryNum.length;i++){
        arryStr[i]=Integer.toString(arryNum[i]);
        System.out.println(arryStr[i]);
    }
    System.out.println("遍历方法二：foreach 循环遍历:");
    //遍历方法二：foreach 循环遍历
    for (String i : arryStr) {
        System.out.println(i);
    }
    System.out.println("String 转换为 int:");
    //String 转换为 int
    for (int i = 0; i < arryStr.length; i++) {
        arryNull2[i]=Integer.valueOf(arryStr[i]).intValue();
        System.out.println(arryNull2[i]);
    }
    //System.out.println("String 转换为 int 方法二:");
    //String 转换为 int 方法二
    // for (int i = 0; i < arryStr.length; i++) {
    //     arryNull2[i]=Integer.parseInt(arryStr[i]);
    //     System.out.println(arryNull2[i]);
    // }

    /**缺点：打印出的数组带方括号 */
    System.out.println("遍历方法三：Arrays.toString 打印数组:");
    //遍历方法三：Arrays.toString 打印数组
    System.out.println(Arrays.toString(arryNull2));
    }
    
}

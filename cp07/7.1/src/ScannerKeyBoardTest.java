package classes;

import java.util.Scanner;

public class ScannerKeyBoardTest {

    public static void main(String[] args) {

        // System.in 代表标准输入，就是键盘输入
        Scanner sc = new Scanner(System.in);

        // 增加下面一行，将只把回车作为分隔符
        sc.useDelimiter("\n");

        // 判断是否还有下一项
        while(sc.hasNext()) {
           
            // 输出输入项
            System.out.println("键盘输入的内容是" + sc.next());
       
        }
    }
}

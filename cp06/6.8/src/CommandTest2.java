package classes;


public class CommandTest2 {

    public static void main(String[] args) {
        ProcessArray pa = new ProcessArray();
        int[] array = {2, -3, 8, 7, 1, 9};
        // 处理数组，具体处理行为取决于匿名内部类
        pa.process(array, (int[] target) -> {
            int sum = 0;
            for(int i : target) {
                sum += i;
            }
            System.out.println("数组元素的总合是：" + sum);
        });
    }
}

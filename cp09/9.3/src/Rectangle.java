package classes;

/**
 * 继承自 Shape 的类
 */
public class Rectangle extends Shape {
    @Override
    public void draw(Canvas c) {
        System.out.println("把一个矩形画在画布" + c + "上");
    }
}

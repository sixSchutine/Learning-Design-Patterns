package Decorator;

public class ShapeColor extends Shape {
    private Shape shape; //对Shape类型对象的引用

    //注入Shape类型的对象
    public ShapeColor(Shape shape){
        this.shape = shape;
    }

    @Override
    public void draw() {
        shape.draw();
    }
}

package Decorator;

public class ColorFill extends ShapeColor{
    public ColorFill(Shape shape){
        super(shape);
    }

    @Override
    public void draw() {
        this.setColorFill();
        super.draw();
    }

    public void setColorFill(){
        System.out.println("为图形加上颜色填充");
    }
}

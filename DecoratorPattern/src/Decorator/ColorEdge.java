package Decorator;

public class ColorEdge extends ShapeColor{
    public ColorEdge(Shape shape){
        super(shape);
    }

    @Override
    public void draw() {
        this.setColorEdge();
        super.draw();
    }

    public void setColorEdge(){
        System.out.println("为图形加上颜色边框");
    }
}

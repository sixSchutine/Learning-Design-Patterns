package ShapePainterAdapterObj;

public class Client {
    public static void main(String[] args){
        ShapePainter angle;
        angle = XMLUtil.getShapeAdapter();
        angle.draw();

        ShapePainter circle = new Circle();
        circle.draw();
        ShapePainter line = new Line();
        line.draw();
        ShapePainter rectangle = new Rectangle();
        rectangle.draw();
    }
}

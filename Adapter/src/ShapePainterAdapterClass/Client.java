package ShapePainterAdapterClass;

public class Client {
    public static void main(String[] args){
        ShapePainter c = new Circle();
        ShapePainter r = new Rectangle();
        ShapePainter l = new Line();
        ShapePainter a = new AngleAdapter();

        c.draw();
        r.draw();
        l.draw();
        a.draw();
    }
}


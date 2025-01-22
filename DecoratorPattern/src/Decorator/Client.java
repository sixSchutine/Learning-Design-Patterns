package Decorator;

public class Client{
    public static void main(String[] args) {
        Shape shape,shapeCF,shapeCE;
        shape = new Circle();
        shapeCE = new ColorEdge(shape);
        shapeCF = new ColorFill(shapeCE);
        shapeCF.draw();
    }
}

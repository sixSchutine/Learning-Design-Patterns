package ShapePainterAdapterObj;

public class ShapeAdapter extends ShapePainter{
    private Angle angle;

    public ShapeAdapter(){
        angle = new Angle();
    }

    @Override
    public void draw() {
        angle.drawAngle();
    }
}

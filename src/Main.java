
interface Shape{
    void draw();
}

class Square implements  Shape{

    @Override
    public void draw(){
        System.out.println("Square is drawing..");
    }
}

class Rectangle implements Shape{

    @Override
    public void draw(){
        System.out.println("Rectangle is drawing..");
    }
}

class ShapeFactory{
    public Shape shapeCreate(String shapeName){
        if(shapeName.equalsIgnoreCase("square")){ // büyük küçük harf duyarsız
            return new Square();
        }
        else if(shapeName.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        }
        return null;
    }
}

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape rectangle = shapeFactory.shapeCreate("rectangle");
        Shape square = shapeFactory.shapeCreate("square");

        rectangle.draw();
        square.draw();

    }
}
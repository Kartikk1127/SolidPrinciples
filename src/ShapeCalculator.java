//Below is a violation of Open closed principle. If we want to add support for a
// new shape, like a triangle, we would have to modify the calculate_area and
// calculate_perimeter methods, violating the Open/Closed Principle.

public class ShapeCalculator {

    public void calculateArea(String shape){
        if(shape.equals("rectangle")){
            //todo: logic
        } else if (shape.equals("circle")) {
            //todo:logic
        }
    }

    public void calculatePerimeter(String shape){
        if(shape.equals("rectangle")){
            //todo: logic
        } else if (shape.equals("circle")) {
            //todo:logic
        }
    }
}

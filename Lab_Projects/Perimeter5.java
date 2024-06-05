package labpack;

class Perimeter {

    // Method to calculate the perimeter of a square
    public double calculatePerimeter(double side) {
        return 4 * side; // Perimeter of a square = 4 * side length
    }

    // Method to calculate the perimeter of a rectangle
    public double calculatePerimeter(double length, double breadth) {
        return 2 * (length + breadth); // Perimeter of a rectangle = 2 * (length + breadth)
    }

    // Method to calculate the perimeter of a circle
    public double calculatePerimeter(double radius, boolean isCircle) {
        return 2 * Math.PI * radius; // Perimeter of a circle = 2 * π * radius
    }

    public static void main(String[] args) {
        Perimeter perimeter = new Perimeter(); // Create an instance of Perimeter

        double squareSide = 5.0;
        double rectangleLength = 7.0;
        double rectangleBreadth = 3.0;
        double circleRadius = 4.0;

        // Calculate and print the perimeter of a square
        System.out.println("Perimeter of the square: " + perimeter.calculatePerimeter(squareSide));

        // Calculate and print the perimeter of a rectangle
        System.out.println("Perimeter of the rectangle: " + perimeter.calculatePerimeter(rectangleLength, rectangleBreadth));

        // Calculate and print the perimeter of a circle
        System.out.println("Perimeter of the circle: " + perimeter.calculatePerimeter(circleRadius, true));
    }
}

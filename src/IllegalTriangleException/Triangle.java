package IllegalTriangleException;

public class Triangle {
    private double side1, side2, side3;

    public Triangle(double side1, double side2, double side3)
            throws IllegalTriangleException{
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        if (side1 + side2 <= side3 ||
            side1 + side3 <= side2 ||
            side2 + side3 <= side1) {
            throw new IllegalTriangleException("Không thể tạo tam giác: tổng hai cạnh phải lớn hơn cạnh còn lại");
        }
        double[] sides = {side1, side2, side3};
        for (int i = 0; i < sides.length; i++) {
            if (sides[i] <= 0) {
                throw new IllegalTriangleException("Cạnh thứ " + (i+1) + " không hợp lệ: " + sides[i]);
            }
        }
    }
    @Override public String toString() {
        return "Tam giác với các cạnh: " +
                "\ncạnh 1 = " + side1 + "; " +
                "\ncạnh 2 = " + side2 + "; " +
                "\ncạnh 3 = " + side3;
    }
}

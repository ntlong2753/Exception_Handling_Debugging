package IllegalTriangleException;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int side1;
        int side2;
        int side3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Kiem tra tam giac hop le");
        try {
            System.out.print("Nhap canh thu nhat: ");
            side1 = sc.nextInt();
            System.out.print("Nhap canh thu hai: ");
            side2 = sc.nextInt();
            System.out.print("Nhap canh thu ba: ");
            side3 = sc.nextInt();
            Triangle checkTriangle = new Triangle(side1, side2, side3);
            System.out.println(checkTriangle);
        }
        catch (IllegalTriangleException e){
            System.err.println("Xảy ra ngoại lệ: " + e.getMessage());
        }

    }
}

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("May bao nhieu tuoi 😡?");
        int age;

        try {
            age = sc.nextInt();
            System.out.println("Tuoi cua may la 💀: " + age);
            int error = age / 0;
        } catch (InputMismatchException ime) {
            System.out.println("Nhap so vao cho tao 🤬");
        } catch (ArithmeticException ae) {
            System.out.println("Khong duoc chia cho 0 🤬");
        } finally {
            System.out.println("May dang o trong finally block 😈😈😈");
        }
        System.out.println("Tra khao ket thuc 😈😈😈!");
    }
}

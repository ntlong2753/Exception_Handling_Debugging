package Ex2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ArrayExample arrExample = new ArrayExample();
        Integer[] arr = arrExample.createRandom();

        Scanner sc = new Scanner(System.in);
        System.out.print("\nVui lòng nhập chỉ số của một phần tử bất kỳ: ");
        int x = sc.nextInt();
        try {
            System.out.println("Giá trị của phần tử của chỉ số thứ " + x + " là: " + arr[x]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Chỉ số vượt quá giới hạn của mảng");
        }
    }
}

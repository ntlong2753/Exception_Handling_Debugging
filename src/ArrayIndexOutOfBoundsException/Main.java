package ArrayIndexOutOfBoundsException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayExample arrExample = new ArrayExample();
        Integer[] arrMain = arrExample.creatRandom();

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chi so bat ky: ");
        int index = sc.nextInt();

        try {
            System.out.println("Phan tu tai chi so " + index + " la: " + arrMain[index]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Vuot qua gioi han cua mang");
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float width, length, area;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập chiều rộng hình chữ nhật: ");
        width = sc.nextFloat();
        System.out.println("Nhập chiều dài hình chữ nhật: ");
        length = sc.nextFloat();

        area = width * length;
        System.out.println("Diện tích hình chữ nhật là: "+area);

    }
}

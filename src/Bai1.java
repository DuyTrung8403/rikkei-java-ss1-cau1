import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        final float PI = 3.14f;
        float r , a;
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ban kinh hinh tron");
        r = sc.nextFloat();
        a = PI * r * r;
        System.out.printf("Dien tich hinh tron la: %.2f", a);
    }
}

import java.util.Scanner;

public class XoaPhanTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao do dai mang 1: ");
        int n=sc.nextInt();
        int[] mang1 = new int[n];
        int[] mang2 = new int[n - 1];
        System.out.println("Nhap gia tri vao mang:");
        for (int i = 0; i < n; i++) {
            mang1[i]=sc.nextInt();
        }
        System.out.println("Nhap vao vi tri muon xoa: ");
        int vitri = sc.nextInt();
        for (int i = 0; i < vitri - 1; i++) {
            mang2[i] = mang1[i];
        }
        for (int i = vitri-1; i < mang2.length; i++) {
            mang2[i] = mang1[i + 1];
        }
        System.out.println("mang moi la: ");
        for (int i = 0; i < mang2.length; i++) {
            System.out.print(mang2[i] +"\t");
        }
    }
}

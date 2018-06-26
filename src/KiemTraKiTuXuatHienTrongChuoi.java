import java.util.Scanner;

public class KiemTraKiTuXuatHienTrongChuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chuoi gia tri: ");
        String str = sc.nextLine();
        char array[]= str.toCharArray();
        System.out.println("Vi tri cua ki tu dau tien ban muon xet: ");
        int n = sc.nextInt();
        int dem=0;
        for (int i = 0; i < array.length; i++) {
            if (array[n - 1] == array[i]) {
                dem++;
            }
        }
        System.out.println(dem);
    }
}

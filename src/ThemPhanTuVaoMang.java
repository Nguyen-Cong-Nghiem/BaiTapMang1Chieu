import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao do dai cua mang: ");
        int n = sc.nextInt();
        int[] mang1 = new int[n];
        int[] mang2=new int[n+1];
        System.out.println("Nhap du lieu cho mang 1");
        for (int i = 0; i < n; i++) {
            mang1[i] = sc.nextInt();
        }
        System.out.println("Vi tri muon them vao: ");
        int temp=sc.nextInt();
        System.out.println("Nhap so muon cho vao:");
        int number=sc.nextInt();
        if (temp > mang2.length) {
            System.out.println("Không gán được");
        }
        else{
            for (int i = 0; i < temp - 1; i++) {
                mang2[i] = mang1[i];
            }
            mang2[temp - 1] = number;
            for (int i = temp; i < mang2.length; i++) {
                mang2[i] = mang1[i - 1];
            }
        }
        System.out.println("Mang moi la: ");
        for (int i=0; i<mang2.length;i++){
            System.out.println(mang2[i]);
        }



    }
}

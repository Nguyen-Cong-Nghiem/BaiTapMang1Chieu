import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao do  dai mang 1: ");
        int size1 = sc.nextInt();
        int[] mang1 = new int[size1];
        int i = 0;
        while (i < mang1.length) {
            System.out.print("Phan tu thu " + (i + 1) + "cua mang 1" + " : ");
            mang1[i] = sc.nextInt();
            i++;
        }
        for (int j = 0; j < mang1.length; j++) {
            System.out.print(mang1[j] + "\n");
        }
        System.out.print("\nHay nhap vao do dai mang 2: ");
        int size2 = sc.nextInt();
        int[] mang2 = new int[size2];
        int j = 0;
        while (j < mang2.length) {
            System.out.println("Phan tu thu " + (j + 1) + "cua mang 2:");
            mang2[j] = sc.nextInt();
            j++;
        }
        for (int n = 0; n < mang2.length; n++) {
            System.out.print(mang2[n] + " " + "\n");
        }
        int[] mang3 = new int[mang1.length + mang2.length];
            for (int a = 0; a < mang1.length; a++) {
                mang3[a] = mang1[a];
            }
            for (int a = 0; a < mang2.length; a++) {
                mang3[a + mang1.length]=mang2[a];
            }
            for (int x = 0; x < mang3.length; x++) {
                System.out.println(mang3[x]);
            }



    }
}



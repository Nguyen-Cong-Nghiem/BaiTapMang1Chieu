import java.util.Scanner;

public class TimGiaTriNhoNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao do dai mang: ");
        int size = sc.nextInt();
        int[] mang = new int[size];
        System.out.println("Nhap vao gia tri trong mang: ");
        for (int i = 0; i < size; i++) {
            int number = sc.nextInt();
            mang[i] = number;

       }
        for (int i = 0; i < size; i++) {
            System.out.print( mang[i] + "\t"+"\n");
        }

        int min=mang[0];
        int index=1;
     for (int i = 0; i < mang.length; i++) {
           if (min > mang[i]) {
             min = mang[i];
               index=i++;
         }

        }
        System.out.println("Gia tri nho nhat la: " + min);

  }
       }



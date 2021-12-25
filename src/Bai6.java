import java.util.Scanner;

public class Bai6 {
    public void mangHaiChieu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chieu thu nhat: ");
        int a = scanner.nextInt();
        System.out.println("Nhap chieu thu hai: ");
        int b = scanner.nextInt();

        int[][] mang = new int[a][b];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                mang[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Mảng vừa nhập: ");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(mang[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("cac phan tu nam tren duong cheo chinh: ");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (mang[i][j] == mang[j][i])
                    System.out.println(mang[i][j]);
            }
        }
    }
}

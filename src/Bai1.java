public class Bai1 {
    public void printSquare() {
        System.out.println("Hinh vuong");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("*\t");
            }
            System.out.println("");
        }
        System.out.println("=========================");

    }

    public void printTriangle() {
        System.out.println("Hinh tam giac");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*\t");
            }
            System.out.println("");
        }
    }
}

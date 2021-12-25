public class Main {
    public static void main(String[] args) {
        //Bai 1
        Bai1 b1 = new Bai1();
        b1.printSquare();
        b1.printTriangle();

        //Bai 2
        Bai2 b2=new Bai2();
        System.out.println("So tu trong chuoi la: ");
        b2.countString();

        //Bai 3
        Bai3 b3 = new Bai3();
        int a = b3.RandomNumber();
        if (b3.isPrimeNumber(a) == true) {
            System.out.println(a + "\tLa so nguyen to");
        } else
            System.out.println(a + "\tKhong phai so nguyen to");

        //Bai 4
        Bai4 b4 = new Bai4();
        System.out.println("10 so nguyen to dau tien la: ");
        b4.lietKe10so();
        System.out.println();
        System.out.println("Cac so nguyen to nho hon 10 la:");
        b4.sntnhohon10();
        System.out.println();

        //Bai 5a
        Bai5 b5=new Bai5();
        b5.chuanHoa();
        b5.chuoiDoiXung();

        //Bai 6
        Bai6 b6=new Bai6();
        b6.mangHaiChieu();
    }
}

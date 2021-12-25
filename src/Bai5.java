import java.util.Scanner;

public class Bai5 {
    public void chuanHoa() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten cua ban: ");
        String a = scanner.nextLine();

        a = a.trim();
        a = a.replaceAll("//s", " ");
        String[] temp = a.split(" ");

        a = "";

        for (int i = 0; i < temp.length; i++) {
            a += String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
            if (i < temp.length - 1)
                a += " ";
        }
        System.out.println("Ten sau chuan hoa: " + a);
    }

    public void chuoiDoiXung() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi muon kiem tra: ");
        String a = scanner.nextLine();

        String kiemtra = "";
        for (int i = a.length()-1; i >=0; i--) {
            kiemtra = kiemtra + a.charAt(i);
        }

        if (a.equals(kiemtra)){
            System.out.println("Chuoi doi xung");
        }else
            System.out.println("Khong phai chuoi doi xung");
    }
}

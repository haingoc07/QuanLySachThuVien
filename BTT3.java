import java.util.Scanner;
public class BTT3 {
    private String masach;
    private String tensach;
    private String tentg;
    private int namXB;
    private double dongia;
    private int soluong;
    public  BTT3(){}
    public void nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma sach");
        masach= sc.nextLine();
        System.out.println("Nhap ten sach");
        tensach=sc.nextLine();
        System.out.println("Nhap ten tac gia");
        tentg= sc.nextLine();
        System.out.println("Nhap nam xuat ban");
        namXB=sc.nextInt();
        System.out.println("Nhap don gia");
        dongia=sc.nextDouble();
        System.out.println("Nhap so luong");
        soluong=sc.nextInt();
    } 
    public double thanhtien()
    {
        return dongia*soluong;
    }
    public double Phivanchuyen()
    {
        return thanhtien()*0.05;
    }
    public double tongtiennhap()
    {
        return thanhtien()+Phivanchuyen();
    }
    public void xuat()
    {
        System.out.println("\n--- THONG TIN DON HANG ---");
        System.out.println("Ma sach: " + masach);
        System.out.println("Ten sach: " + tensach);
        System.out.println("Tac gia: " + tentg);
        System.out.println("Nam xuat ban: " + namXB);
        System.out.println("Don gia: " + dongia);
        System.out.println("So luong: " + soluong);
        System.out.println("Thanh tien: " + thanhtien());
        System.out.println("Phi van chuyen: " + Phivanchuyen());
        System.out.println("Tong tien nhap: " + tongtiennhap());
    }
    public static void main(String[] args) {
        BTT3 sach = new BTT3();
        sach.nhap();
        sach.xuat();
    }
}

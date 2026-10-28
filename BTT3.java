import java.util.Scanner;
public class BTT3 {
    private String masach;
    private String tensach;
    private String tentg;
    private int namXB;
    private double dongia;
    private int soluong;
    private int loaisach; 

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
        System.out.println("Chon loai sach :(Giao khoa | Tham khao | Chuyen nganh | Khach");
        loaisach=sc.nextInt();

    } 
    public boolean kiemtrahople()
    {
        return dongia > 0 && namXB > 0 && namXB <=2026 ; 
    }
    public String phanloaigia()
    {
        if(dongia<50000)
            return "Sach gia thap";
        else
            if (dongia >=50000 && dongia <=100000)
                return "Sach gia trung binh";
            else 
                if (dongia >= 100000 && dongia <= 200000)
                    return "Gia cao";
                else 
                    return "Sach gia dac biet";      
    }
    public String phanloaitonkho()
    {
        if(soluong==0)
            return "Het sach";
        else 
            if (soluong>=1 && soluong <=5)
                return "Sap het";
            else
                if(soluong>=6 && soluong <=20)
                    return "Con it";
                else 
                    return "Con nhieu";
    }
    public String chonLoaisach(){
        switch ((loaisach)) {
            case 1:
                return "Sach giao khoa";
            case 2:
                return"Sach tham khao";
            case 3:
                return "Sach chuyen nganh";
            case 4:
                return"Sach khac";      
            default:
                return "khong xac dinh";
        }
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
        if(kiemtrahople()){
        System.out.println("Ma sach: " + masach);
        System.out.println("Ten sach: " + tensach);
        System.out.println("Loai sach" +chonLoaisach());
        System.out.println("Phan loai gia:"+phanloaigia());
        System.out.println("Tinh trong kho :" + phanloaitonkho());
        System.out.println("Tac gia: " + tentg);
        System.out.println("Nam xuat ban: " + namXB);
        System.out.println("Don gia: " + dongia);
        System.out.println("So luong: " + soluong);
        System.out.println("Thanh tien: " + thanhtien());
        System.out.println("Phi van chuyen: " + Phivanchuyen());
        System.out.println("Tong tien nhap: " + tongtiennhap());
        }
        else
            System.out.println("Khong hop le !");

    }
    public static void main(String[] args) {
        BTT3 sach = new BTT3();
        sach.nhap();
        sach.xuat();
    }
}

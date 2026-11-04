import java.util.Scanner;

public class BTT5 {
    private String masach;
    private String tensach;
    private String tentg;
    private int namXB;
    private double dongia;
    private int soluong;
    private int loaisach; 

    public BTT5() {}

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma sach: ");
        masach = sc.nextLine();
        System.out.print("Nhap ten sach: ");
        tensach = sc.nextLine();
        System.out.print("Nhap ten tac gia: ");
        tentg = sc.nextLine();
        System.out.print("Nhap nam xuat ban: ");
        namXB = sc.nextInt();
        System.out.print("Nhap don gia: ");
        dongia = sc.nextDouble();
        System.out.print("Nhap so luong: ");
        soluong = sc.nextInt();
        System.out.print("Chon loai sach (1: Giao khoa | 2: Tham khao | 3: Chuyen nganh | 4: Khac): ");
        loaisach = sc.nextInt();
        sc.nextLine();
    } 

    public boolean kiemtrahople() {
        return dongia > 0 && namXB > 0 && namXB <= 2026; 
    }

    public String phanloaigia() {
        if (dongia < 50000)
            return "Sach gia thap";
        else if (dongia >= 50000 && dongia <= 100000)
            return "Sach gia trung binh";
        else if (dongia > 100000 && dongia <= 200000)
            return "Gia cao";
        else 
            return "Sach gia dac biet";      
    }

    public String phanloaitonkho() {
        if (soluong == 0)
            return "Het sach";
        else if (soluong >= 1 && soluong <= 5)
            return "Sap het";
        else if (soluong >= 6 && soluong <= 20)
            return "Con it";
        else 
            return "Con nhieu";
    }

    public String chonLoaisach() {
        switch (loaisach) {
            case 1: return "Sach giao khoa";
            case 2: return "Sach tham khao";
            case 3: return "Sach chuyen nganh";
            case 4: return "Sach khac";      
            default: return "Khong xac dinh";
        }
    }

    public double thanhtien() {
        return dongia * soluong;
    }
    public double Phivanchuyen() {
        return thanhtien() * 0.05;
    }
    public double tongtiennhap() {
        return thanhtien() + Phivanchuyen();
    }
   
    public void xuat() {
        if (kiemtrahople()) {
            System.out.println("Ma sach: " + masach);
            System.out.println("Ten sach: " + tensach);
            System.out.println("Tac gia: " + tentg);
            System.out.println("Nam xuat ban: " + namXB);
            System.out.println("Loai sach: " + chonLoaisach());
            System.out.println("Don gia: " + dongia + " | So luong: " + soluong);
            System.out.println("Phan loai gia: " + phanloaigia());
            System.out.println("Tinh trang kho: " + phanloaitonkho());
            System.out.println("Thanh tien: " + thanhtien());
            System.out.println("Phi van chuyen : " + Phivanchuyen());
            System.out.println("Tong tien nhap: " + tongtiennhap());
        } else {
            System.out.println("Sach ma " + masach + " khong hop le !");
        }
    }

   //tuần 5 
    public String Masach() {
        return masach;
    }
    public int Soluong() {
        return soluong;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BTT5[] ds = null; 
        int n = 0;
        int chon;

        do {
            System.out.println("1. Nhap danh sach n cuon sach");
            System.out.println("2. Hien thi danh sach cac cuon sach");
            System.out.println("3. Tinh tong so luong va tong gia tri sach ");
            System.out.println("4. Tim kiem sach theo ma");
            System.out.println("5. Thoat chuong trinh");
            System.out.print("Moi ban chon chuc nang : ");
            chon = sc.nextInt();
            sc.nextLine(); // bỏ phím  Enter tránh lỗi ksi tự trắng 
            switch (chon) {
                case 1:
                    System.out.print("Nhap so luong sach n: ");
                    n = sc.nextInt();
                    sc.nextLine();
                    ds = new BTT5[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("\n Nhap thong tin cuon sach thu " + (i + 1) );
                        ds[i] = new BTT5();
                        ds[i].nhap();
                    }
                    break;
                case 2:
                    if (ds == null) {
                        System.out.println("Chua co danh sach! Vui long chon chuc nang 1 truoc.");
                    } else {
                        System.out.println("\nDANH SACH SACH TRONG THU VIEN ");
                        for (int i = 0; i < n; i++) {
                            ds[i].xuat();
                        }
                    }
                    break;
                case 3:
                    if (ds == null) {
                        System.out.println("Chua co du lieu sach!");
                    } else {
                        int tongSoLuong = 0;
                        double tongGiaTri = 0;
                        for (int i = 0; i < n; i++) {
                            if (ds[i].kiemtrahople()) {
                                tongSoLuong += ds[i].Soluong();
                                tongGiaTri += ds[i].tongtiennhap();
                            }
                        }
                        System.out.println("\n THONG KE");
                        System.out.println("Tong so luong sach hop le: " + tongSoLuong);
                        System.out.println("Tong gia tri nhap kho gồm phí VC: " + tongGiaTri);
                    }
                    break;
                case 4:
                    if (ds == null) {
                        System.out.println("Chua co du lieu sach!");
                    } else {
                        System.out.print("Nhap ma sach can tim: ");
                        String maTim = sc.nextLine();
                        boolean timThay = false;//mặt định là sai 
                        System.out.println("\n KET QUA TIM KIEM ");
                        for (int i = 0; i < n; i++) {
                            if (ds[i].Masach().equalsIgnoreCase(maTim)) {//so sánh không phân biệt hoa thường
                                ds[i].xuat();
                                timThay = true;
                            }
                        }
                        if (timThay==false) {
                            System.out.println("Khong tim thay cuon sach nao co ma: " + maTim);
                        }
                    }
                    break;
                case 5:
                    System.out.println("Da thoat chuong trinh. Hen gap lai!");
                    break;

                default:
                    System.out.println("Lua chon khong hop le! Vui long chon tu 1 den 5.");
            }
        } while (chon != 5);
    }
}

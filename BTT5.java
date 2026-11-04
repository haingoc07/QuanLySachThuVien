import java.util.ArrayList;
import java.util.Scanner;

public class BTT5 
{
    private String masach;
    private String tensach;
    private String tentg;
    private int namXB;
    private double dongia;
    private int soluong;
    private int loaisach; 

    public BTT5() {}

    public void nhap() 
    {
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

    public boolean kiemtrahople() 
    {
        return dongia > 0 && namXB > 0 && namXB <= 2026; 
    }

    public String phanloaigia() 
    {
        if (dongia < 50000)
        {
            return "Sach gia thap";
        }
        else if (dongia >= 50000 && dongia <= 100000)
        {
            return "Sach gia trung binh";
        }
        else if (dongia > 100000 && dongia <= 200000)
        {
            return "Gia cao";
        }
        else 
        {
            return "Sach gia dac biet";      
        }
    }

    public String phanloaitonkho() 
    {
        if (soluong == 0)
        {
            return "Het sach";
        }
        else if (soluong >= 1 && soluong <= 5)
        {
            return "Sap het";
        }
        else if (soluong >= 6 && soluong <= 20)
        {
            return "Con it";
        }
        else 
        {
            return "Con nhieu";
        }
    }

    public String chonLoaisach() 
    {
        switch (loaisach) 
        {
            case 1: return "Sach giao khoa";
            case 2: return "Sach tham khao";
            case 3: return "Sach chuyen nganh";
            case 4: return "Sach khac";      
            default: return "Khong xac dinh";
        }
    }

    public double thanhtien() 
    {
        return dongia * soluong;
    }

    public double Phivanchuyen() 
    {
        return thanhtien() * 0.05;
    }

    public double tongtiennhap() 
    {
        return thanhtien() + Phivanchuyen();
    }

    public void xuat() 
    {
        if (kiemtrahople()) 
        {
            System.out.println("Ma sach: " + masach);
            System.out.println("Ten sach: " + tensach);
            System.out.println("Tac gia: " + tentg);
            System.out.println("Nam xuat ban: " + namXB);
            System.out.println("Loai sach: " + chonLoaisach());
            System.out.println("Don gia: " + dongia + " | So luong: " + soluong);
            System.out.println("Phan loai gia: " + phanloaigia());
            System.out.println("Tinh trang kho: " + phanloaitonkho());
            System.out.println("Thanh tien: " + thanhtien());
            System.out.println("Phi van chuyen: " + Phivanchuyen());
            System.out.println("Tong tien nhap: " + tongtiennhap());
        } 
        else 
        {
            System.out.println("Sach ma " + masach + " khong hop le!");
        }
    }

    public String masach() 
    {
        return masach;
    }
    public int soluong() 
    {
        return soluong;
    }
    public double dongia() 
    {
        return dongia;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<BTT5> danhSachSach = new ArrayList<>();
        int chon;
        do 
        {
            System.out.println("\nMENU QUAN LY THU VIEN ");
            System.out.println("1. Thêm sách");
            System.out.println("2. Hiển thị sách");
            System.out.println("3. Tìm sách theo mã");
            System.out.println("4. Xóa sách theo mã");
            System.out.println("5. Sửa thông tin sách theo mã");
            System.out.println("6. Tính tổng số lượng sách");
            System.out.println("7. Tính tổng giá trị sách");
            System.out.println("8. Thoát chương trình");
            System.out.print("Mời bạn chọn chức năng (1-8): ");
            chon = sc.nextInt();
            sc.nextLine(); 
            switch (chon) 
            {
                case 1: 
                {
                    System.out.print("Nhập số lượng sách muốn thêm vào danh sách: ");
                    int soLuongThem = sc.nextInt();
                    sc.nextLine();
                    for (int i = 0; i < soLuongThem; i++) 
                    {
                        System.out.println("\n--- Nhập thông tin cuốn sách thứ " + (danhSachSach.size() + 1) + " ---");
                        BTT5 sachMoi = new BTT5();
                        sachMoi.nhap();
                        danhSachSach.add(sachMoi);
                    }
                    System.out.println("Đã thêm thành công!");
                    break;
                }
                case 2: 
                {
                    if (danhSachSach.isEmpty()) 
                    {
                        System.out.println("Thư viện hiện chưa có cuốn sách nào!");
                    } 
                    else 
                    {
                        System.out.println("\nDANH SÁCH SÁCH TRONG THƯ VIỆN");
                        for (int i = 0; i < danhSachSach.size(); i++) 
                        {
                            System.out.println("\n[Cuốn sách thứ "+ (i + 1) );
                            danhSachSach.get(i).xuat();
                        }
                    }
                    break;
                }
                case 3: 
                {
                    if (danhSachSach.isEmpty()) 
                    {
                        System.out.println("Thư viện chưa có dữ liệu để tìm kiếm!");
                    } 
                    else 
                    {
                        System.out.print("Nhập mã sách cần tìm: ");
                        String maTim = sc.nextLine();
                        boolean timThay = false;
                        System.out.println("\nKẾT QUẢ TÌM KIẾM");
                        for (BTT5 sach : danhSachSach) 
                        {
                            if (sach.masach().equalsIgnoreCase(maTim)) 
                            {
                                sach.xuat();
                                timThay = true;
                            }
                        }
                        if (timThay == false) 
                        {
                            System.out.println("Không tìm thấy cuốn sách nào có mã: " + maTim);
                        }
                    }
                    break;
                }
                case 4: 
                {
                    if (danhSachSach.isEmpty()) 
                    {
                        System.out.println("Thư viện chưa có dữ liệu để xóa!");
                    } 
                    else 
                    {
                        System.out.print("Nhập mã sách cần xóa: ");
                        String maXoa = sc.nextLine();
                        boolean daXoa = false;
                        for (int i = 0; i < danhSachSach.size(); i++) 
                        {
                            if (danhSachSach.get(i).masach().equalsIgnoreCase(maXoa)) 
                            {
                                danhSachSach.remove(i); 
                                daXoa = true;
                                System.out.println("=> Đã xóa thành công cuốn sách có mã: " + maXoa);
                                break;
                            }
                        }
                        if (daXoa == false) 
                        {
                            System.out.println("Không tìm thấy mã sách " + maXoa + " để xóa!");
                        }
                    }
                    break;
                }
                case 5: 
                {
                    if (danhSachSach.isEmpty()) 
                    {
                        System.out.println("Thư viện chưa có dữ liệu để sửa!");
                    } 
                    else 
                    {
                        System.out.print("Nhập mã sách cần sửa thông tin: ");
                        String maSua = sc.nextLine();
                        boolean daSua = false;
                        for (BTT5 sach : danhSachSach) 
                        {
                            if (sach.masach().equalsIgnoreCase(maSua)) 
                            {
                                System.out.println("Đã tìm thấy sách! Nhập lại thông tin mới:");
                                sach.nhap();
                                daSua = true;
                                System.out.println("=> Đã cập nhật thông tin sách thành công!");
                                break;
                            }
                        }
                        if (daSua == false) 
                        {
                            System.out.println("Không tìm thấy mã sách " + maSua + " để sửa!");
                        }
                    }
                    break;
                }
                case 6: 
                {
                    if (danhSachSach.isEmpty()) 
                    {
                        System.out.println("Thư viện chưa có dữ liệu!");
                    } 
                    else 
                    {
                        int tongSoLuong = 0;
                        for (BTT5 sach : danhSachSach) 
                        {
                            if (sach.kiemtrahople()) 
                            {
                                tongSoLuong += sach.soluong();
                            }
                        }
                        System.out.println("\nTổng số lượng các cuốn sách hợp lệ trong kho: " + tongSoLuong);
                    }
                    break;
                }
                case 7: 
                {
                    if (danhSachSach.isEmpty()) 
                    {
                        System.out.println("Thư viện chưa có dữ liệu!");
                    } 
                    else 
                    {
                        double tongGiaTri = 0;
                        for (BTT5 sach : danhSachSach) 
                        {
                            if (sach.kiemtrahople()) 
                            {
                                tongGiaTri += sach.tongtiennhap();
                            }
                        }
                        System.out.println("\n=> Tổng giá trị nhập kho (đã gồm phí vận chuyển): " + tongGiaTri);
                    }
                    break;
                }
                case 8: 
                {
                    System.out.println("Đã thoát chương trình. Tạm biệt Hải!");
                    break;
                }
                default: 
                {
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng chọn từ 1 đến 8.");
                    break;
                }
            }
        } while (chon != 8);
    }
}
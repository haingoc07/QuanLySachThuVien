import java.util.ArrayList;
import java.util.Scanner;
public class Test 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Sach> dsSach = new ArrayList<>();
        int chon;
        do 
        {
            System.out.println("\nMENU TUAN 7 - QUAN LY THU VIEN");
            System.out.println("1. Them sach");
            System.out.println("2. Hien thi danh sach sach");
            System.out.println("3. Tim sach theo ma");
            System.out.println("4. Xoa sach theo ma");
            System.out.println("5. Thoat");
            System.out.print("Moi ban chon chuc nang: ");
            chon = sc.nextInt();
            sc.nextLine();
            switch (chon) 
            {
                case 1: 
                {
                    // Yeu cau 3
                    Sach sachMoi = new Sach();
                    sachMoi.nhap();
                    // Yeu cau 4
                    dsSach.add(sachMoi);
                    System.out.println("Da them thanh cong!");
                    break;
                }
                case 2: 
                {
                    if (dsSach.isEmpty()) 
                    {
                        System.out.println("Danh sach chua co cuon sach nao!");
                    } 
                    else 
                    {
                        for (int i = 0; i < dsSach.size(); i++) 
                        {
                            System.out.println("\nCuon sach thu " + (i + 1));
                            dsSach.get(i).hienThiThongTin();
                        }
                    }
                    break;
                }
                case 3: 
                {
                    System.out.print("Nhap ma sach can tim: ");
                    String maTim = sc.nextLine();
                    boolean timThay = false;
                    for (Sach s : dsSach) 
                    {
                        if (s.getMaSach().equalsIgnoreCase(maTim)) 
                        {
                            s.hienThiThongTin();
                            timThay = true;
                        }
                    }
                    if (timThay == false) 
                    {
                        System.out.println("Khong tim thay sach co ma: " + maTim);
                    }
                    break;
                }
                case 4: 
                {
                    System.out.print("Nhap ma sach can xoa: ");
                    String maXoa = sc.nextLine();
                    boolean daXoa = false;
                    for (int i = 0; i < dsSach.size(); i++) 
                    {
                        if (dsSach.get(i).getMaSach().equalsIgnoreCase(maXoa)) 
                        {
                            dsSach.remove(i);
                            daXoa = true;
                            System.out.println("=> Da xoa sach co ma: " + maXoa);
                            break;
                        }
                    }
                    if (daXoa == false) 
                    {
                        System.out.println("Khong tim thay ma sach " + maXoa + " de xoa!");
                    }
                    break;
                }
                case 5: 
                {
                    System.out.println("Da thoat chuong trinh.");
                    break;
                }
                default: 
                {
                    System.out.println("Lua chon khong hop le! Vui long chon tu 1 den 5.");
                    break;
                }
            }
        } while (chon != 5);
    }
}


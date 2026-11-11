import java.util.Scanner;
public class Sach 
{
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;
    private static int currentYear = 2026;
 
    public Sach() {}
    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong) 
    {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        setNamXuatBan(namXuatBan);
        setSoLuong(soLuong);
    }

    public String getMaSach() 
    {
        return maSach;
    }
    public void setMaSach(String maSach) 
    {
        this.maSach = maSach;
    }
    public String getTieuDe() 
    {
        return tieuDe;
    }
    public void setTieuDe(String tieuDe) 
    {
        this.tieuDe = tieuDe;
    }
    public String getTacGia() 
    {
        return tacGia;
    }
    public void setTacGia(String tacGia) 
    {
        this.tacGia = tacGia;
    }
    public int getNamXuatBan() 
    {
        return namXuatBan;
    }

     public void setNamXuatBan(int namXuatBan) 
    {
        if (namXuatBan > 0 && namXuatBan <= currentYear) 
        {
            this.namXuatBan = namXuatBan;
        }
        else 
        {
            System.out.println("Nam xuat ban " + namXuatBan + " khong hop le!");
        }
    }
      public int getSoLuong() 
    {
        return soLuong;
    }
      public void setSoLuong(int soLuong) 
    {
        if (soLuong >= 0) 
        {
            this.soLuong = soLuong;
        }
        else 
        {
            System.out.println("So luong " + soLuong + " khong hop le!");
        }
    }

    public void nhap() 
    {
         Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma sach: ");
        setMaSach(sc.nextLine());
        System.out.print("Nhap tieu de: ");
        setTieuDe(sc.nextLine());
        System.out.print("Nhap tac gia: ");
        setTacGia(sc.nextLine());
        System.out.print("Nhap nam xuat ban: ");
        setNamXuatBan(sc.nextInt());
        System.out.print("Nhap so luong: ");
        setSoLuong(sc.nextInt());
        sc.nextLine();
    }

  //y/c2 
   public void hienThiThongTin() 
    {
        System.out.println("Ma sach: " + maSach);
        System.out.println("Tieu de: " + tieuDe);
        System.out.println("Tac gia: " + tacGia);
        System.out.println("Nam xuat ban: " + namXuatBan);
        System.out.println("So luong: " + soLuong);
    }
}    



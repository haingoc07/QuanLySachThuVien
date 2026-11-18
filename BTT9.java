import java.util.ArrayList;
class Sach 
{
    protected String maSach;
    protected String ngayNhap;
    protected double donGia;
    protected int soLuong;
    protected String nhaXuatBan;

    public Sach(String maSach, String ngayNhap, double donGia, int soLuong, String nhaXuatBan) 
    {
        this.maSach = maSach;
        this.ngayNhap = ngayNhap;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.nhaXuatBan = nhaXuatBan;
    }
    public String getNhaXuatBan() 
    {
        return nhaXuatBan;
    }
    public void xuat() 
    {
        System.out.println("Ma: " + maSach + " | Ngay: " + ngayNhap + " | Gia: " + donGia + " | SL: " + soLuong + " | NXB: " + nhaXuatBan);
    }
}
class SachGiaoKhoa extends Sach 
{
    private String tinhTrang;

    public SachGiaoKhoa(String maSach, String ngayNhap, double donGia, int soLuong, String nhaXuatBan, String tinhTrang) 
    {
        super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
        this.tinhTrang = tinhTrang;
    }

    public double thanhTien() 
    {
        if (tinhTrang.equalsIgnoreCase("moi")) 
        {
            return soLuong * donGia;
        } 
        else 
        {
            return soLuong * donGia * 0.5;
        }
    }

    @Override
    public void xuat() 
    {
        System.out.println("[Sach Giao Khoa] Ma: " + maSach + " | Ngay: " + ngayNhap + " | Gia: " + donGia + " | SL: " + soLuong + " | NXB: " + nhaXuatBan + " | Tinh trang: " + tinhTrang + " | Thanh tien: " + thanhTien());
    }
}

class SachThamKhao extends Sach 
{
    private double thue;

    public SachThamKhao(String maSach, String ngayNhap, double donGia, int soLuong, String nhaXuatBan, double thue) 
    {
        super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
        this.thue = thue;
    }

    public double getDonGia() 
    {
        return donGia;
    }

    public double thanhTien() 
    {
        return soLuong * donGia + thue;
    }

    @Override
    public void xuat() 
    {
        System.out.println("[Sach Tham Khao] Ma: " + maSach + " | Ngay: " + ngayNhap + " | Gia: " + donGia + " | SL: " + soLuong + " | NXB: " + nhaXuatBan + " | Thue: " + thue + " | Thanh tien: " + thanhTien());
    }
}

public class BTT9 
{
    public static void main(String[] args) 
    {
        ArrayList<SachGiaoKhoa> dsSGK = new ArrayList<>();
        dsSGK.add(new SachGiaoKhoa("SGK01", "10/01/2026", 40000, 10, "GD", "moi"));
        dsSGK.add(new SachGiaoKhoa("SGK02", "15/02/2026", 60000, 5, "Kim Dong", "cu"));
        dsSGK.add(new SachGiaoKhoa("SGK03", "20/03/2026", 50000, 8, "GD", "moi"));

        ArrayList<SachThamKhao> dsSTK = new ArrayList<>();
        dsSTK.add(new SachThamKhao("STK01", "05/01/2026", 100000, 3, "Tre", 15000));
        dsSTK.add(new SachThamKhao("STK02", "12/04/2026", 150000, 2, "GD", 20000));

        System.out.println("DANH SACH SACH GIAO KHOA");
        for (int i = 0; i < dsSGK.size(); i++) 
        {
            dsSGK.get(i).xuat();
        }
        System.out.println("\nDANH SACH SACH THAM KHAO");
        for (int i = 0; i < dsSTK.size(); i++) 
        {
            dsSTK.get(i).xuat();
        }
        double tongTienSGK = 0;
        for (int i = 0; i < dsSGK.size(); i++) 
        {
            tongTienSGK = tongTienSGK + dsSGK.get(i).thanhTien();
        }
        double tongTienSTK = 0;
        double tongDonGiaSTK = 0;
        for (int i = 0; i < dsSTK.size(); i++) 
        {
            tongTienSTK = tongTienSTK + dsSTK.get(i).thanhTien();
            tongDonGiaSTK = tongDonGiaSTK + dsSTK.get(i).getDonGia();
        }

        double tbDonGiaSTK = 0;
        if (dsSTK.size() > 0) 
        {
            tbDonGiaSTK = tongDonGiaSTK / dsSTK.size();
        } 
        else 
        {
            tbDonGiaSTK = 0;
        }
        System.out.println("- Tong thanh tien Sach Giao Khoa: " + tongTienSGK);
        System.out.println("- Tong thanh tien Sach Tham Khao: " + tongTienSTK);
        System.out.println("- Trung binh cong don gia Sach Tham Khao: " + tbDonGiaSTK);
 
        //ví dụ tìm kiếm sách giáo khoa theo nhà xuất bản
        String nxbCanTim = "GD";
        System.out.println("\n SACH GIAO KHOA THUOC NXB: " + nxbCanTim );
        boolean timThay = false;
        for (int i = 0; i < dsSGK.size(); i++) 
        {
            SachGiaoKhoa sgk = dsSGK.get(i);
            if (sgk.getNhaXuatBan().equalsIgnoreCase(nxbCanTim)) 
            {
                sgk.xuat();
                timThay = true;
            }
        }
        
        if (timThay == false) 
        {
            System.out.println("Khong co sach nao cua NXB nay.");
        }
    }
}
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
        System.out.println("--- SACH GIAO KHOA ---");
        super.xuat();
        System.out.println("Tinh trang: " + tinhTrang + " | Thanh tien: " + thanhTien());
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
    public double thanhTien() 
    {
        return soLuong * donGia + thue;
    }
    @Override
    public void xuat() 
    {
        System.out.println("--- SACH THAM KHAO ---");
        super.xuat();
        System.out.println("Thue: " + thue + " | Thanh tien: " + thanhTien());
    }
}
public class BTT9 
{
    public static void main(String[] args) 
    {
        SachGiaoKhoa sgk = new SachGiaoKhoa("SGK01", "12/10/2026", 50000, 10, "GD", "moi");
        SachThamKhao stk = new SachThamKhao("STK02", "15/10/2026", 120000, 5, "Tre", 20000);
        sgk.xuat();
        System.out.println();
        stk.xuat();
    }
}
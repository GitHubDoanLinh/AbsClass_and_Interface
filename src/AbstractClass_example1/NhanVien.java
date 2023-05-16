package AbstractClass_example1;

public abstract class NhanVien {
    private int ma;
    private String ten;
    public int getMa() {
        return ma;
    }
    public void setMa(int ma) {
        this.ma = ma;
    }
    public String getTen() {
        return ten;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }
    public NhanVien() {

    }
    public NhanVien(int ma, String ten) {
        super();
        this.ma = ma;
        this.ten = ten;
    }
    // Định nghĩa một phương thức trìu tượng (tinh luong)
    public abstract void tinhLuong();
}



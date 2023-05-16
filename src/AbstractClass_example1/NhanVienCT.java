package AbstractClass_example1;

public class NhanVienCT extends NhanVien{
    public NhanVienCT() {
        super();
        // TODO Auto-generated constructor stub
    }

    public NhanVienCT(int ma, String ten) {
        super(ma, ten);
        // TODO Auto-generated constructor stub
    }
    public void tinhLuong() {
        // TODO Auto-generated method stub
        System.out.println("Nhan vien chinh thuc "+this.getTen()+" tự tính lương");
    }
}

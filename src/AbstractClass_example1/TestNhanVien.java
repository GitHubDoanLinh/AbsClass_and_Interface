package AbstractClass_example1;

public class TestNhanVien {
    public static void main(String[] args) {
        NhanVienThoiVu teo = new NhanVienThoiVu(2,"Do Van Teo");
        NhanVienCT ty = new NhanVienCT(1,"Tran Van Ty");
        teo.tinhLuong();
        ty.tinhLuong();
    }
}

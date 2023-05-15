package Interface_example01;

public class SinhVien implements IlamViec, IGiaiTri{
    @Override
    public void complexity() {
        System.out.println("Công việc phức tạp");
    }

    @Override
    public void difficulty() {
        System.out.println("Công việc khó khăn");
    }

    @Override
    public void hatHo() {
        System.out.println("giải trí - hát hò");
    }
    //=>BẤT KỲ CLASS NÀO ĐƯỢC DẪN XUẤT TỪ INTERFACE THÌ PHẢI CÓ ĐỊNH DẠNG (BỘ MẶT) GIỐNG NHAU. => NHẤT QUÁN TỪ ĐẦU CHÍ CUỐI
}

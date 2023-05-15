package Interface_example01;

public class test {
    public static void main(String[] args) {
        SinhVien ty = new SinhVien();
        System.out.print("sinh viên ty làm ");
        ty.complexity();
        SinhVien teo = new SinhVien();
        System.out.print("sinh viên tèo làm ");
        teo.difficulty();
        SinhVien tung = new SinhVien();
        System.out.print("sinh viên tùng thì ");
        tung.hatHo();
    }
}

package BT1_Package_Class_Object;

public class ThongTin {

  public static void main(String[] args) {
    //Gọi lại thông tin nhân viên từ class NhanVien
    NhanVien n1 = new NhanVien();
    n1.setHoVaTen("Nguyen Thi Hien");


    System.out.println(n1.hoVaTen);
    System.out.println(new NhanVien().hoVaTen);
    System.out.println(new NhanVien().congViec);

  }
}

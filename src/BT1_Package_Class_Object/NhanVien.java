package BT1_Package_Class_Object;

public class NhanVien {
    public String hoVaTen;
    public int tuoi;
    public String diaChi = "NgheAn";
    public static String congViec = "Tester";

    public NhanVien() {
    }
    public void setHoVaTen(String hoVaTen) {

        this.hoVaTen = hoVaTen;
    }

    public String getHoVaTen() {

        return hoVaTen ;
    }

    public int getTuoi() {

        return tuoi;
    }

    public String getDiaChi() {

        return diaChi;
    }

    public static String getCongViec() {

        return congViec;
    }


    public static void main(String[] args) {
        NhanVien nv = new NhanVien();
        // In ra các thông tin cơ bản của Nhân viên
        System.out.println(congViec);

    }
}

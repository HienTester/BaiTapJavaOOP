package BT2_Package_PhamViTruyCap.company;

import BT2_Package_PhamViTruyCap.person.Person;

public class Company {
    public String ten = "Nam";
    public int tuoi = 15;
    public String diaChi = "Ha Noi";

    // Hàm xây dựng
    public Company() {
    }

    // Hàm get
    public void getName() {
        System.out.println("My name is " + this.ten + " - " + " Old is " + this.tuoi + " - " + " Address is " + this.diaChi);
    }

    public static void main(String[] args) {
        // Gọi lại thông tin từ class Person
        Person ps2 = new Person();

        System.out.println(ps2.name);
        System.out.println(ps2.gender);
        System.out.println(ps2.age);

        // In ra thông tin của class Company
        Company cp = new Company();
        cp.getName();
    }
}

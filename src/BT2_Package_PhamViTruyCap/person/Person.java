package BT2_Package_PhamViTruyCap.person;
public class Person {
    // Tạo các thông tin cho class Person
   public String name = "Hien " ;
   public int age = 30 ;
   public String gender = "Nu" ;
   protected String address = "Ha Noi" ;
   protected int phone = 20 ;


   // Hàm xây dựng mapping với class Information
   public Person(String name, int age, String gender, String address, int phone) {
      this.name = name;
      this.age = age;
      this.gender = gender;
      this.address = address;
      this.phone = phone;
   }
   // Hàm xây dựng mapping với class Company của package company
     public Person() {

     }
   // Hàm get
   public void getInfor(){
      System.out.println("Name:" + this.name);
      System.out.println("Age:" + this.age);
      System.out.println("Gender:" + this.gender);
      System.out.println("Address:" + this.address);
      System.out.println("Phone:" + this.phone);
   }
}

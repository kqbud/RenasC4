package day_23;

import java.util.Scanner;

public class C1Revision {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Employee e1 = new Employee("Volkan", (byte) 32, 90000, "Toronto");
        System.out.println("birinci personel icin zam gir");
        double a = scan.nextDouble();
        e1.raiseSalary(a);
        System.out.println();
        Employee e2 = new Employee("Zuhal",(byte)18,70000,"Sirnak");
        System.out.println("ikinci personel icin zam gir");
        double b = scan.nextDouble();
        e2.raiseSalary(b);

        System.out.println("name: "+e1.getName()+"\nage: "+e1.getAge()+"\nsalary: "+e1.getSalary()+
                "\nlocation: "+e1.getLocation());
        System.out.println("name: "+e2.getName()+"\nage: "+e2.getAge()+"\nsalary: "+e2.getSalary()+
                "\nlocation: "+e2.getLocation());
    }
}
class Employee{
    String name;
    byte age;
    double salary;
    String location;

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public byte getAge() {return age;}

    public void setAge(byte age) {this.age = age;}

    public double getSalary() {return salary;}

    public void setSalary(double salary) {this.salary = salary;}

    public String getLocation() {return location;}

    public void setLocation(String location) {this.location = location;}

    //static koyunca neden this keywordler referans olamiyor?
    void raiseSalary(double raise_percent){ this.salary=this.salary+(raise_percent/100*this.salary);    }

    public Employee(String name, byte age, double salary, String location){
        System.out.println("bura constructor");
        this.name=name;
        this.age=age;
        this.salary=salary;
        this.location=location;
    }
}

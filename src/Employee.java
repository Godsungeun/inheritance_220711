// 포함관계 예제
public class Employee {
    int id;
    String name;
    Address address; // Address 클래스로 참조변수를 선언(city, country 를 갖고 있음)

    public Employee(int id, String name, Address address){  // 생성자
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void showInfo(){ // Employee의 메서드
        System.out.println(id + " " + name);
        System.out.println(address.city+ " " + address.country);
    }

    public static void main(String[] args){
        Address address1 = new Address("서울", "한국"); //Address 클래스의 객체 생성
        Address address2 = new Address("도쿄", "일본");

        Employee e = new Employee(1, "김코딩", address1); //위에서 받은 city,county 반영
        Employee e2 = new Employee(2, "박해커", address2);

        e.showInfo();
        e2.showInfo();
    }
}

class Address{
    String city, country;

    public Address(String city, String country){
        this.city = city;
        this.country = country;
    }
}
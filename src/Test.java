public class Test {
    public static void main(String[] args){
        Student s = new Student();
    }
}
class Human {
    Human() {
        System.out.println("휴먼 클래스 생성자");
    }
}
class Student extends Human { // Human 클래스로부터 상속
    Student(){
        super();  // 상위클래스 Human의 생성자를 호출한다(Line7)
        System.out.println("학생 클래스 생성자");
    }
}
// super() 예제
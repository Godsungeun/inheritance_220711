// super. 키워드 예제
public class Super {
    public static void main(String[] args){
        Lower l = new Lower();
        l.callNum();
    }
}

class Upper{
    int count = 20; // super.count
}

class Lower extends Upper{
    int count = 15; // this.count (자신의 객체(자신을 만든 클래스?) 호출)
    // Upper에서 상속받은 변수와 자신의 인스턴스 변수명이 똑같아 구분해야함

    void callNum() {
        System.out.println("count = " + count);
        System.out.println("this.count = "+this.count);
        //-> Lower 의 count 출력
        System.out.println("super.count" + super.count);
        //-> Upper의 count 출력
    }
}



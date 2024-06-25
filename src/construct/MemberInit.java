package construct;

import java.lang.reflect.Member;

public class MemberInit {

    String name;
    int age;
    int grade;


    MemberInit(){    //생성자 필요

    }

    void initMember(String name, int age, int grade) {
        this.name=name;
        this.age=age;
        this.grade=grade;
    }
}

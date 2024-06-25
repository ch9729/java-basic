package construct;

public class MethodInitMain2 {

    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        initMember(member1,"user1",15,90);



        MemberInit member2 = new MemberInit();
        initMember(member2,"user2",16,80);


        MemberInit[] members = new MemberInit[2];
        members[0] = member1;
        members[1] = member2;

        for (MemberInit m : members) {
            System.out.println("이름: " + m.name + " 나이: " + m.age + " 성적: " + m.grade);
        }
    }

    public static void initMember(MemberInit member, String name, int age, int grade){
        member.name = name;
        member.age = age;
        member.grade = grade;
    }
}

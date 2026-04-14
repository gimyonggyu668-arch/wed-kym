package exam;

public class Member {
    private String name;
    private int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // private 필드에 접근하기 위한 Getter
    public String getName() { return name; }
    public int getAge() { return age; }
}
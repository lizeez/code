package luohao;

public class Student1 {
    private String name;    // 姓名
    private int age;        // 年龄

    public Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取学生姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 获取学生年龄
     */
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

}

package luohao;

public class Student1 {
    private String name;    // ����
    private int age;        // ����

    public Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * ��ȡѧ������
     */
    public String getName() {
        return name;
    }

    /**
     * ��ȡѧ������
     */
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

}

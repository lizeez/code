package luohao;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test01 {
	public static void main(String[] args) {
        List<Student1> list = new ArrayList<>();     // Java 7����ʯ�﷨(����������ļ������в���Ҫд����)
        list.add(new Student1("Hao LUO", 33));
        list.add(new Student1("XJ WANG", 32));
        list.add(new Student1("Bruce LEE", 60));
        list.add(new Student1("Bob YANG", 22));

        // ͨ��sort�����ĵڶ�����������һ��Comparator�ӿڶ���
        // �൱���Ǵ���һ���Ƚ϶����С���㷨��sort������
        // ����Java��û�к���ָ�롢�º�����ί�������ĸ���
        // ���Ҫ��һ���㷨����һ��������Ψһ��ѡ�����ͨ���ӿڻص�
        Collections.sort(list, new Comparator<Student1> () {

            @Override
            public int compare(Student1 o1, Student1 o2) {
                return o1.getName().compareTo(o2.getName());    // �Ƚ�ѧ������
            }
        });

        for(Student1 stu : list) {
            System.out.println(stu);
        }
//      ������: 
//      Student [name=Bob YANG, age=22]
//      Student [name=Bruce LEE, age=60]
//      Student [name=Hao LUO, age=33]
//      Student [name=XJ WANG, age=32]
    }
}

package kedaxunfei;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeMap;

public class Main2 {
    class Team {
        String name;
        int grade;
        int realwin;
        int in;

        public Team(String name, int grade, int realwin, int in) {
            this.name = name;
            this.grade = grade;
            this.realwin = realwin;
            this.in = in;
        }

        public void setGrade(int grade) {
            this.grade = grade;
        }

        public void setRealwin(int realwin) {
            this.realwin = realwin;
        }

        public void setIn(int in) {
            this.in = in;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main2 main = new Main2();
        while (sc.hasNext()) {
            String ns = sc.nextLine();
            int n = Integer.valueOf(ns);
            Team[] win = new Team[n];// n֧��ӵ�����
            TreeMap<String, Team> map = new TreeMap<>();
            for (int i = 0; i < n; i++) {
                String cname = sc.nextLine();
                Team team = main.new Team(cname, 0, 0, 0);
                map.put(cname, team);
            }
            int len = (n * (n - 1)) / 2;// �����еı���������д���
            for (int i = 0; i < len; i++) {
                // �Կո��Ϊ��ս���str[0]�ͱȷ�str[1]�ֱ���д���
                // A-B 1:2
                String[] str = sc.nextLine().split(" ");
                String[] name = str[0].split("-");
                String cname1 = name[0];// A
                String cname2 = name[1];// B
                String[] grad = str[1].split(":");
                int c1 = Integer.valueOf(grad[0]);// 1
                int c2 = Integer.valueOf(grad[1]);// 2
                int c = c1 - c2;// �ȷֲ�࣬���ڼ��㾻ʤ��
                int grade1 = 0;// �÷� 3 1 0
                int realwin1 = 0;// ��ʤ����
                int in1 = c1;// ������
                int grade2 = 0;
                int realwin2 = 0;
                int in2 = c2;
                if (c == 0) {// ƽ��
                    grade1 = 1;
                    grade2 = 1;
                }
                if (c > 0) {
                    grade1 = 3;
                    realwin1 = c;
                }
                if (c < 0) {
                    grade2 = 3;
                    realwin2 = c2 - c1;
                }
                //���õ÷֡���ʤ������������
                Team team = map.get(cname1);
                team.setGrade(team.grade + grade1);
                team.setIn(team.in + in1);
                team.setRealwin(team.realwin + realwin1);
                map.put(cname1, team);

                Team team2 = map.get(cname2);
                team2.setGrade(team2.grade + grade2);
                team2.setIn(team2.in + in2);
                team2.setRealwin(team2.realwin + realwin2);
                map.put(cname2, team2);
            }
            int i = 0;
            for (String key : map.keySet()) {
                win[i++] = map.get(key);
            }
            //�Զ�������Ƚ������������
            //���Ȱ��ջ��֣���ξ�ʤ����������
            Arrays.sort(win, new Comparator<Team>() {
                public int compare(Team o1, Team o2) {
                    int grade = o2.grade - o1.grade;
                    int realwin = o2.realwin - o1.realwin;
                    int in = o2.in - o1.in;
                    if (grade != 0)
                        return grade;
                    else if (realwin != 0)
                        return realwin;
                    else
                        return in;
                }
            });
            String[] name = new String[n / 2];
            for (i = 0; i < n / 2; i++)
                name[i] = win[i].name;
            Arrays.sort(name);//��������ְ��ֵ������
            for (i = 0; i < n / 2; i++)
                System.out.println(name[i]);
        }
    }
}

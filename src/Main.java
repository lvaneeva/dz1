public class Main {
    public static void main(String[] args) {

        /*Member[] members =new Member[4];
        members[0]=new Member("Fred",100);
        members[1]=new Member("Kate",200);
        members[2]=new Member("Jim",300);
        members[3]=new  Member("Alex",400);
        Team team= new Team("Winners", members);*/

        //������� �������
        Team team= new Team("Winners");
        //������� ���������� ��� ���� ������ �������
        team.info();
        // ������� ������ �����������
        Course c = new Course( new DistanceRunning(200),  new HighJump(2.0), new PullUpsBar(20));
        // ������ ������� ������ ������
        c.doIt(team);
        // ���������� ����������
        team.showResults();
    }
}
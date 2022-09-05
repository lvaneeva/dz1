public abstract class Obstacor {
      public abstract void doIt(Member member);

}
//��� �� ���������
class DistanceRunning extends Obstacor {
    int length;
    public DistanceRunning(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Member member) {
        member.run(length);
    }
}
//������ � ������
class HighJump extends Obstacor {
    double high;
    public HighJump(double high) {
        this.high=high;

    }
    public void doIt(Member member) {
        member.jump(high);
    }
}
//������������ �� �����������
class PullUpsBar extends Obstacor {
    int count;
    public PullUpsBar(int count) {
        this.count=count;

    }
    public void doIt(Member member) {
        member.pullUp(count);
    }
}

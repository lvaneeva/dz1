public abstract class Obstacor {
      public abstract void doIt(Member member);

}
//бег на дистанцию
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
//прыжки в высоту
class HighJump extends Obstacor {
    double high;
    public HighJump(double high) {
        this.high=high;

    }
    public void doIt(Member member) {
        member.jump(high);
    }
}
//подт€гивание на перекладине
class PullUpsBar extends Obstacor {
    int count;
    public PullUpsBar(int count) {
        this.count=count;

    }
    public void doIt(Member member) {
        member.pullUp(count);
    }
}

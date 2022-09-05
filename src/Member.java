public class Member {
    private String name;
    private int maxRunDistance;
    private double maxHigh;
    private int energy;
    boolean active=true;

    public Member(String name, int maxRunDistance, double maxHigh, int energy) {
        this.name = name;
        this.maxRunDistance=maxRunDistance;
        this.maxHigh=maxHigh;
        this.energy=energy;

    }
    public int getmaxRunDistance(){
        return this.maxRunDistance;
    }
    public void print(){

        System.out.println("�������� " + this.name+", ������������ ��������� ��� ���� "+ maxRunDistance+", ������ "+maxHigh+ ", ������� "+energy);
    }
    public void run(int dist) {
        if (dist <= maxRunDistance) {
            System.out.println(name + " successfully ran");
        } else {
            System.out.println(name + " failed ran");
            active = false;
        }
    }
    public void jump(double dist) {
        if (dist <= maxHigh) {
            System.out.println(name + " successfully jump");
        } else {
            System.out.println(name + " failed jump");
             active = false;
        }
    }
    public void pullUp(int count) {
        if (count <= energy) {
            System.out.println(name + " successfully pulled up");
        } else {
            System.out.println(name + " failed pulled up");
             active = false;
        }
    }

}

public class Course {
    Obstacor[] obstacors=new Obstacor[3];

    public Course(Obstacor o1, Obstacor o2, Obstacor o3) {
        obstacors[0]=o1;
        obstacors[1]=o2;
        obstacors[2]=o3;
    }
    public void doIt(Team team){
        for(Member member: team.getMembers()){
            for (Obstacor o: obstacors) {
                o.doIt(member);
            }
        }
    }

}

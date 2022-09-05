public class Team {
    private String nameTeam;

    Member[] members;

    public Team(String nameTeam) {
        this.nameTeam = nameTeam;
        members =new Member[4];
        members[0]=new Member("Ivan", 150, 1.5, 15);
        members[1]=new Member("Petr", 250, 2.5,25);
        members[2]=new Member("Sergei", 200, 2.0,20);
        members[3]=new  Member("Nikolay", 199, 2.1,19);
    }

    public Team(String nameTeam, Member[] members) {
        this.nameTeam = nameTeam;
        this.members = members;
    }

    public void info(){
        for (int i=0; i< members.length; i++) {

                members[i].print();
            }
    }
    public Member[] getMembers(){
        return members;
    }
    public void showResults(){
        for (int i=0; i< members.length; i++) {
            if (members[i].active) {
                members[i].print();
            }
        }
    }
}

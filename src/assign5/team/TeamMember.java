package assign5.team;

import assign5.responsibility.Responsiblity;

public abstract class TeamMember {
    protected Responsiblity respons;
    public void setRespons(Responsiblity respons){
        this.respons = respons;
    }
    public void assignrespons(){
        respons.DoJob();
    }
}

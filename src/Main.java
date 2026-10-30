import assign5.responsibility.Presentation;
import assign5.team.Designer;
import assign5.team.Investigator;
import assign5.team.TeamMember;
import assign5.team.Writer;

public static void main() {
    TeamMember designer = new Designer();
    TeamMember investigator = new Investigator();
    TeamMember writer = new Writer();
    TeamMember writer2 = new Writer();

    designer.assignrespons();
    investigator.assignrespons();
    writer.assignrespons();
    writer2.assignrespons();
    writer2.setRespons(new Presentation());
    writer2.assignrespons();
}

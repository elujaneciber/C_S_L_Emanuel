
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nn
 */
public class League {

    private List<Team> lstTeams;
    private List<Match> lstMatches;
    private Team Team;

    public League() {
        this.lstTeams = new ArrayList<>();
        this.lstMatches = new ArrayList<>();
    }

    public void addLeagueTeam(Team team) {
        lstTeams.add(team);
    }

    public void teamClash(Team teamOne, Team teamTwo) {
        Match match = new Match(teamOne, teamTwo);
    }

    /**
     * @return the lstTeams
     */
    public List<Team> getLstTeams() {
        return lstTeams;
    }

    /**
     * @param lstTeams the lstTeams to set
     */
    public void setLstTeams(List<Team> lstTeams) {
        this.lstTeams = lstTeams;
    }

    /**
     * @return the lstMatches
     */
    public List<Match> getLstMatches() {
        return lstMatches;
    }

    /**
     * @param lstMatches the lstMatches to set
     */
    public void setLstMatches(List<Match> lstMatches) {
        this.lstMatches = lstMatches;
    }

    /**
     * @return the Team
     */
    public Team getTeam() {
        return Team;
    }

    /**
     * @param Team the Team to set
     */
    public void setTeam(Team Team) {
        this.Team = Team;
    }

    void deleteTeam(String selectedTeam) {
        if (lstTeams != null) {

            for (int i = 0; i < lstTeams.size(); i++) {
                Team team = lstTeams.get(i);
                if (team != null && team.getNameTeam().equals(selectedTeam)) {
                    lstTeams.remove(i);
                    break;
                }
            }
        }   
    }

       public void reset() {
           lstTeams.clear();
           lstMatches.clear();           
    }
}


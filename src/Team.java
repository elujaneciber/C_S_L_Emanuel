
/**
 *
 * @author nn
 */
public class Team {

    private String nameTeam;
    private int pointsTotal;
    private int gamesPlayed;
    private int gamesWon;
    private int gamesLost;
    private int goalsScored;
    private int goalsConceded;

    public Team(String nameTeam) {
        this.nameTeam = nameTeam;
        this.pointsTotal = 0;
        this.gamesPlayed = 0;
        this.gamesWon = 0;
        this.gamesLost = 0;
        this.goalsScored = 0;
        this.goalsConceded = 0;
    }

    /**
     * @return the nameTeam
     */
    public String getNameTeam() {
        return nameTeam;
    }

    /**
     * @param nameTeam the nameTeam to set
     */
    public void setNameTeam(String nameTeam) {
        this.nameTeam = nameTeam;
    }

    /**
     * @return the pointsTotal
     */
    public int getPointsTotal() {
        return pointsTotal;
    }

    /**
     * @param pointsTotal the pointsTotal to set
     */
    public void setPointsTotal(int pointsTotal) {
        this.pointsTotal = pointsTotal;
    }

    /**
     * @return the gamesPlayed
     */
    public int getGamesPlayed() {
        return gamesPlayed;
    }

    /**
     * @param gamesPlayed the gamesPlayed to set
     */
    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    /**
     * @return the gamesWon
     */
    public int getGamesWon() {
        return gamesWon;
    }

    /**
     * @param gamesWon the gamesWon to set
     */
    public void setGamesWon(int gamesWon) {
        this.gamesWon = gamesWon;
    }

    /**
     * @return the gamesLost
     */
    public int getGamesLost() {
        return gamesLost;
    }

    /**
     * @param gamesLost the gamesLost to set
     */
    public void setGamesLost(int gamesLost) {
        this.gamesLost = gamesLost;
    }

    /**
     * @return the goalsScored
     */
    public int getGoalsScored() {
        return goalsScored;
    }

    /**
     * @param goalsScored the goalsScored to set
     */
    public void setGoalsScored(int goalsScored) {
        this.goalsScored = goalsScored;
    }

    /**
     * @return the goalsConceded
     */
    public int getGoalsConceded() {
        return goalsConceded;
    }

    /**
     * @param goalsConceded the goalsConceded to set
     */
    public void setGoalsConceded(int goalsConceded) {
        this.goalsConceded = goalsConceded;
    }
}

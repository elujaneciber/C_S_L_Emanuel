
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import javax.swing.DefaultRowSorter;
import javax.swing.JTable;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author nn
 */
public class Match {

    private Team teamOne;
    private Team teamTwo;
    private int teamOneGoals;
    private int teamTwoGoals;

    public Match(Team teamOne, Team teamTwo) {
        this.teamOne = teamOne;
        this.teamTwo = teamTwo;
    }

    public void playMatch(JTable jPositionTable, int rowOne, int rowTwo) {
        Random random = new Random();
        teamOneGoals = random.nextInt(4);
        teamTwoGoals = random.nextInt(4);

        // Actualización de estadísticas de equipos
        teamOne.setGamesPlayed(teamOne.getGamesPlayed() + 1);
        teamTwo.setGamesPlayed(teamTwo.getGamesPlayed() + 1);

        teamOne.setGoalsScored(teamOne.getGoalsScored() + teamOneGoals);
        teamOne.setGoalsConceded(teamOne.getGoalsConceded() + teamTwoGoals);
        teamOne.setPointsTotal(teamOne.getPointsTotal() + teamOneGoals); // //Suma los goles anotados a los puntos totales
        teamOne.setPointsTotal(teamOne.getPointsTotal() - teamTwoGoals); //Resta los goles concedidos a los puntos totales
        
        teamTwo.setGoalsScored(teamTwo.getGoalsScored() + teamTwoGoals);
        teamTwo.setGoalsConceded(teamTwo.getGoalsConceded() + teamOneGoals);
        teamTwo.setPointsTotal(teamTwo.getPointsTotal() + teamTwoGoals); //Suma los goles anotados a los puntos totales
        teamTwo.setPointsTotal(teamTwo.getPointsTotal() - teamOneGoals); //Resta los goles concedidos a los puntos totales

        // Actualización de puntos por el bonus del partido ganado, perdido o empatado
        if (teamOneGoals > teamTwoGoals) {
            teamOne.setPointsTotal(teamOne.getPointsTotal() + 3); // Cuando el equipo 1 gana
            teamOne.setGamesWon(teamOne.getGamesWon() + 1);
            teamTwo.setGamesLost(teamTwo.getGamesLost() + 1);
        } else if (teamOneGoals < teamTwoGoals) {
            teamTwo.setPointsTotal(teamTwo.getPointsTotal() + 3); // Cuando el equipo 2 gana
            teamTwo.setGamesWon(teamTwo.getGamesWon() + 1);
            teamOne.setGamesLost(teamOne.getGamesLost() + 1);
        } else {
            // En caso de empate
            teamOne.setPointsTotal(teamOne.getPointsTotal() + 1);
            teamTwo.setPointsTotal(teamTwo.getPointsTotal() + 1);
        }
        
                  
        printValues(jPositionTable, teamOne, teamTwo, rowOne, rowTwo);
    }

    private void printValues(JTable jPositionTable, Team teamOne, Team teamTwo, int rowOne, int rowTwo) {
        jPositionTable.setValueAt(teamOne.getPointsTotal(), rowOne, 1);
        jPositionTable.setValueAt(teamOne.getGamesPlayed(), rowOne, 2);
        jPositionTable.setValueAt(teamOne.getGamesWon(), rowOne, 3);
        jPositionTable.setValueAt(teamOne.getGamesLost(), rowOne, 4);
        jPositionTable.setValueAt(teamOne.getGoalsScored(), rowOne, 5);
        jPositionTable.setValueAt(teamOne.getGoalsConceded(), rowOne, 6);

        jPositionTable.setValueAt(teamTwo.getPointsTotal(), rowTwo, 1);
        jPositionTable.setValueAt(teamTwo.getGamesPlayed(), rowTwo, 2);
        jPositionTable.setValueAt(teamTwo.getGamesWon(), rowTwo, 3);
        jPositionTable.setValueAt(teamTwo.getGamesLost(), rowTwo, 4);
        jPositionTable.setValueAt(teamTwo.getGoalsScored(), rowTwo, 5);
        jPositionTable.setValueAt(teamTwo.getGoalsConceded(), rowTwo, 6);
    
        // Ordenamiento de las filas de la tabla segun los puntos
        jPositionTable.setAutoCreateRowSorter(true);
        DefaultRowSorter sorter = ((DefaultRowSorter) jPositionTable.getRowSorter());
        ArrayList<RowSorter.SortKey> sortKeys = new ArrayList<>();
        sortKeys.add(new RowSorter.SortKey(1, SortOrder.DESCENDING));
        sorter.setSortKeys(sortKeys);
    } 
}

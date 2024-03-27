
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static java.util.regex.Pattern.matches;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nn
 */
public class GameGenerator {
    public static List<Match> gameGenerator (List<Team> lstTeams) {
        
        List<Match> lstMatches = new ArrayList<>();

        // Generar todas las combinaciones de partidos entre los equipos
        for (int i = 0; i < lstTeams.size(); i++) {
            for (int j = i + 1; j < lstTeams.size(); j++) {
                Team teamOne = lstTeams.get(i);
                Team teamTwo = lstTeams.get(j);
                Match match = new Match(teamOne, teamTwo);
                lstMatches.add(match);
            }
        }

        return lstMatches;
    }
}

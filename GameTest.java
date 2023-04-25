import java.util.*;
import java.security.*;

public class GameTest {

    /*
     * Display intro
     * 
     * 
     * 1v1 semi - gme logic
     * 
     * result
     * 
     * 1v1 semi - game logic
     * 
     * result
     * 
     * 1v1 final - game logic
     * 
     * resut
     *
     */

    /**
     * @param args
     */
    public static void main(String[] args) {

        // Teams list - team
        // Players list inside teams
        SecureRandom teams = new SecureRandom();

        TeamPlayer John = new TeamPlayer("John", "FW", 93, 77, 85);
        TeamPlayer David = new TeamPlayer("David", "MF", 80, 82, 92);
        TeamPlayer Raule = new TeamPlayer("Raule", "DF", 65, 96, 69);
        TeamPlayer Wong = new TeamPlayer("Wong", "GK", 82, 95, 70);
        Team Canada = new Team("Canada", John, David, Raule, Wong, 88);

        TeamPlayer Messi = new TeamPlayer("Messi", "FW", 98, 87, 96);
        TeamPlayer Fernandez = new TeamPlayer("Fernandez", "MF", 89, 85, 93);
        TeamPlayer Otamendi = new TeamPlayer("Otamendi", "DF", 70, 90, 72);
        TeamPlayer Martinez = new TeamPlayer("Martinez", "GK", 85, 88, 78);
        Team Argentina = new Team("Argentina", Messi, Fernandez, Otamendi, Martinez, 96);

        TeamPlayer Mbappe = new TeamPlayer("Mbappe", "FW", 98, 67, 95);
        TeamPlayer Griezmann = new TeamPlayer("Griezmann", "MF", 92, 71, 93);
        TeamPlayer Varane = new TeamPlayer("Varane", "DF", 76, 91, 80);
        TeamPlayer lloris = new TeamPlayer("lloris", "GK", 79, 87, 63);
        Team France = new Team("France", Mbappe, Griezmann, Varane, lloris, 81);

        TeamPlayer Gomez = new TeamPlayer("Gomez", "FW", 92, 66, 78);
        TeamPlayer Muller = new TeamPlayer("Muller", "MF", 96, 80, 91);
        TeamPlayer Boateng = new TeamPlayer("Boateng", "DF", 66, 96, 83);
        TeamPlayer Neuer = new TeamPlayer("Neuer", "GK", 90, 91, 78);
        Team Germany = new Team("Germany", Gomez, Muller, Boateng, Neuer, 91);

        Map<Integer, Object> Teams = new HashMap<Integer, Object>();
        Teams.put(1, Canada);
        Teams.put(2, Germany);
        Teams.put(3, France);
        Teams.put(4, Argentina);

        int upperbound = Teams.size();
        int firstSemiTeamOneKey = teams.nextInt(upperbound) + 1;

        int firstSemiTeamTwoKey = 0, secondSemiTeamOneKey = 0, secondSemiTeamTwoKey = 0;

        switch (firstSemiTeamOneKey) {
            case 1:
                firstSemiTeamOneKey = 3;
                secondSemiTeamOneKey = 2;
                secondSemiTeamTwoKey = 4;
                break;
            case 2:
                firstSemiTeamOneKey = 1;
                secondSemiTeamOneKey = 4;
                secondSemiTeamTwoKey = 3;
                break;
            case 3:
                firstSemiTeamOneKey = 2;
                secondSemiTeamOneKey = 1;
                secondSemiTeamTwoKey = 4;
                break;
            case 4:
                firstSemiTeamOneKey = 2;
                secondSemiTeamOneKey = 3;
                secondSemiTeamTwoKey = 1;
                break;
        }

        Team firstSemiTeamOne = (Team) Teams.get(firstSemiTeamOneKey);
        Team firstSemiTeamTwo = (Team) Teams.get(firstSemiTeamTwoKey);
        Team secondSemiTeamOne = (Team) Teams.get(secondSemiTeamOneKey);
        Team secondSemiTeamTwo = (Team) Teams.get(secondSemiTeamTwoKey);

        GameLogic First = new GameLogic(firstSemiTeamOne, firstSemiTeamTwo);
        GameLogic Second = new GameLogic(secondSemiTeamOne, secondSemiTeamTwo);
        First.OneVsOne();
        Second.OneVsOne();
    }

}

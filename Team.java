import java.util.*;

public class Team {

    /*
     * what team looks like
     * what team player characterstics will do to team
     * team perf formula
     * 
     * Team Canada
     * Ryan
     * FW - ATT, DEF, BallSkill
     * Braydon
     * MF - ATT, DEF, BallSkill
     * Scholl
     * DF - ATT, DEF, BallSkill
     * Young
     * GK - Jump, DEF, BallSkill
     * 
     */

    // team player name display
    // ask for 2 user input
    // store input

    // performance formula calculator

    // make performance available
    String name;
    TeamPlayer TP1, TP2, TP3, TP4;
    Map<String, Integer> stats = new HashMap<String, Integer>();
    Scanner myObj = new Scanner(System.in);

    public Team(String n, TeamPlayer P1, TeamPlayer P2, TeamPlayer P3, TeamPlayer P4, int c) {
        name = n;
        TP1 = P1;
        TP2 = P2;
        TP3 = P3;
        TP4 = P4;
        stats.put("attack power", (TP1.att + TP2.att + TP3.att) / 3);
        stats.put("defence strength", (TP1.def + TP2.def + TP3.def + TP4.def) / 4);
        stats.put("team coordination", c);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // print

    public void getUserInput() {
        System.out.println(
                "Please pick from the following options for `INJURIES` in this team:\n1.Zero injuries\n2. One injury\n3. Two injuries\n4. Three injuries\n\nEnter the digit: ");
        stats.put("injuries", myObj.nextInt());
        System.out.println(
                "\n\nWith the change in new coach in the last minute, this match can turn around, how do you think the team will perform with the new coach?\n\n");
        System.out.println(
                "Please pick from the following options for `New COACH's PERFORMANCE` in this team:\n1.Amazing \n2. Not much impact\n3. He screwed it up!!\n\nEnter the digit: ");

        int temp = myObj.nextInt();

        switch (temp) {
            case 1:
                stats.put("Coach", 100);
                break;
            case 2:
                stats.put("Coach", 0);
                break;
            case 3:
                stats.put("Coach", -100);
                break;
        }

    }

    public void getTeamData() {
        System.out.println("Team name: " + name + "\n");
        System.out.println("Team attack: " + stats.get("attack power") + "\n");
        System.out.println("Team defence: " + stats.get("defence strength") + "\n");
        System.out.println("Team coordination: " + stats.get("team coordination") + "\n");
        System.out.println("Team injuries: " + stats.get("injuries") + "\n");
        System.out.println("Team Coach: " + stats.get("Coach") + "\n");

        TP1.getPlayerDetails();
        TP2.getPlayerDetails();
        TP3.getPlayerDetails();
        TP4.getPlayerDetails();

    }
}

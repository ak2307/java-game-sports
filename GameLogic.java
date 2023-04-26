import java.util.*;
import java.security.*;

public class GameLogic {

    static Team one, two;

    public GameLogic(Team a, Team b) {
        one = a;
        two = b;
    }

    public double perfCalc(HashMap statistics) {

        int att = (int) statistics.get("attack power");
        int def = (int) statistics.get("defence strength");
        int teamCoord = (int) statistics.get("team coordination");
        int injuries = (int) statistics.get("injuries");
        int coach = (int) statistics.get("Coach");

        coach = Special(coach);

        double perfForm = (double) (att + def + (2 * teamCoord) + (0.2 * injuries) + coach);
        double result = (perfForm / 5.2);
        return result;
    }

    public void OneVsOne() {
        // 30/30/30 for Attack/def calculator - shows random att vs random def based on

        // perf dominance
        // // 2 set of random # of players for def nd att
        // calculate random avg def
        // calulcate random avg att
        // write everything in the

    }

    static int Special(int coachSkills) {
        // special function
        SecureRandom random = new SecureRandom();

        float rand1 = random.nextFloat();

        int upperbound = 10;

        int intRand = random.nextInt(upperbound);

        int a = (int) (rand1 * coachSkills);
        // converting it to positive and negative randomly, based on intRand generator
        if (intRand > 5) {
            a *= -1;
        }

        return a;
    }

    private static void Penalty(Team a, Team b) {
        // Penalty function
    }

};
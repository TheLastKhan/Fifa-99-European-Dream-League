package Galatasaray;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author hakan
 */

public class Galatasaray {

    public static void main(String[] args) {        
        Uefa();
    }

    public static void Uefa() {

        System.out.println("""
        Please press 'c' to start or press 'e' to exit ... 
        """);

        Scanner input = new Scanner(System.in);
        char choice = input.next().toLowerCase().charAt(0);

        if (choice == 'e') {
            System.out.println("\nExiting ...");
            System.exit(0);
        } else if (choice == 'c') {

            // 🏆 Bags
            ArrayList<String> bag1 = new ArrayList<>();
            ArrayList<String> bag2 = new ArrayList<>();
            ArrayList<String> bag3 = new ArrayList<>();
            ArrayList<String> bag4 = new ArrayList<>();

            bag3.add("Galatasaray");
            bag2.add("AC Milan");
            bag2.add("Arsenal");
            bag1.add("Bayern Munich");
            bag3.add("Benfica");
            bag4.add("Brondby");
            bag2.add("Dortmund");
            bag4.add("Dynamo Kyiv");
            bag1.add("FC Barcelona");
            bag4.add("Feyenoord");
            bag4.add("Goteborg");
            bag2.add("Inter Milan");
            bag1.add("Juventus");
            bag2.add("Liverpool");
            bag1.add("Manchester Utd");
            bag3.add("Monaco");
            bag3.add("Paris SG");
            bag3.add("Rangers");
            bag1.add("Real Madrid CF");
            bag4.add("Rosenborg");

            // 🏆 Groups
            ArrayList<String> groupA = new ArrayList<>();
            ArrayList<String> groupB = new ArrayList<>();
            ArrayList<String> groupC = new ArrayList<>();
            ArrayList<String> groupD = new ArrayList<>();
            ArrayList<String> groupE = new ArrayList<>();

            System.out.println("\nStarting ... \n");

            System.out.println("All Teams:");

            printTeams("1. Bag", bag1);
            printTeams("2. Bag", bag2);
            printTeams("3. Bag", bag3);
            printTeams("4. Bag", bag4);

            System.out.println("");

            ArrayList<ArrayList<String>> groups = new ArrayList<>();
            groups.add(groupA);
            groups.add(groupB);
            groups.add(groupC);
            groups.add(groupD);
            groups.add(groupE);

            ArrayList<ArrayList<String>> bags = new ArrayList<>();
            bags.add(bag1);
            bags.add(bag2);
            bags.add(bag3);
            bags.add(bag4);

            int bagIndex = 0;
            int groupIndex = 0;

            while (bagIndex < 4) {
                System.out.println("\nPlease press 'c' to continue or press 'e' to exit ... ");
                char c = input.next().toLowerCase().charAt(0);

                if (c == 'e') {
                    System.out.println("Exiting... \n");
                    System.exit(0);
                } else if (c == 'c') {
                    if (!bags.get(bagIndex).isEmpty()) {
                        int randomIndex = (int) (Math.random() * bags.get(bagIndex).size());
                        String team = bags.get(bagIndex).remove(randomIndex);
                        groups.get(groupIndex).add(team);
                        System.out.println("Bag " + (bagIndex + 1) + " - Team: " + team + " => Added to Group " + (char) ('A' + groupIndex));
                        groupIndex++;

                        if (groupIndex == 5) {
                            groupIndex = 0;
                            bagIndex++;
                        }
                    }
                }
            }

            System.out.println("\nFinal Groups:");
            for (int i = 0; i < groups.size(); i++) {
                System.out.println("Group " + (char) ('A' + i) + ": " + groups.get(i));
            }
        }
        input.close();
    }

    public static void printTeams(String title, ArrayList<String> teams) {
        System.out.println("\n" + title);
        for (String team : teams) {
            System.out.println(team);
        }
    }
}



import Unit.*;
import Unit.Distant_Battale.Crossbowman;
import Unit.Distant_Battale.Sniper;
import Unit.Magical.Mag;
import Unit.Magical.Monk;
import Unit.Сlose_combat.Farmer;
import Unit.Сlose_combat.Outlaw;
import Unit.Сlose_combat.Spearman;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;


public class Main {
    static final int UNITS = 10;
    public static ArrayList<man> team1 = new ArrayList<>();
    public static ArrayList<man> team2 = new ArrayList<>();
    public static ArrayList<man> allTeam = new ArrayList<>();
    static int dieTeam1 = 0;
    static int dieTeam2 = 0;

    Scanner user_input = new Scanner(System.in);
        System.out.print"Press Enter to begin.");
        user_input.nextLine();

    createTeam(team1, 0,1);
    createTeam(team2, 3,10);
    allTeam.addAll(team1);
    allTeam.addAll(team2);
    sortedTeam(allTeam);
      while (true){
        user_input.nextLine();
        for (man human: allTeam) {
            if ( team1.contains(human)) human.step(team1, team2);
            else human.step(team2, team1);
        }
        for (man human: team1) {
            if (human.getState() == "Die") dieTeam1++;
        }
        if (dieTeam2 == 10){
            System.out.println("******************************************Green winner!******************************************");
            break;
        } else dieTeam1 = 0;
        for (man human: team2) {
            if (man.getState() == "Die") dieTeam2++;
        }
        if (dieTeam2 == 10){
            System.out.println("******************************************Blue winner!******************************************");
            break;
        } else dieTeam2 = 0;
    }


    public static void main(String[] args) {

        static void sortedTeam (ArrayList < man > team) {
            team.sort(new Comparator<man>() {
                @Override
                public int compare(man o1, man o2) {
                    if (o2.getSpeed() == o1.getSpeed()) {
                        return o1.getHp() - o2.getHp();
                    }
                    return o2.getSpeed() - o1.getSpeed();
                }
            });
        }

        static void createTeam (ArrayList team,int offset, int posY){
            for (int i = 1; i <= UNITS; i++) {
                int rnd = new Random().nextInt(4) + offset;
                switch (rnd) {
                    case (0):
                        team.add(new Sniper(man.getName(), i, posY));
                        break;
                    case (1):
                        team.add(new Outlaw(man.getName(), i, posY));
                        break;
                    case (2):
                        team.add(new Mag(man.getName(), i, posY));
                        break;
                    case (3):
                        team.add(new Farmer<>(man.getName(), i, posY));
                        break;
                    case (4):
                        team.add(new Crossbowman(man.getName(), i, posY));
                        break;
                    case (5):
                        team.add(new Monk(man.getName(), i, posY));
                        break;
                    case (6):
                        team.add(new Spearman(man.getName(), i, posY));
                        break;
                }
            }
        }
    }





//        ArrayList<man> arrayList = new ArrayList<>();
//        arrayList.addAll(getUnit(UNITS, 1));
//
//        ArrayList<man> arrayList1 = new ArrayList<>();
//        arrayList1.addAll(getUnit(UNITS, 2));
//
//        ArrayList<man>arrayListAll = new ArrayList<>();
//        arrayListAll.addAll(arrayList);
//        arrayListAll.addAll(arrayList1);
//
//        sortList(arrayListAll);
//
//        System.out.println("Группа 1");
//        for (int i = 0; i <UNITS; i++) {
//            System.out.println(arrayList.get(i).getInfo());
//        }
//        arrayList = new ArrayList<>();
//        arrayList.addAll(Team2(UNITS));
//
//        arrayList.sort(new Comparator<man>() {
//            @Override
//            public int compare(man o1, man o2) {
//                return o1.getSpeed() - o2.getSpeed();
//            }
//        });
//        System.out.println("Группа 2");
//        for (int i = 0; i <UNITS; i++) {
//            System.out.println(arrayList.get(i).getInfo());
//        }
//        System.out.println("Количество персонажей" + " " + man.getPrCount());
//
//    }

////    private static String getName() {
//            String name = String.valueOf(Names.values()[new Random().nextInt(Names.values().length - 1)]);
//            return name;
//    }
//    private static ArrayList getUnit(int a, int group) {
//        Random rnd = new Random();
//        ArrayList<man> arrayList1 = new ArrayList<>();
//        if(group ==0)
//        for (int i = 0; i < a; i++) {
//            int man= rnd.nextInt(6);
//            switch (man) {
//                case 0:
//                    arrayList1.add(new Farmer<>(getName(),i+1,1));
//                    break;
//                case 1:
//                    arrayList1.add(new Mag(getName(),i+1,1));
//                    break;
//                case 2:
//                    arrayList1.add(new Outlaw(getName(),i+1,1));
//                    break;
//                case 3:
//                    arrayList1.add( new Monk(getName(),i+1,1));
//                    break;
//                case 4:
//                    arrayList1.add(new Crossbowman(getName(),i+1,1));
//                    break;
//                case 5:
//                    arrayList1.add(new Sniper(getName(),i+1,1));
//                    break;
//                case 6:
//                    arrayList1.add(new Spearman(getName(),i+1,1));
//                    break;
//
//            }
//        }
//        return arrayList1;
//            }
//    private static ArrayList Team2(int a) {
//        Random rnd = new Random();
//        ArrayList<man> arrayList2 = new ArrayList<>();
//        for (int i = 0; i < a; i++) {
//            int man = rnd.nextInt(7);
//            switch (man) {
//                case 0:
//                    arrayList2.add(new Farmer<>(getName(), i + 1, 1));
//                    break;
//                case 1:
//                    arrayList2.add(new Mag(getName(), i + 1, 1));
//                    break;
//                case 2:
//                    arrayList2.add(new Outlaw(getName(), i + 1, 1));
//                    break;
//                case 3:
//                    arrayList2.add(new Monk(getName(), i + 1, 1));
//                    break;
//                case 4:
//                    arrayList2.add(new Crossbowman(getName(), i + 1, 1));
//                    break;
//                case 5:
//                    arrayList2.add(new Sniper(getName(), i + 1, 1));
//                    break;
//                case 6:
//                    arrayList2.add(new Spearman(getName(), i + 1, 1));
//                    break;
//
//            }
//        }




    




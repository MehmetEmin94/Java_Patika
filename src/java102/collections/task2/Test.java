package collections.task2;

import java.util.ArrayList;
import java.util.Random;

public class Test {
    public static void main(String[] args) {

        Random random=new Random();

        ArrayList<Team> teams=new ArrayList<>();
        ArrayList<Team> teamsTemp=new ArrayList<>();
        ArrayList<Round> rounds = new ArrayList<>();

        teams.add(new Team("Galatasaray"));
        teams.add(new Team("Bursaspor"));
        teams.add(new Team("Fenerbahçe"));
        teams.add(new Team("Beşiktaş"));
        teams.add(new Team("Başakşehir"));
        teams.add(new Team("Trabzonspor"));

        if (teams.size()%2==1){
            teams.add(new Team("Bay"));
        }


        Team home;
        Team away;
        int roundNum=teams.size()-1;
        int round=1;
        while (roundNum>0){
            teamsTemp.addAll(teams);
            Round rnd=new Round(round);
            while (teamsTemp.size()>0){
                int rndm= random.nextInt(teamsTemp.size());
                home=teamsTemp.get(rndm);
                teamsTemp.remove(home);
                rndm=random.nextInt(teamsTemp.size());
                away=teamsTemp.get(rndm);
                if (!home.rival.contains(teamsTemp.size())){
                    home.rival.add(away.getName());
                    teamsTemp.remove(away);
                    rnd.home.add(home.getName());
                    rnd.away.add(away.getName());
                }else {
                    rnd=new Round(round);
                    teamsTemp.clear();
                    teamsTemp.addAll(teams);
                }
            }
            roundNum--;
            round++;
            rounds.add(rnd);
        }
        for (Round r:rounds){
            System.out.println("Round " +(r.getNumber()+roundNum));
            for (int i=0;i<r.away.size();i++){
                System.out.println(r.home.get(i) + " vs " + r.away.get(i));
            }System.out.println();
        }

        for (Round r:rounds){
            System.out.println("Round " +(r.getNumber()+roundNum+5));
            for (int i=0;i<r.away.size();i++){
                System.out.println(r.away.get(i) + " vs " + r.home.get(i));
            }System.out.println();
        }

    }
}

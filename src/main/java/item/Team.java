package item;

import service.IOutPrint;
import service.OutPrint;

import java.util.ArrayList;

public class Team {

    private String[] arr;
    private ArrayList<Experements> team;
    private String teamname;
    private IOutPrint outPrint = new OutPrint();
    public Team(String teamname){
        this.team=new ArrayList<Experements>();
        this.teamname=teamname;
        this.outPrint=outPrint;
    }
    public void addExperements(Experements experements){
        team.add(experements);
    }
    public void getTeamInfo(){
        arr = new String[team.size()];
        for (int i=0;i<arr.length;i++){
            arr[i]=team.get(i).getInfo();
        }
        outPrint.print( "The team " + teamname + " состоит из: " + arr.length + " участников");
    }
    public void startCompetition(ArrayList<Obstacle> course){
        outPrint.print("Competition start!");
        for (Obstacle obstacle:course) {
            for (int i = 0; i < arr.length; i++) {
                if (team.get(i).getCondition())
                outPrint.print(team.get(i).getRunResult(obstacle.getRoadLength()));
                if (team.get(i).getCondition())
                outPrint.print(team.get(i).getJumpResult(obstacle.getWallHeight()));
            }
        }
    }
    public void getWinner(){
        for (Experements experements : team){
            if (experements.getCondition()) {
                outPrint.print("\nПобедитель в команде " + teamname + " " + experements.info + " поздралвяем!" );
            }
        }
    }

}

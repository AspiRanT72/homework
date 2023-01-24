package item;

import java.util.ArrayList;
public class GetObstacle {
    private ArrayList<Obstacle> getObtscle;
    public GetObstacle(){
        getObtscle=new ArrayList<Obstacle>();
    }
    public void getObstacleAdd(Obstacle obstacle){
        getObtscle.add(obstacle);
    }
    public ArrayList<Obstacle> getObstacle(){
        return getObtscle;
    }
}

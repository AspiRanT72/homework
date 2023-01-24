package item;

import models.Road;
import models.Wall;

public class Obstacle {
    private Wall wall;
    private Road road;
    public Obstacle(Wall wall, Road road){
        this.road=road;
        this.wall=wall;
    }
    public int getRoadLength(){

        return road.getLength();
    }
    public int getWallHeight(){

        return wall.getHeight();
    }
}

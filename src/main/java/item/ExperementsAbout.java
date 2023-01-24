package item;

import models.*;

public class ExperementsAbout {
    public static void main(String[] args) {
        Team team1 = new Team("Команда 1");
        team1.addExperements(new Human("Вася", 10, 2));
        team1.addExperements(new Cat("Барсик", 30, 1));
        team1.addExperements(new Robot("R2D2", 20, 10));
        GetObstacle course1 = new GetObstacle();
        course1.getObstacleAdd(new Obstacle(new Wall(1), new Road(10)));
        course1.getObstacleAdd(new Obstacle(new Wall(2), new Road(20)));
        course1.getObstacleAdd(new Obstacle(new Wall(3), new Road(30)));
        team1.getTeamInfo();
        team1.startCompetition(course1.getObstacle());
        team1.getWinner();
    }
}

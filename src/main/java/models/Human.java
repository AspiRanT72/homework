package models;


import item.Experements;

public class Human extends Experements {
    public static final String EXPERIMENT = "Человек";
    public static final String SUCCESS_RUN = "финишировал марафон на дистанцию";
    public static final String FAILURE_RUN = "выбывает из марафона на дистанцию";
    public static final String SUCCESS_JUMP = "перепрыгнул стену высотой";
    public static final String FAILURE_JUMP = "не смог перепрыгнуть стену высотой";
    public Human(String name, int maxdistance, int maxheight){
        super(maxdistance, maxheight);
        super.info = EXPERIMENT + " " + name;
        super.successRun = SUCCESS_RUN;
        super.failureRun = FAILURE_RUN;
        super.successJump = SUCCESS_JUMP;
        super.failureJump = FAILURE_JUMP;
    }
}

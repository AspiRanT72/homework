package models;

import item.Experements;

public class Robot extends Experements {
    public static final String EXPERIMENT = "Робот";
    public static final String SUCCESS_RUN = "финишировал марафон на дистанцию";
    public static final String FAILURE_RUN = "выбывает из марафона на дистанцию";
    public static final String SUCCESS_JUMP = "перелетел стену высотой";
    public static final String FAILURE_JUMP = "не смог перелететь стену высотой";

    public Robot(String name, int maxdistance, int maxheight) {
        super(maxdistance, maxheight);
        super.info = EXPERIMENT + " " + name;
        super.successRun = SUCCESS_RUN;
        super.failureRun = FAILURE_RUN;
        super.successJump = SUCCESS_JUMP;
        super.failureJump = FAILURE_JUMP;
    }
}

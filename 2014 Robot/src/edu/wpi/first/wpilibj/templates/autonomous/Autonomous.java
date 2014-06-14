package edu.wpi.first.wpilibj.templates.autonomous;

import edu.wpi.first.wpilibj.templates.IStep;
import edu.wpi.first.wpilibj.templates.autonomous.autoactions.*;

public class Autonomous implements IStep {

    public Autonomous() {

    }
    private Chain run;
    private boolean doneAllActs;

    public void init() {
        run = new Chain(new Action[]{
            //Put actions here
        });
        doneAllActs = false;
        run.init();
    }

    public void stop() {
        doneAllActs = true;
    }

    public void step() {
        if (!doneAllActs) {
            doneAllActs = run.doAct();
        }
    }
}

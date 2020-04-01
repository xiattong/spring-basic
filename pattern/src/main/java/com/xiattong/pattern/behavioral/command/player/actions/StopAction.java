package com.xiattong.pattern.behavioral.command.player.actions;

import com.xiattong.pattern.behavioral.command.player.GPlayer;
import com.xiattong.pattern.behavioral.command.player.IAction;

/**
 * Created by Tom.
 */
public class StopAction implements IAction {
    private GPlayer gplayer;

    public StopAction(GPlayer gplayer) {
        this.gplayer = gplayer;
    }

    public void execute() {
        gplayer.stop();
    }
}

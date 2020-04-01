package com.xiattong.pattern.behavioral.command.player.actions;

import com.xiattong.pattern.behavioral.command.player.GPlayer;
import com.xiattong.pattern.behavioral.command.player.IAction;

/**
 * Created by Tom.
 */
public class PlayAction implements IAction {
    private GPlayer gplayer;

    public PlayAction(GPlayer gplayer) {
        this.gplayer = gplayer;
    }

    public void execute() {
        gplayer.play();
    }
}

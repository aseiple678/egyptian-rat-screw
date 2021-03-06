package me.augusts.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import me.augusts.EgyptianRatScrew;

public class DesktopLauncher {
    public static void main(String[] arg) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        //Disable resizing of the window
        config.resizable = false;
        config.title = "Egyptian Rat Screw";
        //Starts application
        new LwjglApplication(new EgyptianRatScrew(), config);
    }
}

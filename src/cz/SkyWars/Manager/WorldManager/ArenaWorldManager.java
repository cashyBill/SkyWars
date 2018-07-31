package cz.SkyWars.Manager.WorldManager;

import cz.SkyWars.SkyWars;
import cz.SkyWars.Arena.SoloArena;
import cz.SkyWars.Manager.WorldManager.Functions.*;

import org.apache.commons.io.FileUtils;

import java.io.*;

public class ArenaWorldManager{

   public SoloArena arena;

    public ArenaWorldManager(SoloArena arena){
        this.arena = arena;
   }

    public void restartArena(String worldname){
        new RestartArenaWorld(this, worldname);
    }
	

}
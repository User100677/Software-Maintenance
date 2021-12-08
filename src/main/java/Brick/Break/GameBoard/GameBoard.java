/*
 *  Brick Destroy - A simple Arcade video game
 *   Copyright (C) 2017  Filippo Ranza
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package Brick.Break.GameBoard;


import Brick.Break.Brick.BrickController;
import Brick.Break.Debug.DebugConsole;

import Brick.Break.Wall.Wall;
import Brick.Break.Wall.WallController;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.font.FontRenderContext;



public class GameBoard{




    private static final int DEF_WIDTH = 600;
    private static final int DEF_HEIGHT = 450;

    private static final Color BG_COLOR = Color.WHITE;

    private Timer gameTimer;

    private WallController wallController;

    private String message;

    private boolean showPauseMenu;
    private PauseMenu pauseMenu;

    private DebugConsole debugController;
    private JFrame owner;


    public GameBoard(JFrame owner){
        super();
        this.owner = owner;


    }

    public static int getDefWidth(){
        return DEF_WIDTH;
    }
    public static int getDefHeight(){
        return DEF_HEIGHT;
    }
    public static Color getBackGroundColour(){
        return BG_COLOR;
    }
    public Timer getGameTimer(){
        return gameTimer;
    }
    public void setGameTimer(Timer gameTimer){
        this.gameTimer = gameTimer;
    }
    public WallController getWallController(){
        return wallController;
    }
    public void setWallController(WallController wallController){
        this.wallController = wallController;
    }
    public String getMessage(){
        return message;
    }
    public void setMessage(String message){
        this.message = message;
    }
    public boolean getShowPauseMenu(){
        return showPauseMenu;
    }
    public  void setShowPauseMenu(boolean showPauseMenu){
        this.showPauseMenu = showPauseMenu;
    }
    public PauseMenu getPauseMenu(){
        return pauseMenu;
    }
    public void setPauseMenu(PauseMenu pauseMenu){
        this.pauseMenu = pauseMenu;
    }
    public DebugConsole getDebugController(){
        return debugController;
    }
    public void setDebugController(DebugConsole debugController){
        this.debugController = debugController;
    }
    public JFrame getOwner(){
        return owner;
    }

}

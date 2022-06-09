package _06_frogger;
import com.apple.eawt.QuitHandler;
import com.apple.eawt.QuitResponse;

import java.awt.desktop.QuitEvent;

import com.apple.eawt.AppEvent;
import com.apple.eawt.Application;

import processing.core.PApplet;

public class Frogger extends PApplet {
    static final int WIDTH = 600;
    static final int HEIGHT = 400;
    private static int x;
    private static int y;
    
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {
    	background(55, 154, 219);
    	fill(82, 163, 83);
    	ellipse(x,y, 10,10);
    }
    
    public void keyPressed()
    {
        if(key == CODED){
            if(keyCode == UP)
            {
                y--;
            }
            else if(keyCode == DOWN)
            {
                y++;
            }
            else if(keyCode == RIGHT)
            {
                x++;
            }
            else if(keyCode == LEFT)
            {
                x--;
            }
        }
    }
   

    static public void main(String[] args) {
        PApplet.main(Frogger.class.getName());
    }

}

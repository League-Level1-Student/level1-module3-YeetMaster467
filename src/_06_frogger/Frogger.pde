static final int WIDTH = 600;
static final int HEIGHT = 400;
private static int x = 300;
private static int y = 200;
Car car1 = new Car(400, 300, 100, 50);
Car car2 = new Car(600, 600, 50, 100);

public void settings() {
  size(WIDTH, HEIGHT);
}


public void setup() {
  
}


public void draw() {
  background(55, 154, 219);
  car1.display();
  car2.display();
  car1.moveLeft();
  car1.display();
  
  fill(82, 163, 83);
  ellipse(x, y, 20, 20);
}

public void keyPressed()
{
  canvasTouch();
  if (key == CODED) {
    if (keyCode == UP)
    {
      y-=10;
    } else if (keyCode == DOWN)
    {
      y+=10;
    } else if (keyCode == RIGHT)
    {
      x+=10;
    } else if (keyCode == LEFT)
    {
      x-=10;
    }
  }
}
public void canvasTouch() {
  if (y < 0 ) {
    y+=10;
  }
  if (x < 0) {
    x+=10;
  }
  if ( y > HEIGHT) {
    y-=10;
  }
  if ( x > WIDTH) {
    x-=10;
  }
}

public class Car {
  private int x;
  private int y;
  private int size;
  private int speed;

  Car(int x, int y, int size, int speed) {
    this.x = x;
    this.y = y;
    this.size = size;
    this.speed = speed;
  }
  
  void moveLeft(){
    x-=speed;
    if(x < 0) {
      x = WIDTH;
    }
  }
  
  void moveRigt(){
    x+=speed;
    if(x > WIDTH) {
      x = 0;
    }
  }
  
  void display()
  {
    fill(0, 255, 0);
    rect(x, y, size, 50);
  }
}

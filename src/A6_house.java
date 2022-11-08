public class A6_house extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {
        plane.isTrail = true;
        plane.pausetime = 5;
//        plane.teleport(50,100);
//        house();
//        plane.teleport(200,100);
//        house();
//        plane.teleport(350,100);
//        house();
//        plane.teleport(500,100);
//        house();
//        plane.teleport(650,100);
//        house();
        for(int x=0;x<5;x++) {
            int a = (int) (Math.random()*3)+1;
            System.out.println(a);
            plane.teleport(15+(50*x),100);
            if(a == 1) {
                big();
            }
            if(a == 2) {
                square(20);
            }
            if(a == 3) {
                rectangle(35,15);
            }
        }
    }

    public void big() {
        plane.move(111);
        plane.turn(90);
        plane.move(111);
        plane.turn(90);
        plane.move(111);
        plane.turn(90);
        plane.move(111);
        plane.turn(90);
    }

    public void small() {
        plane.move(60);
        plane.turn(90);
        plane.move(60);
        plane.turn(90);
        plane.move(60);
        plane.turn(90);
        plane.move(60);
        plane.turn(90);
    }

    public void small(int a, int b) {
        plane.move(a);
        plane.turn(90);
        plane.move(b);
        plane.turn(90);
        plane.move(a);
        plane.turn(90);
        plane.move(b);
        plane.turn(90);


    }

    public void house() {
//        plane.isTrail = true;
//        plane.startingAngle(0);
//        square(50);
//        plane.isTrail = false;
//        plane.startingAngle(270);
//        plane.move(200);
//        plane.isTrail = true;
//        plane.pausetime = 0;
//        sun(20);
        plane.isTrail = true;
        plane.trailWidth = 5;
        plane.pausetime = 2;
        plane.setColor(200, 0, 0);
        plane.startingAngle(90);
        mySquare();
        myTriangle();
    }

    public void mySquare() {
        plane.startingAngle(90);
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.setColor(200, 0, 0);
        plane.move(100);
        plane.turn(90);
        plane.setColor(0, 200, 0);
        plane.move(100);
        plane.turn(90);
        plane.setColor(0, 0,200);
        plane.move(100);
        plane.turn(90);
        plane.setColor(100, 100,100);
        plane.move(100);
    }

    public void myTriangle () {
        plane.turn(-120);
        plane.setColor(100, 100,0);
        plane.move(100);
        plane.turn(-120);
        plane.setColor(100, 0,100);
        plane.move(100);
    }

    public void square(int a) {
        plane.move(a);
        plane.turn(90);
        plane.move(a);
        plane.turn(90);
        plane.move(a);
        plane.turn(90);
        plane.move(a);
        plane.turn(90);
    }

    public void equitriangle(int b) {
        plane.move(b);
        plane.turn(120);
        plane.move(b);
        plane.turn(120);
        plane.move(b);
        plane.turn(120);
    }

    public void rectangle(int a, int b) {
        plane.move(a);
        plane.turn(90);
        plane.move(b);
        plane.turn(90);
        plane.move(a);
        plane.turn(90);
        plane.move(b);
        plane.turn(90);
    }

    public void fillRec(int a, int b) {


    }

    public void tree(int a) {

    }

    public void sun(int a) {
        plane.setColor(255, 255, 0);
        plane.fillCircle(a);
    }

}


/*

Methods:
- fillCircle(int x)
   fillCircle() draws a filled circle with a radius size specified in the parameter.
   plane.fillCircle(10); draws a circle of radius 10 pixels.

- move(int x)
   move() moves the plane forward by the number of pixels specified in the parameter.
   plane.move(10); moves the plane forward 10 pixels.

- setColor(int r, int g, int b)
   setColor() sets the color of the plane's trail.
   plane.setColor(0, 0, 255); sets the color of the plane's trail to blue.

- startingAngle(int x)
   startingAngle() orients the plane at the angle specified in the parameter.
   plane.startingAngle(0); points the plane to the right.
   
- turn(int x)
   turn() rotates the plane left by the number of degrees specified in the parameter.
   plane.turn(50); will turn the plane left 50 degrees.

Attributes:
- boolean isTrail
   isTrail controls whether or not the plane should leave a trail. It can be true or false.
   plane.isTrail = true; causes the plane to leave a trail.
   
- int pausetime
   pausetime is used to speed up or slow down the plane. The default value is 5.
   plane.pausetime = 10; slows the plane down.
   
- int trailWidth
   trailWidth controls the width of the trail left by the plane.
   plane.trailWidth = 10; sets the width of the trail to 10.

*/


import javax.swing.text.Position;

public class Tank {
    int x;
    int i;
    int goForward = (i);
    int goBackward = (i);

    public Tank() {
        this(0);
    }

    public Tank(int x) {
        this.x = x;
    }

    public void goForward(int i) {

        x = x + i;
    }
        public void printPosition () {
            System.out.println("The Tank is at " + x + " now");
        }

        public void  flight(int x, int y){
            System.out.println("The tank is arraived to x,y");
        }
}

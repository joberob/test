public class Main {
    public static void main(String[] args) {
        Tank justTank = new Tank();
        Tank anywareTank = new Tank(15, 15);
        Tank customTank = new Tank(20, 30, 200);
        justTank.goForward(200);
        justTank.printPosition();
        anywareTank.goBackward(-201);
        anywareTank.printPosition();
        customTank.goForward(201);
        customTank.printPosition();
    }
}
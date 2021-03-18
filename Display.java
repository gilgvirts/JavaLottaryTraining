public class Display implements Runnable {
    int counter = 1;
    Ball ball;
    int prevBall = 0;
    public void printBall(){
        System.out.printf("ball #%o is %o" , counter++, ball.ballNumber);

    }
    @Override
    public void run() {
        if (counter <= 7) {
            if (ball != null) {
                if (prevBall != ball.ballNumber) {
                    printBall();
                    prevBall = ball.ballNumber;
                }
            }
        }
    }
}

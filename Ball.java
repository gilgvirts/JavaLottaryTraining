public class Ball {
    boolean isOut = false;
    int ballNumber;
    public Ball(int num){
        ballNumber = num;
    }
    public boolean is_available(){
        return !isOut;
    }
    public void get_ball(){
        isOut = true;
    }


}

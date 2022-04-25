package tdd;

public class AirConditioner {
    private boolean status;
    private int temp = 16;


    public void putOn(boolean status) {
        this.status = status;

    }

    public boolean getStatus() {
        return status;

    }

    public void increaseTemp(int pressUp) {
        if(temp >= 16 && temp <= 30){
            this.temp = temp + pressUp;
        }
        if(pressUp > 14){
            this.temp = 30;

        }

    }
    public void decreaseTemp(int pressDown){
        if(temp >= 16 && temp <= 30){
            this.temp = temp - pressDown;
        }
        if(pressDown > 14){
            this.temp = 16;

        }


    }




    public int getTemp() {
        return temp;

    }
}

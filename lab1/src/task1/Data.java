package task1;

public class Data {
    private double average;
    private double maximum;
    private int count;
    public Data(){
        this.average = 0;
        this.maximum = Integer.MIN_VALUE;
        this.count = 0;
    }

    public void addData(double num){
        average = average + num;
        if (num > maximum){
            maximum = num;
        }
        count++;
    }
    public double getAverage(){
        if (count > 0){
            return average / count;
        }else return 0;
    }
    public double getMaximum(){

        return maximum;
    }
}

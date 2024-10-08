package task3;

public class Temperature {
    private double temp;
    private char scale;

    public Temperature(){
        this.temp = 0.0;
        this.scale = 'C';
    }
    public Temperature(double temp){
        this.temp = temp;
        this.scale = 'C';
    }

    public Temperature(char scale){
        this.temp = 0;
        this.scale = scale;
    }
    public Temperature(double temp, char scale){
        this.temp = temp;
        this.scale = scale;
    }
    public double getCelsius(){
        if (scale == 'F'){
            return 5*(temp - 32) / 9;
        }
        return temp;
    }
    public double getFahrenheit(){
        if (scale == 'C'){
            return (9 * (temp / 5)) + 32;
        }
        return temp;
    }
    public void setTemp(double temperature){
        this.temp = temperature;
    }

    public void setScale(char scale) {
        if (scale == 'C' || scale == 'F') {
            this.scale = scale;
        } else {
            System.out.println("Invalid scale. Please enter 'C' for Celsius or 'F' for Fahrenheit.");
        }

    }
    public void setTempAndScale(double temp, char scale){
        this.temp = temp;
        if (scale == 'C' || scale == 'F') {
            this.scale = scale;
        } else {
            System.out.println("Invalid scale. Please enter 'C' for Celsius or 'F' for Fahrenheit.");
        }

    }
// t1.equals(t2)
    public boolean equals(Temperature temp){
        return  (temp.getCelsius() == this.getCelsius());

    }
    public String toString(){
        return "Celcius: " + getCelsius() + " and  Farhenheit: " + getFahrenheit();
    }
    public char getScale() {
        return scale;
    }
}

package task3;

public class TestTemperature {
    public static void main(String[] args){
        Temperature temp1 = new Temperature();
        System.out.println("Default Temperature in Celsius: " + temp1.getCelsius());
        System.out.println("Default Temperature in Fahrenheit: " + temp1.getFahrenheit());

        Temperature temp2 = new Temperature(100);
        System.out.println("Temperature in Celsius: " + temp2.getCelsius());
        System.out.println("Temperature in Fahrenheit: " + temp2.getFahrenheit());

        Temperature temp3 = new Temperature('F');
        temp3.setTemp(98.6);
        System.out.println("Temperature in Celsius: " + temp3.getCelsius());
        System.out.println("Temperature in Fahrenheit: " + temp3.getFahrenheit());

        Temperature temp4 = new Temperature(37, 'C');
        System.out.println("Temperature in Celsius: " + temp4.getCelsius());
        System.out.println("Temperature in Fahrenheit: " + temp4.getFahrenheit());

    }
}

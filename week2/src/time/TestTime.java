package time;

public class TestTime {
    public static void main(String[] args){
        Time t1 = new Time(13, 24, 30);

        Time t2 = new Time(3, 10, 5);
        t1.add(t2);
        System.out.println(t1.toStandard());
    }
}

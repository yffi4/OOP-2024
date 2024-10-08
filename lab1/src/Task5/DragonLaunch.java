package Task5;

import java.util.Vector;

public class DragonLaunch {
    private Vector<Person> persons;
    public DragonLaunch(){

    }
    public DragonLaunch(Vector<Person> persons){
        this.persons = persons;
    }
    public void kidnap(Person person){
        persons.add(person);
    }
    public boolean canEscape() {
        int count = 0;
        for (int i = 0; i < persons.size(); i++){
            if (count > 0 && persons.get(count - 1).getGender() ==Gender.G && persons.get(i).getGender() == Gender.B){
                count--;
            }else count++;
        }

        return count > 0;
    }

    public String toString(){
        if (canEscape()){
            return "Dragon will eating";
        }else {
            return "Dragon won't eating";
        }

    }
}

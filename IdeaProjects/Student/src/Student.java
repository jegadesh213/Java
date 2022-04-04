
public class Student {

    private String name;
    private int DateofBirth;
    private boolean hasSchooling;


    public String getName() {
        return name;
    }

    public void setName (String n){
        this.name = n;
    }
    public int getDateofBirth() {
        return DateofBirth;
    }

    public void setDateofBirth(int dateofBirth) {
        DateofBirth = dateofBirth;
    }

    public boolean getSchooling() {
        return hasSchooling;
    }

    public void setSchooling(boolean schooling) {
        hasSchooling = schooling;
    }
}

public class Student {
    private int Number;
    private String Gender;

    public Student(int number, String gender) {
        Number = number;
        Gender = gender;
    }

    public int getNumber() {
        return Number;
    }

    public void setNumber(int number) {
        Number = number;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }
}

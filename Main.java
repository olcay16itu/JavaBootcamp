public class Main {

    public static void main(String[] args) {
        /**
         Question 1 :
         */
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) System.out.println(i);
        }
        /**
         Question 2 :
         */
        String[] list = {"Murat", "Ahmet", "Mehmet"};
        int counter = 0;
        for (String a : list) {
            counter++;
            System.out.println(counter + ". " + a);
        }
        /**
         Question3:
         */
        Student[] list1 = new Student[10];
        for (int i = 1; i <= 10; i++) {
            Student student = new Student(i, "Female");
            list1[i - 1] = student;
        }
        for (Student a : list1) {
            System.out.println("Gender :" + a.getGender() + " Number : " + a.getNumber());
        }
        /**
         Question4:
         */
        Sinema sinema = new Sinema();
        sinema.buyticket(18, "Korku");


    }
}


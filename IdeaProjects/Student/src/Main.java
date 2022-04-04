public class Main {

    public static void main(String[] args) {

        Student student = new Student();
        student.setName("Jegan");
        student.setDateofBirth(8.12.2002);
        student.setSchooling(true);

        System.out.println("NAME:" + student.getName());
        System.out.println("DoB:" + student.getDateofBirth());
        System.out.println("SCHOOLING:"+student.getSchooling());

    }
}

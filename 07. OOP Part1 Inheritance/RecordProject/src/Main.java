public class Main {

    public static void main(String[] args) {

        for(int i = 1; i <= 5; i++) {
            //Student s = new Student
            LPAStudent s = new LPAStudent("S92300" + i,
                    switch (i) {
                case 1 -> "Mary";
                case 2 -> "Carol";
                case 3 -> "Tim";
                case 4 -> "Harry";
                case 5 -> "Lisa";
                default -> "Anonymous";
                    },
                    "05/11/1985",
                    "Java MasterClass");
            System.out.println(s);
        }


        System.out.println();
        Student pojoStudent = new Student("S923006", "Ann", "05/11/1985", "Java MasterClass");
        LPAStudent recordStudent = new LPAStudent("S923007", "Bill", "05/11/1985", "Java MasterClass");
        System.out.println(pojoStudent);
        System.out.println();
        System.out.println(recordStudent);
        System.out.println();

        pojoStudent.setClassList(pojoStudent.getClassList()  + ", Jav OCP Exam 829");
        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
        System.out.println();
        System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());
    }
}

package asue;

public class Main {
    public static void main(String[] args) {
        University asue = new University("asue");

        Faculty audit = new Faculty("audit");
        Faculty finance = new Faculty("finance");
        Faculty[] facultyList = {audit, finance};

        Group group1 = new Group("group1");
        Group group2 = new Group("group2");
        Group[] groupList = {group1, group2};

        Student student1 = new Student("P", "P");
        Student student2 = new Student("S", "S");
        Student student3 = new Student("G", "G");
        Student student4 = new Student("Y", "Y");
        Student[] studentList1 = {student1, student2};
        Student[] studentList2 = {student3, student4};

        Subject maths = new Subject("Maths");
        Subject analyse = new Subject("Analyse");
        Subject[] subjectList = {maths, analyse};

        group1.setStudents(studentList1);
        group1.setSubjects(subjectList);

        group2.setStudents(studentList2);
        group2.setSubjects(subjectList);

        audit.setGroups(groupList);
        asue.setFaculties(facultyList);

        group1.setMark("P", "Maths", 5);
        group1.setMark("P", "Analyse", 3);
        group1.setMark("S", "Maths", 6);
        group1.setMark("S", "Analyse", 10);

        group2.setMark("G", "Maths", 1);
        group2.setMark("G", "Analyse", 4);
        group2.setMark("Y", "Maths", 7);
        group2.setMark("Y", "Analyse", 9);

        // ex 1
        System.out.println(group1.getStudentAverageMark("P"));
        System.out.println(group1.getSubjectAverageMark("Maths"));

        // ex2
        System.out.println(audit.getSubjectAverageMarkByGroup("group1", "Maths"));
        System.out.println(audit.getSubjectAverageMarkByFaculty("Maths"));
//        group1.getSubjectAverageMark("Maths");

        // ex3
        System.out.println(asue.getFacultyAverageMarkBySubject("audit","Maths"));
        System.out.println(audit.getSubjectAverageMarkByFaculty("Maths"));

        // ex4
//        asue.getSubjectAverageMarkByUniversity("Maths");
    }

}

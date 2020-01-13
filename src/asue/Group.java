package asue;

public class Group {
    private String groupName;
    private Student students[];
    private Subject subjects[];
    private int[][] marks;


    public Group(String name) {
        groupName = name;
    }

    public void setStudents(Student[] students) {
        this.students = students;

        marks = new int[students.length][];
    }

    public void setSubjects(Subject[] subjects) {
        this.subjects = subjects;

        marks = new int[students.length][subjects.length];
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    public Student[] getStudents() {
        return students;
    }

    private int getStudentIndex(String sName) {
        for (int i=0; i < students.length; i++) {
            if(students[i].getFirstName() == sName) {
                return i;
            }
        }

        return -1;
    }

    private int getSubjectIndex(String sName) {
        for (int i=0; i < subjects.length; i++) {
            if(subjects[i].getSubjectName() == sName) {
                return i;
            }
        }

        return -1;
    }

    public void setMark(String studentFName, String subjectName, int mark) {
//        if(mark < 0 || mark > 10) {
//            throw new IllegalArgumentException();
//        }

        int studentIndex = getStudentIndex(studentFName);
        int subjectIndex = getSubjectIndex(subjectName);

        if (studentIndex >= 0 && subjectIndex >= 0) {
            marks[studentIndex][subjectIndex] = mark;
        }
    }

    public float getStudentAverageMark(String studentFName) {
        int studentIndex = getStudentIndex(studentFName);

        if(studentIndex >= 0) {
            float sum = 0f;
            for (int i = 0; i < marks[studentIndex].length; i++) {
                sum += marks[studentIndex][i];
            }

            return sum / marks[studentIndex].length;
        }

        return -1;
    }

    public float getSubjectAverageMark(String subjectName) {
        int subjectIndex = getSubjectIndex(subjectName);

        if(subjectIndex >= 0) {
            float sum = 0f;
            for (int i = 0; i < marks.length; i++) {
                sum += marks[i][subjectIndex];
            }

            return  sum / marks.length;
        }

        return -1;
    }
}

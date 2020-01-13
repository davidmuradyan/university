package asue;

public class University {
    private Faculty faculties[];
    private String universityName;

    public University(String name) {
        universityName = name;
    }

    public void setFaculties(Faculty[] faculties) {
        this.faculties = faculties;
    }

    public Faculty[] getFaculties() {
        return faculties;
    }

    public String getUniversityName() {
        return universityName;
    }

    public int getFacultyIndex(String facultyName) {
        for (int i = 0; i < faculties.length; i++) {
            if (faculties[i].getFacultyName() == facultyName) {
                return i;
            }
        }
        return -1;
    }

    public float getFacultyAverageMarkBySubject(String facultyName, String subjectName) {
        int facultyIndex = getFacultyIndex(facultyName);
        if (facultyIndex >= 0) {
            return faculties[facultyIndex].getSubjectAverageMarkByFaculty(subjectName);
        }
        return -1;
    }

    public float getSubjectAverageMarkByUniversity(String subjectName) {
        float sum = 0;
        int count = 0;

        for (int i = 0; i < faculties.length; i++) {
            float mark = getFacultyAverageMarkBySubject(faculties[i].getFacultyName(), subjectName);
            if (mark > 0) {
                sum += mark;
                count++;
            }
        }

        if(count == 0) {
//            throw new IllegalArgumentException();
            return -1;
        }

        return sum / count;
    }
}

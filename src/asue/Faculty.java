package asue;

public class Faculty {
    private Group groups[];
    private String facultyName;

    public Faculty(String name) {
        facultyName = name;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }

    public Group[] getGroups() {
        return groups;
    }

    private int getGroupIndex(String groupName) {
        for (int i = 0; i < groups.length; i++) {
            if (groups[i].getGroupName() == groupName) {
                return i;
            }
        }

        return -1;
    }

    public float getSubjectAverageMarkByGroup(String groupName, String subjectName) {
        int groupIndex = getGroupIndex(groupName);

        if (groupIndex >= 0) {
            return groups[groupIndex].getSubjectAverageMark(subjectName);
        }

        return -1;
    }

    public float getSubjectAverageMarkByFaculty(String subjectName) {
        float sum = 0;
        int count = 0;

        for (int i = 0; i < groups.length; i++) {
            float mark = getSubjectAverageMarkByGroup(groups[i].getGroupName(), subjectName);
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

package task1;
import java.util.*;

public class Students {
    Integer number;
    Map<String, Map<String, List<Byte>>> students = new HashMap<String, Map<String, List<Byte>>>();

    public Students(Integer number) {
        this.number = number;
    }
    public String getValue() {
        return number.toString() + ": " + students;
    }
    void addStudent(String name) {
        Map<String, List<Byte>> grades = new HashMap<>();
        students.put(name, grades);
    }
    void removeStudent(String name) {
        students.remove(name);
    }
    public void addSubject(String subject) {
        for (String name : students.keySet()) {
            students.get(name).put(subject, new ArrayList<>());
        }
    }
    public void removeSubject(String subject) {
        for (String name : students.keySet()) {
            students.get(name).remove(subject);
        }
    }
    void addGrade(String name, String subject, Byte grade) {
        students.get(name).get(subject).add(grade);
    }
    void removeGrade(String subject, String name, Integer index) {
        students.get(name).get(subject).remove(index);
    }
    void changeGrade(String name, String subject, Integer index, Byte grade) {
        students.get(name).get(subject).set(index, grade);
    }
}

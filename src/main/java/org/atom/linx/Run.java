package org.atom.linx;
import org.atom.linx.data.*;

public class Run {
    public static void main(String[] args) {
        for (User u : CourseManager.listStudents(80548)) {
            System.out.println(u.toString());
        }
    }
}

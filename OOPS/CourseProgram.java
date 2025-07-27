package OOPS;

import java.util.Arrays;
import java.util.Scanner;

public class CourseProgram {

    public static int findAvgOfQuizByAdmin(Course[] courses, String value) {
        int num = 0;
        int total = 0;
        for (Course course: courses) {
            if (course.getCourseAdmin().equalsIgnoreCase(value)) {
                total += course.getQuiz();
                num++;
            }
        }
        if (num > 0)
            return total / num;

        return 0;
    }

    public static String[] sortCourseByHandsOn (Course[] courses, int value) {

        String [] filteredCourse = new String[0];

        for (Course course: courses) {
            if (course.getHandsOn() < value) {
                filteredCourse = Arrays.copyOf(filteredCourse, filteredCourse.length + 1);
                filteredCourse[filteredCourse.length - 1] = course.getCourseName();
            }
        }

        if (filteredCourse.length > 0) {
//            Arrays.sort(filteredCourse, (a, b) -> a.compareToIgnoreCase(b));
//            Arrays.sort(filteredCourse, String::compareToIgnoreCase);
            Arrays.sort(filteredCourse);
            return filteredCourse;
        }
        return null;
    }

    public static void main(String[] args) {
        int courseId, quiz,handsOn;
        String courseName, courseAdmin;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of courses: ");
        int n = input.nextInt();

        Course[] courses = new Course[n];

        for (int i = 0; i < n; i++) {
            courseId = input.nextInt();
            courseName = input.next();
            courseAdmin = input.next();
            quiz = input.nextInt();
            handsOn = input.nextInt();
            courses[i] = new Course(courseId, courseName, courseAdmin, quiz, handsOn);
        }

        String requiredAdmin = input.next();
        int requiredHandsOn = input.nextInt();

        int avgQuiz = findAvgOfQuizByAdmin(courses, requiredAdmin);
        if (avgQuiz > 0)
            System.out.println("Average quiz score for admin " + requiredAdmin + " is: " + avgQuiz);
        else
            System.out.println("No courses found for admin " + requiredAdmin);

        String[] filteredCourses = sortCourseByHandsOn(courses, requiredHandsOn);
        if (filteredCourses != null && filteredCourses.length > 0)
            System.out.println("Courses with hands-on less than " + requiredHandsOn + ": " + Arrays.toString(filteredCourses));
        else
            System.out.println("No courses found with hands-on less than " + requiredHandsOn);

    }
}

/*
111
kubernetes
Nisha
40
10
321
cassandra
Roshini
30
15
457
Apache
Nisha
30
12
987
site
Tirth
50
20

Nisha
17

Shubhamk
5

 */

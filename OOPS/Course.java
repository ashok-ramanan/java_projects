package OOPS;

public class Course {
    private int courseId;
    private String courseName;
    private String courseAdmin;
    private int quiz;
    private int handsOn;

    public Course(int courseId, String courseName, String courseAdmin, int quiz, int handsOn) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseAdmin = courseAdmin;
        this.quiz = quiz;
        this.handsOn = handsOn;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseAdmin() {
        return courseAdmin;
    }

    public void setCourseAdmin(String courseAdmin) {
        this.courseAdmin = courseAdmin;
    }

    public int getQuiz() {
        return quiz;
    }

    public void setQuiz(int quiz) {
        this.quiz = quiz;
    }

    public int getHandsOn() {
        return handsOn;
    }

    public void setHandsOn(int handsOn) {
        this.handsOn = handsOn;
    }
}
/*
111
Kubernetes
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

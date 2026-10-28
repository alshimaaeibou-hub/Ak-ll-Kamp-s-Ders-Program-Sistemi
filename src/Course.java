public class Course {public class Course {
    private String courseCode;
    private String title;
    private int credit;
    private String type; // e.g., Mandatory or Elective

    public Course(String courseCode, String title, int credit, String type) {
        this.courseCode = courseCode;
        this.title = title;
        this.credit = credit;
        this.type = type;
    }

    public String getCourseCode() { return courseCode; }
    public String getTitle() { return title; }
    public int getCredit() { return credit; }
    public String getType() { return type; }

    @Override
    public String toString() {
        return courseCode + ": " + title + " (" + credit + " Credits, " + type + ")";
    }
}


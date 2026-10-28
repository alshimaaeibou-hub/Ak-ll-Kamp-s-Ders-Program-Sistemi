public class CourseFactory {
    public static Course createCourse(String type, String code, String title, int credit) {
        if ("Mandatory".equalsIgnoreCase(type)) {
            return new Course(code, title, credit, "Mandatory");
        } else if ("Elective".equalsIgnoreCase(type)) {
            return new Course(code, title, credit, "Elective");
        }
        return new Course(code, title, credit, "General");
    }
}
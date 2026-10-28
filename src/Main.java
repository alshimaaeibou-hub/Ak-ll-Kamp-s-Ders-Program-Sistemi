public class Main {
    public static void main(String[] args) {
        System.out.println("=== Akıllı Kampüs Ders Programı Sistemi ===");

        ScheduleManager manager = ScheduleManager.getInstance();

        // Create Courses using Factory pattern
        Course c1 = CourseFactory.createCourse("Mandatory", "CS101", "Introduction to Java", 4);
        Course c2 = CourseFactory.createCourse("Elective", "ART201", "Digital Arts", 2);

        manager.addCourse(c1);
        manager.addCourse(c2);

        System.out.println("\nScheduled Courses:");
        for (Course c : manager.getScheduledCourses()) {
            System.out.println("- " + c);
        }

        // Save data to file
        DataManager.saveData(manager.getScheduledCourses());
    }
}
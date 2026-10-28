
public class SmartCampusTest {
    public static void main(String[] args) {
        int passed = 0;
        int failed = 0;

        // Test 1: Course creation
        Course c = new Course("CS101", "OOP", 3, "Mandatory");
        if ("CS101".equals(c.getCourseCode())) passed++; else failed++;

        // Test 2: CourseFactory Mandatory
        Course cMandatory = CourseFactory.createCourse("Mandatory", "MATH101", "Calculus", 4);
        if ("Mandatory".equals(cMandatory.getType())) passed++; else failed++;

        // Test 3: CourseFactory Elective
        Course cElective = CourseFactory.createCourse("Elective", "HIST101", "History", 2);
        if ("Elective".equals(cElective.getType())) passed++; else failed++;

        // Test 4: Singleton Instance Test
        ScheduleManager sm1 = ScheduleManager.getInstance();
        ScheduleManager sm2 = ScheduleManager.getInstance();
        if (sm1 == sm2) passed++; else failed++;

        // Test 5: Add Course to ScheduleManager
        sm1.clearSchedule();
        sm1.addCourse(c);
        if (sm1.getScheduledCourses().size() == 1) passed++; else failed++;

        // Test 6: Classroom details
        Classroom room = new Classroom("Lab 102", 40);
        if (room.getCapacity() == 40) passed++; else failed++;

        // Test 7: Instructor details
        Instructor inst = new Instructor("INS01", "Ahmet", "Computer Eng");
        if ("INS01".equals(inst.getId())) passed++; else failed++;

        // Test 8: Schedule Clear
        sm1.clearSchedule();
        if (sm1.getScheduledCourses().isEmpty()) passed++; else failed++;

        System.out.println("=== UNIT TESTS RESULTS ===");
        System.out.println("Passed: " + passed + " / 8");
        System.out.println("Failed: " + failed);
    }
}
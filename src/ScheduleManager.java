
import java.util.ArrayList;
import java.util.List;

public class ScheduleManager {
    private static ScheduleManager instance;
    private List<Course> scheduledCourses;

    private ScheduleManager() {
        scheduledCourses = new ArrayList<>();
    }

    public static ScheduleManager getInstance() {
        if (instance == null) {
            instance = new ScheduleManager();
        }
        return instance;
    }

    public boolean addCourse(Course course) {
        if (course != null) {
            scheduledCourses.add(course);
            return true;
        }
        return false;
    }

    public List<Course> getScheduledCourses() {
        return scheduledCourses;
    }

    public void clearSchedule() {
        scheduledCourses.clear();
    }
}
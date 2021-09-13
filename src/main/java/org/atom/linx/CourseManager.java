package org.atom.linx;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.atom.linx.data.*;
import java.util.ArrayList;
import java.util.List;
public class CourseManager {
    public static Course[] listCourses() {
        String r = APIManager.GET("/api/v1/courses", new RequestMap());
        Course[] courses = new Gson().fromJson(r, Course[].class);
        List<Course> result = new ArrayList<>();
        for (Course c : courses) {
            if (c.getUuid() != null) {
                result.add(c);
            }
        }
        return result.toArray(new Course[result.size() - 1]);
    }

    public static Course[] listCourses(String user_id) {
        String r = APIManager.GET("/api/v1/" + user_id + "/courses", new RequestMap());
        Course[] courses = new Gson().fromJson(r, Course[].class);
        List<Course> result = new ArrayList<>();
        for (Course c : courses) {
            if (c.getUuid() != null) {
                result.add(c);
            }
        }
        return result.toArray(new Course[result.size() - 1]);
    }

    public static CourseProgress getCourseProgress(int course_id) {
        String r = APIManager.GET("/api/v1/courses/" + course_id + "/users/self/progress", new RequestMap());
        return new Gson().fromJson(r, CourseProgress.class);
    }

    public static CourseProgress getCourseProgress(int course_id, int user_id) {
        String r = APIManager.GET("/api/v1/courses/" + course_id + "/users/" + user_id + "/progress", new RequestMap());
        return new Gson().fromJson(r, CourseProgress.class);
    }

    //TODO POST /api/v1/accounts/:account_id/courses
    //TODO POST /api/v1/courses/:course_id/files

    public static User[] listStudents(int course_id) {
        String r = APIManager.GET("/api/v1/courses/" + course_id + "/students", new RequestMap());
        return new Gson().fromJson(r, User[].class);
    }

    public static User[] listUsers(int course_id) {
        String r = APIManager.GET("/api/v1/courses/" + course_id + "/users", new RequestMap());
        return new Gson().fromJson(r, User[].class);
    }

    public static User[] listUsers(int course_id, RequestMap query) {
        String r = APIManager.GET("/api/v1/courses/" + course_id + "/users", query);
        return new Gson().fromJson(r, User[].class);
    }

    public static User[] listRecentStudents(int course_id) {
        String r = APIManager.GET("/api/v1/courses/" + course_id + "/recent_students", new RequestMap());
        return new Gson().fromJson(r, User[].class);
    }

    public static User getUser(int course_id, int user_id) {
        String r = APIManager.GET("/api/v1/courses/" + course_id + "/users/" + user_id, new RequestMap());
        return new Gson().fromJson(r, User.class);
    }

    public static User[] listContentShareUsers(int course_id, RequestMap query) {
        String r = APIManager.GET("/api/v1/courses/" + course_id + "/content_share_users", query);
        return new Gson().fromJson(r, User[].class);
    }

    //TODO POST /api/v1/courses/:course_id/preview_html

    public static JsonObject[] getCourseActivityStream(int course_id) {
        String r = APIManager.GET("/api/v1/courses/" + course_id + "/activity_stream", new RequestMap());
        return new Gson().fromJson(r, JsonObject[].class);
    }

    public static JsonObject[] getCourseActivityStreamSummary(int course_id) {
        String r = APIManager.GET("/api/v1/courses/" + course_id + "/activity_stream/summary", new RequestMap());
        return new Gson().fromJson(r, JsonObject[].class);
    }

    public static JsonObject[] getCourseTODOItems(int course_id) {
        String r = APIManager.GET("/api/v1/courses/" + course_id + "/todo", new RequestMap());
        return new Gson().fromJson(r, JsonObject[].class);
    }

    //TODO DELETE /api/v1/courses/:id
    //TODO PUT /api/v1/courses/:course_id/settings

    public static User getTestStudent(int course_id) {
        String r = APIManager.GET("/api/v1/courses/" + course_id + "/student_view_student", new RequestMap());
        return new Gson().fromJson(r, User.class);
    }

    public static Course getCourse(int course_id) {
        String r = APIManager.GET("/api/v1/courses/" + course_id, new RequestMap());
        return new Gson().fromJson(r, Course.class);
    }

    //TODO PUT /api/v1/courses/:id
    //TODO PUT /api/v1/accounts/:account_id/courses
    //TODO POST /api/v1/courses/:course_id/reset_content

    public static Permissions getPermissions(int course_id) {
        String r = APIManager.GET("/api/v1/courses/" + course_id + "/permissions", new RequestMap());
        return new Gson().fromJson(r, Permissions.class);
    }

    public static JsonObject[] getBulkUserProgress(int course_id) {
        String r = APIManager.GET("/api/v1/courses/" + course_id + "/bulk_user_progress", new RequestMap());
        return new Gson().fromJson(r, JsonObject[].class);
    }

    public static JsonObject getCourseCopyStatus(int course_id, int id) {
        String r = APIManager.GET("/api/v1/courses/" + course_id + "/course_copy/" + id, new RequestMap());
        return new Gson().fromJson(r, JsonObject.class);
    }

    //TODO POST /api/v1/courses/:course_id/course_copy
}
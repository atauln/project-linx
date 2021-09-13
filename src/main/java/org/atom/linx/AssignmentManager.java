package org.atom.linx;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.atom.linx.data.Assignment;
import org.atom.linx.data.AssignmentOverride;

public class AssignmentManager {
    //TODO DELETE /api/v1/courses/:course_id/assignments/:id

    public static Assignment[] listAssignments(int course_id) {
        String r = APIManager.GET("/api/v1/course/" + course_id + "/assignments", new RequestMap());
        return new Gson().fromJson(r, Assignment[].class);
    }
    public static Assignment[] listAssignments(int course_id, RequestMap query) {
        String r = APIManager.GET("/api/v1/course/" + course_id + "/assignments", query);
        return new Gson().fromJson(r, Assignment[].class);
    }
    public static Assignment[] listAssignments(int course_id, int assignment_group_id) {
        String r = APIManager.GET("/api/v1/course/" + course_id + "/assignment_groups/" + assignment_group_id + "/assignments", new RequestMap());
        return new Gson().fromJson(r, Assignment[].class);
    }
    public static Assignment[] listAssignments(int course_id, int assignment_group_id, RequestMap query) {
        String r = APIManager.GET("/api/v1/course/" + course_id + "/assignment_groups/" + assignment_group_id + "/assignments", query);
        return new Gson().fromJson(r, Assignment[].class);
    }
    public static Assignment[] listUserAssignments(int user_id, int course_id) {
        String r = APIManager.GET("/api/v1/users/" + user_id + "/courses/" + course_id + "/assignments", new RequestMap());
        return new Gson().fromJson(r, Assignment[].class);
    }
    public static Assignment[] listUserAssignments(int user_id, int course_id, RequestMap query) {
        String r = APIManager.GET("/api/v1/users/" + user_id + "/courses/" + course_id + "/assignments", query);
        return new Gson().fromJson(r, Assignment[].class);
    }
    //TODO POST /api/v1/courses/:course_id/assignments/:assignment_id/duplicate

    public static Assignment getAssignment(int course_id, int assignment_id) {
        String r = APIManager.GET("/api/v1/courses/" + course_id + "/assignments/" + assignment_id, new RequestMap());
        return new Gson().fromJson(r, Assignment.class);
    }
    public static Assignment getAssignment(int course_id, int assignment_id, RequestMap query) {
        String r = APIManager.GET("/api/v1/courses/" + course_id + "/assignments/" + assignment_id, query);
        return new Gson().fromJson(r, Assignment.class);
    }
    //TODO POST /api/v1/courses/:course_id/assignments
    //TODO PUT /api/v1/courses/:course_id/assignments/:id
    //TODO PUT /api/v1/courses/:course_id/assignments/bulk_update
    //TODO POST /api/v1/courses/:course_id/assignments/:assignment_id/overrides
    //TODO PUT /api/v1/courses/:course_id/assignments/:assignment_id/overrides/:id
    //TODO DELETE /api/v1/courses/:course_id/assignments/:assignment_id/overrides/:id

    public static AssignmentOverride[] listAssignmentOverrides(int course_id, int assignment_id) {
        String r = APIManager.GET("/api/v1/courses/" + course_id + "/assignments/" + assignment_id + "/overrides", new RequestMap());
        return new Gson().fromJson(r, AssignmentOverride[].class);
    }

    public static AssignmentOverride getAssignmentOverride(int course_id, int assignment_id, int override_id) {
        String r = APIManager.GET("/api/v1/courses/" + course_id + "/assignments/" + assignment_id + "/overrides/" + override_id, new RequestMap());
        return new Gson().fromJson(r, AssignmentOverride.class);
    }

    public static JsonObject getRedirectGroupOverride(int group_id, int assignment_id) {
        String r = APIManager.GET("/api/v1/groups/" + group_id + "/assignments/" + assignment_id + "/override", new RequestMap());
        return new Gson().fromJson(r, JsonObject.class);
    }

    public static JsonObject getRedirectSectionOverride(int course_section_id, int assignment_id) {
        String r = APIManager.GET("/api/v1/sections/" + course_section_id + "/assignments/" + assignment_id + "/override", new RequestMap());
        return new Gson().fromJson(r, JsonObject.class);
    }

    //TODO POST /api/v1/courses/:course_id/assignments/:assignment_id/overrides
    //TODO PUT /api/v1/courses/:course_id/assignments/:assignment_id/overrides/:id
    //TODO DELETE /api/v1/courses/:course_id/assignments/:assignment_id/overrides/:id

    public static AssignmentOverride[] batchRetrieveOverrides(int course_id) {
        String r = APIManager.GET("/api/v1/courses/" + course_id + "/assignments/overrides", new RequestMap());
        return new Gson().fromJson(r, AssignmentOverride[].class);
    }

    //TODO POST /api/v1/courses/:course_id/assignments/overrides
    //TODO PUT /api/v1/courses/:course_id/assignments/overrides
}

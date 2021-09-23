package org.atom.linx;

import com.google.gson.Gson;

public abstract class DataMasterclass {
    public String toJSONString(){
        return new Gson().toJson(this);
    }
    public abstract String getStudentSummary();
    public abstract String getTeacherSummary();  //untestable
    public abstract String getAdminSummary();  //untestable
}

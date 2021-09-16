package org.atom.linx.data;

class Data {
    private int active_tab;

    public int getActiveTab() {
        return active_tab;
    }

    public void setActiveTab(int active_tab) {
        this.active_tab = active_tab;
    }
}

public class Bookmark {
    private int id;
    private String name;
    private String url;
    private int position;
    private Data data;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}

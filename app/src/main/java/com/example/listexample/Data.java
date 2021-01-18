package com.example.listexample;

public class Data {

    int Category;
    String Title;
    String Content;

    public Data(int category, String title, String content) {
        Category = category;
        Title = title;
        Content = content;
    }

    public int getCategory() {
        return Category;
    }

    public void setCategory(int category) {
        Category = category;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }
}

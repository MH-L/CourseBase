package com.example.CourseFinder.model;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by Minghao on 10/7/2015.
 */
public class Subject {
    private List<Course> courseList;
    private List<Member> subscribers;

    public Subject(List<Course> courseList) {
        this.courseList = courseList;
        this.subscribers = new ArrayList<Member>();
    }
}

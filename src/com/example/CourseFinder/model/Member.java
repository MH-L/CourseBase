package com.example.CourseFinder.model;

import java.sql.Time;

/**
 * Created by Minghao on 10/7/2015.
 */
public class Member {
    private Time joinedTime;
    private boolean isVIP;
    private double accountBalance;

    public Member(Time joinedTime) {
        this.isVIP = false;
        this.accountBalance = 0;
        this.joinedTime = joinedTime;
    }
}

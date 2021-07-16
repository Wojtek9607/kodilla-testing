package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int userID;
    private final String username;
    private final char sex;
    private final LocalDate birthdate;
    private final int postCount;


    public ForumUser(final int userID, final String username,
                     final char sex, final int year, final int month, final int day,
                     final int postCount) {
        this.userID = userID;
        this.username = username;
        this.sex = sex;
        this.birthdate = LocalDate.of(year, month, day);
        this.postCount = postCount;
    }

    public int getUserID() {
        return userID;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public int getPostCount() {
        return postCount;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID=" + userID +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", birthdate=" + birthdate +
                ", postCount=" + postCount +
                '}';
    }
}
package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> forumUsersList = new ArrayList<>();

    public Forum () {
        forumUsersList.add(new ForumUser(1, "Nick", 'M',1992, 10,  11, 25));
        forumUsersList.add(new ForumUser(2, "Barbara", 'F',2009, 12,  21, 5));
        forumUsersList.add(new ForumUser(3, "Harry", 'M',1992, 6,  6, 97));
        forumUsersList.add(new ForumUser(4, "Ivy", 'F',2000, 9,  28, 207));
        forumUsersList.add(new ForumUser(5, "Hannah", 'F',2004, 4,  25, 78));
        forumUsersList.add(new ForumUser(6, "James", 'M',2003, 7,  25, 8));
        forumUsersList.add(new ForumUser(7, "Cindy", 'F',2002, 4,  16, 2));
        forumUsersList.add(new ForumUser(8, "Camila", 'F',1999, 2,  21, 58));
        forumUsersList.add(new ForumUser(9, "George", 'M',1996, 5,  13, 0));
        forumUsersList.add(new ForumUser(10, "Connor", 'M',1993, 12,  16, 2));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<ForumUser>(forumUsersList);
    }
}

package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import java.util.Map;
import java.util.function.Function;
import static java.util.stream.Collectors.toMap;

public class StreamMain {

    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer, ForumUser> forumUsers = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getBirthdate().getYear() < 2000)
                .filter(forumUser -> forumUser.getPostCount() > 0)
                .collect(toMap(ForumUser::getUserID, Function.identity()));
        for (Map.Entry<Integer, ForumUser> entry : forumUsers.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}
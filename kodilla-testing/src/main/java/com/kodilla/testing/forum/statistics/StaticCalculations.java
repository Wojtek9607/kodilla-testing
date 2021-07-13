package com.kodilla.testing.forum.statistics;

public class StaticCalculations {
    int userCount;
    int postsCount;
    int commentsCount;
    double postsUserRatio;
    double commentsUserRatio;
    double commentsPostsRatio;

    public void calculateAdvStatistics(Statistics statistics){
        userCount = statistics.usersNames().size();
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();
        if (userCount != 0) {
            postsUserRatio = (double)postsCount/(double)userCount;
        } else {
            postsUserRatio = 0;
        }

        if (userCount != 0) {
            commentsUserRatio = (double)commentsCount/(double)userCount;
        } else {
            commentsUserRatio = 0;
        }

        if (postsCount != 0) {
            commentsPostsRatio = (double)commentsCount/(double)postsCount;
        } else {
            commentsPostsRatio = 0;
        }
    }

    public int getUserCount() {
        return userCount;
    }

    public double getPostsUserRatio() {
        return postsUserRatio;
    }

    public double getCommentsUserRatio() {
        return commentsUserRatio;
    }

    public double getCommentsPostsRatio() {
        return commentsPostsRatio;
    }

    public int getPostsCount() {
        return postsCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public void showStatistics(){
        System.out.println("Currently we have " + userCount + " users registered.");
        System.out.println("Users have written " + postsCount + " posts so far.");
        System.out.println("Users have written " + commentsCount + " comments so far.");
        System.out.println("The average user has written " + postsUserRatio + " posts.");
        System.out.println("The average user has written " + commentsUserRatio + " comments.");
        System.out.println("On average each post had been commented " + commentsPostsRatio + " times.");
    }
}

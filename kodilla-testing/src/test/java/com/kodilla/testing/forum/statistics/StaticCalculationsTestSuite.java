package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.ArrayList;
import java.util.List;
import static org.mockito.Mockito.when;

@DisplayName("TDD: Forum Statistic Test Suite.")
@ExtendWith(MockitoExtension.class)

public class StaticCalculationsTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("Starting Test Suite. God, please have mercy upon us...");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("Somehow we did it. All tests have executed properly.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @AfterEach
    public void afterEveryTest(){
        System.out.println("Finished test #" + testCounter);
    }

    @InjectMocks
    StaticCalculations forumStatistics;

    @Mock
    Statistics statisticsMock;

    @Test
    void testStatisticNoPost() {
        //Given
        int posts = 0;
        int comments = 10;
        List <String> usersList = new ArrayList<String>();
        for (int i =0; i < 100; i++) {
            usersList.add("User"+i);
        }
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.commentsCount()).thenReturn(comments);
        when(statisticsMock.postsCount()).thenReturn(posts);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        int registered100Users = forumStatistics.getUserCount();
        int writtenPosts = forumStatistics.getPostsCount();
        int writtenComments = forumStatistics.getCommentsCount();
        double PURatio = forumStatistics.getPostsUserRatio();
        double CURatio = forumStatistics.getCommentsUserRatio();
        double CPRatio = forumStatistics.getCommentsPostsRatio();
        //Then
        Assertions.assertEquals(100, registered100Users);
        Assertions.assertEquals(0, writtenPosts);
        Assertions.assertEquals(10, writtenComments);
        Assertions.assertEquals(0, PURatio);
        Assertions.assertEquals(0.1, CURatio);
        Assertions.assertEquals(0, CPRatio);
        forumStatistics.showStatistics();
    }

    @Test
    void testStatistic1000Post() {
        //Given
        int posts = 1000;
        int comments = 0;
        List <String> usersList = new ArrayList<String>();
        for (int i =0; i < 100; i++) {
            usersList.add("User"+i);
        }
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.commentsCount()).thenReturn(comments);
        when(statisticsMock.postsCount()).thenReturn(posts);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        int registered100Users = forumStatistics.getUserCount();
        int writtenPosts = forumStatistics.getPostsCount();
        int writtenComments = forumStatistics.getCommentsCount();
        double PURatio = forumStatistics.getPostsUserRatio();
        double CURatio = forumStatistics.getCommentsUserRatio();
        double CPRatio = forumStatistics.getCommentsPostsRatio();

        //Then
        Assertions.assertEquals(100, registered100Users);
        Assertions.assertEquals(1000, writtenPosts);
        Assertions.assertEquals(0, writtenComments);
        Assertions.assertEquals(10, PURatio);
        Assertions.assertEquals(0, CURatio);
        Assertions.assertEquals(0, CPRatio);
    }

    @Test
    void testStatisticNoComments() {
        //Given
        int posts = 100;
        int comments = 0;
        List <String> usersList = new ArrayList<String>();
        for (int i =0; i < 100; i++) {
            usersList.add("User"+i);
        }
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.commentsCount()).thenReturn(comments);
        when(statisticsMock.postsCount()).thenReturn(posts);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        int registered100Users = forumStatistics.getUserCount();
        int writtenPosts = forumStatistics.getPostsCount();
        int writtenComments = forumStatistics.getCommentsCount();
        double PURatio = forumStatistics.getPostsUserRatio();
        double CURatio = forumStatistics.getCommentsUserRatio();
        double CPRatio = forumStatistics.getCommentsPostsRatio();

        //Then
        Assertions.assertEquals(100, registered100Users);
        Assertions.assertEquals(100, writtenPosts);
        Assertions.assertEquals(0, writtenComments);
        Assertions.assertEquals(1, PURatio);
        Assertions.assertEquals(0, CURatio);
        Assertions.assertEquals(0, CPRatio);
    }

    @Test
    void testLessCommentsThanPosts() {
        //Given
        int posts = 1000;
        int comments = 100;
        List <String> usersList = new ArrayList<String>();
        for (int i =0; i < 100; i++) {
            usersList.add("User"+i);
        }
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.commentsCount()).thenReturn(comments);
        when(statisticsMock.postsCount()).thenReturn(posts);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        int registered100Users = forumStatistics.getUserCount();
        int writtenPosts = forumStatistics.getPostsCount();
        int writtenComments = forumStatistics.getCommentsCount();
        double PURatio = forumStatistics.getPostsUserRatio();
        double CURatio = forumStatistics.getCommentsUserRatio();
        double CPRatio = forumStatistics.getCommentsPostsRatio();

        //Then
        Assertions.assertEquals(100, registered100Users);
        Assertions.assertEquals(1000, writtenPosts);
        Assertions.assertEquals(100, writtenComments);
        Assertions.assertEquals(10, PURatio);
        Assertions.assertEquals(1, CURatio);
        Assertions.assertEquals(0.1, CPRatio);
    }

    @Test
    void testMoreCommentsThanPosts() {
        //Given
        int posts = 100;
        int comments = 1000;
        List <String> usersList = new ArrayList<String>();
        for (int i =0; i < 100; i++) {
            usersList.add("User"+i);
        }
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.commentsCount()).thenReturn(comments);
        when(statisticsMock.postsCount()).thenReturn(posts);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        int registered100Users = forumStatistics.getUserCount();
        int writtenPosts = forumStatistics.getPostsCount();
        int writtenComments = forumStatistics.getCommentsCount();
        double PURatio = forumStatistics.getPostsUserRatio();
        double CURatio = forumStatistics.getCommentsUserRatio();
        double CPRatio = forumStatistics.getCommentsPostsRatio();

        //Then
        Assertions.assertEquals(100, registered100Users);
        Assertions.assertEquals(100, writtenPosts);
        Assertions.assertEquals(1000, writtenComments);
        Assertions.assertEquals(1, PURatio);
        Assertions.assertEquals(10, CURatio);
        Assertions.assertEquals(10, CPRatio);
    }

    @Test
    void testNoUsers() {
        //Given
        int posts = 100;
        int comments = 100;
        List <String> usersList = new ArrayList<String>();
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.commentsCount()).thenReturn(comments);
        when(statisticsMock.postsCount()).thenReturn(posts);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        int registered100Users = forumStatistics.getUserCount();
        int writtenPosts = forumStatistics.getPostsCount();
        int writtenComments = forumStatistics.getCommentsCount();
        double PURatio = forumStatistics.getPostsUserRatio();
        double CURatio = forumStatistics.getCommentsUserRatio();
        double CPRatio = forumStatistics.getCommentsPostsRatio();

        //Then
        Assertions.assertEquals(0, registered100Users);
        Assertions.assertEquals(100, writtenPosts);
        Assertions.assertEquals(100, writtenComments);
        Assertions.assertEquals(0, PURatio);
        Assertions.assertEquals(0, CURatio);
        Assertions.assertEquals(1, CPRatio);
    }

    @Test
    void test100Users() {
        //Given
        int posts = 100;
        int comments = 100;
        List <String> usersList = new ArrayList<String>();
        for (int i =0; i < 100; i++) {
            usersList.add("User"+i);
        }
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.commentsCount()).thenReturn(comments);
        when(statisticsMock.postsCount()).thenReturn(posts);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        int registered100Users = forumStatistics.getUserCount();
        int writtenPosts = forumStatistics.getPostsCount();
        int writtenComments = forumStatistics.getCommentsCount();
        double PURatio = forumStatistics.getPostsUserRatio();
        double CURatio = forumStatistics.getCommentsUserRatio();
        double CPRatio = forumStatistics.getCommentsPostsRatio();

        //Then
        Assertions.assertEquals(100, registered100Users);
        Assertions.assertEquals(100, writtenPosts);
        Assertions.assertEquals(100, writtenComments);
        Assertions.assertEquals(1, PURatio);
        Assertions.assertEquals(1, CURatio);
        Assertions.assertEquals(1, CPRatio);
    }
}
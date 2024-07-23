package com.assignment.questionSocialMediaAdapter;

import com.assignment.questionSocialMediaAdapter.external.TwitterApi;
import com.assignment.questionSocialMediaAdapter.external.TwitterTweet;

import java.util.ArrayList;
import java.util.List;

public class TwitterAdepter implements SocialMediaAdapter{
    TwitterApi twitterApi = new TwitterApi();
    @Override
    public List<SocialMediaPost> fetchPosts(Long userId, Long timestamp) {
        List<TwitterTweet> data = twitterApi.getTweets(userId);
        List<SocialMediaPost> posts = new ArrayList<>();
        for (TwitterTweet tweet : data) {
            SocialMediaPost post = new SocialMediaPost(tweet.getId(),tweet.getTweet(),tweet.getUserId(),123456789L);
            posts.add(post);
        }
        return posts;
    }

    @Override
    public void postStatus(Long user, String status) {
        twitterApi.tweet(user,status);
    }
}

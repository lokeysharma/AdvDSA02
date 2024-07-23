package com.assignment.questionSocialMediaAdapter;

import com.assignment.questionSocialMediaAdapter.external.FacebookApi;
import com.assignment.questionSocialMediaAdapter.external.FacebookPost;

import java.util.ArrayList;
import java.util.List;

public class FacebookAdapter implements SocialMediaAdapter{

    FacebookApi facebookApi = new FacebookApi();

    @Override
    public List<SocialMediaPost> fetchPosts(Long userId, Long timestamp) {

        List<FacebookPost> data = facebookApi.fetchFacebookPosts(userId,timestamp);
        List<SocialMediaPost> posts = new ArrayList<>();
        for(FacebookPost post : data){
            posts.add(new SocialMediaPost(post.getId(),post.getStatus(),post.getUserId(),post.getTimestamp()));
        }
        return posts;
    }

    @Override
    public void postStatus(Long user, String status) {
        facebookApi.postFacebookStatus(user,status);
    }
}

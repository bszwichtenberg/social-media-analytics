package pl.com.socialmediaanalytics.twitter.service;

import twitter4j.*;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;


@RequestScoped
public class TwitterSearchService {

    @Inject
    TwitterInstanceService twitterInstanceService;

    public List<Status> searchTweets(String userQuery) throws TwitterException {

        Twitter twitter = twitterInstanceService.getTwitterInstance();
        Query query = new Query(userQuery);
        QueryResult result = twitter.search(query);

        return result.getTweets();
    }


}

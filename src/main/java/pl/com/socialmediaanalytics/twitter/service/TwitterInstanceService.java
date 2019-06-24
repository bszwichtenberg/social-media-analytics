package pl.com.socialmediaanalytics.twitter.service;

import twitter4j.Twitter;
import twitter4j.TwitterFactory;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TwitterInstanceService {

    private Twitter twitter;

    public TwitterInstanceService() {
        TwitterFactory tf = new TwitterFactory();
        this.twitter =  tf.getInstance();
  }

    public Twitter getTwitterInstance() {
        return twitter;
    }
}

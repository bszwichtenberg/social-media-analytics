package pl.com.socialmediaanalytics.twitter.presentation;

import java.time.LocalDate;
import java.util.List;


public class TweetPresentationObject {

    private LocalDate createdAt;
    private String userName;
    private String screenName;
    private String usersProfileImageURL;
    private String text;
    private String source;
    private Integer favouriteCount;
    private Integer retweetCount;
    private List<String> mediaURLList;
    private List<String> hashtagList;
    private List<String> urlList;

    public TweetPresentationObject(LocalDate createdAt, String userName, String screenName, String usersProfileImageURL, String text, String source, Integer favouriteCount, Integer retweetCount, List<String> mediaURLList, List<String> hashtagList, List<String> urlList) {
        this.createdAt = createdAt;
        this.userName = userName;
        this.screenName = screenName;
        this.usersProfileImageURL = usersProfileImageURL;
        this.text = text;
        this.source = source;
        this.favouriteCount = favouriteCount;
        this.retweetCount = retweetCount;
        this.mediaURLList = mediaURLList;
        this.hashtagList = hashtagList;
        this.urlList = urlList;
    }


    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public String getUserName() {
        return userName;
    }

    public String getScreenName() {
        return screenName;
    }

    public String getUsersProfileImageURL() {
        return usersProfileImageURL;
    }

    public String getText() {
        return text;
    }

    public String getSource() {
        return source;
    }

    public Integer getFavouriteCount() {
        return favouriteCount;
    }

    public Integer getRetweetCount() {
        return retweetCount;
    }

    public List<String> getMediaURLList() {
        return mediaURLList;
    }

    public List<String> getHashtagList() {
        return hashtagList;
    }
}

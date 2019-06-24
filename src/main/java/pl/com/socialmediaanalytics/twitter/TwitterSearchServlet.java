package pl.com.socialmediaanalytics.twitter;

import freemarker.template.Template;
import freemarker.template.TemplateException;
import pl.com.socialmediaanalytics.twitter.freemarker.TemplateProvider;
import pl.com.socialmediaanalytics.twitter.service.TwitterSearchService;
import twitter4j.*;
import javax.inject.Inject;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet("/tweet-search")

public class TwitterSearchServlet extends HttpServlet {

    @Inject
    TwitterSearchService twitterSearchService;

    @Inject
    TemplateProvider templateProvider;


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        String optionParam = req.getParameter("option");
        String textParam = req.getParameter("text");

        Map<String, Object> model = new HashMap<>();
        Template template = templateProvider.getTemplate(getServletContext(), "tweet-list.ftlh");

        List<Status> statuses = new ArrayList<>();

        try {

           if((optionParam != null && !optionParam.isEmpty()) && (textParam != null && !textParam.isEmpty())) {
               if(optionParam.equals("lang")) {
                  statuses = twitterSearchService.searchTweets("lang:" + textParam);
               } else if(optionParam.equals("city")) {
                    statuses = twitterSearchService.searchTweets("city:" + textParam);
               }else if (optionParam.equals("country")) {
                    statuses = twitterSearchService.searchTweets("country:" + textParam);
               }
            } else {
                resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
                return;
            }
        } catch (TwitterException e) {

        }

        model.put("statuses", statuses);
        try {
            template.process(model, resp.getWriter());
        } catch (TemplateException e) {

        }
    }
}

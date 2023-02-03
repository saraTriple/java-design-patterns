package src.Observer2;

import java.util.ArrayList;
import java.util.List;

// Observable
public class NewsAgency {

    private String news;
    private List<Channel> channels = new ArrayList<>();

    public void addObserver(Channel channel) {
        this.channels.add(channel);
    }

    public void removeObserver(Channel channel) {
        this.channels.remove(channel);
    }


    // Updating the news
    public void setNews(String news) {
        this.news = news;

        // Notify all channels for the breaking news
        notifyAllChannels(news);
    }


    public void notifyAllChannels(String news) {
        for (Channel channel: this.channels) {
            channel.update(news);
        }
    }



}

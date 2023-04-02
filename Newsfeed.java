import java.util.Arrays;
public class Newsfeed {

    String[] topics = {"Opinion", "Tech", "Science", "Health"};
    int[] views = {0,0,0,0};
    String[] favoriteArticles;

    public Newsfeed(){
    favoriteArticles = new String[10];
    }

    public String[] getTopics(){
        return topics;
    }

    public String getTopTopics(){
        return topics[0]; // This will return Opinion since its on index 0
    }

    public void viewTopic(int topicIndex){
        views[topicIndex] = views[topicIndex] + 1;
    }

    public static void main(String[] args){
        Newsfeed sampleFeed = new Newsfeed();

        System.out.println("The top topic is " + sampleFeed.getTopTopics());

        sampleFeed.viewTopic(1); // first view
        sampleFeed.viewTopic(1); // second view
        sampleFeed.viewTopic(3);
        sampleFeed.viewTopic(2);
        sampleFeed.viewTopic(2);
        sampleFeed.viewTopic(1); // third view
        sampleFeed.viewTopic(1); // forth view

        System.out.println("The " + sampleFeed.topics[1] + " topic has been viewed " + sampleFeed.views[1] + " times!");
    }



}

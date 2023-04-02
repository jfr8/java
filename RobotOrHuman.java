import java.util.Arrays;
public class RobotOrHuman {

    String[] topics;

    public RobotOrHuman(String[] initialTopics) {
        topics = initialTopics;
    }

    public static void main(String[] args){
        RobotOrHuman feed;
        if (args[0].equals("Human")){

            String[] humanTopics = {"Politics", "Science", "Sports", "Love"};
            feed = new RobotOrHuman(humanTopics);

        } else if(args[0].equals("Robot")){

            String[] robotTopics = {"Oil", "Parts", "Algorithms", "Love"};
            feed = new RobotOrHuman(robotTopics);

        } else {
            String[] genericTopics = {"Opinion", "Tech", "Science", "Health"};
            feed = new RobotOrHuman(genericTopics);
        }

        System.out.println("The topics in this feed are:");
        System.out.println(Arrays.toString(feed.topics));
    }
}

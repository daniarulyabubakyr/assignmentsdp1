package studymate;

public class StudyMateApp {

    private final String appName;
    private final String language;
    private final String theme;
    private final String authentication;
    private final String notifications;
    private final String studyPlanner;
    private final String subscription;


    public StudyMateApp(
            String appName,
            String language,
            String theme,
            String authentication,
            String notifications,
            String studyPlanner,
            String subscription
    ){
        this.appName=appName;
        this.language=language;
        this.theme=theme;
        this.authentication=authentication;
        this.notifications=notifications;
        this.studyPlanner=studyPlanner;
        this.subscription=subscription;
    }

    public void showDetails(){
        System.out.println("=== StudyMate App===");
        System.out.println("App name: "+appName);
        System.out.println("Language: "+language);
        System.out.println("Theme: "+theme);
        System.out.println("Authentication: "+authentication);
        System.out.println("Notifications: "+notifications);
        System.out.println("Study planner: "+studyPlanner);
        System.out.println("Subscription: " +subscription);
    }


}
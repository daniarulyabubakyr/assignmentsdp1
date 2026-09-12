package studymate;


public class FreeStudyMateBuilder implements StudyMateBuilder{


    private String appName;
    private String language;
    private String theme;
    private String authentication;
    private String notifications;
    private String studyPlanner;
    private String subscription;

    @Override
    public StudyMateBuilder setAppName(String appName){
        this.appName=appName;
        return this;
    }
    @Override
    public StudyMateBuilder setLanguage(String language){
        this.language=language;
        return this;
    }
    @Override
    public StudyMateBuilder setTheme(String theme){
        this.theme=theme;
        return this;
    }
    @Override
    public StudyMateBuilder setAuthentication(String authentication){
        this.authentication=authentication;
        return this;
    }
    @Override
    public StudyMateBuilder setNotifications(String notifications){
        this.notifications=notifications;
        return this;
    }
    @Override
    public StudyMateBuilder setStudyPlanner(String studyPlanner){
        this.studyPlanner=studyPlanner;
        return this;
    }
    @Override
    public StudyMateBuilder setSubscription(String subscription){
        this.subscription=subscription;
        return this;
    }

    @Override
    public StudyMateApp build(){
        return new StudyMateApp(
                appName,
                language,
                theme,
                authentication,
                notifications,
                studyPlanner,
                subscription

        );
    }
}


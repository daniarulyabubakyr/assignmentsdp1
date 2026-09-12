package studymate;

public abstract class AbstractStudyMateBuilder implements StudyMateBuilder {


    protected String appName;
    protected String language;
    protected String theme;
    protected String authentication;
    protected String notifications;
    protected String studyPlanner;
    protected String subscription;

    @Override
    public StudyMateBuilder setAppName(String appName) {
        this.appName = appName;
        return this;
    }

    @Override
    public StudyMateBuilder setLanguage(String language) {
        this.language = language;
        return this;
    }

    @Override
    public StudyMateBuilder setTheme(String theme) {
        this.theme = theme;
        return this;
    }

    @Override
    public StudyMateBuilder setAuthentication(String authentication) {
        this.authentication = authentication;
        return this;
    }

    @Override
    public StudyMateBuilder setNotifications(String notifications) {
        this.notifications = notifications;
        return this;
    }

    @Override
    public StudyMateBuilder setStudyPlanner(String studyPlanner) {
        this.studyPlanner = studyPlanner;
        return this;
    }

    @Override
    public StudyMateBuilder setSubscription(String subscription) {
        this.subscription = subscription;
        return this;
    }


    @Override
    public abstract StudyMateApp build();


    protected void validate(){
        if (appName==null||appName.isBlank()){
            throw new IllegalStateException("App name is required");
        }
        if(language==null||language.isBlank()){
            throw new IllegalStateException("Language is required");
        }
        if(subscription==null||subscription.isBlank()){
            throw new IllegalStateException("Subscription is required");
        }
    }



}

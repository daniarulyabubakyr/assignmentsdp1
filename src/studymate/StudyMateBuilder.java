package studymate;

public class StudyMateBuilder {
    StudyMateBuilder setAppname(String appName);
    StudyMateBuilder setLanguage(String language);
    StudyMateBuilder setTheme(String theme);
    StudyMateBuilder setAuthentication(String authentication);
    StudyMateBuilder setNotifications(String notifications);
    StudyMateBuilder setStudyPlanner(String studyPlanner);
    StudyMateBuilder setSubscription(String subscription);

    StudyMateApp build();


}

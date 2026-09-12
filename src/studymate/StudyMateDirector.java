package studymate;

public class StudyMateDirector {

    private final StudyMateBuilder builder;

    public StudyMateDirector(StudyMateBuilder builder){
        this.builder=builder;
    }


    public StudyMateApp buildFreeApp(){
        return builder
                .setAppName("StudyMate")
                .setLanguage("English")
                .setTheme("Light")
                .setAuthentication("Email")
                .setNotifications("Basic")
                .setStudyPlanner("Basic")
                .setSubscription("Free")
                .build();
    }


    public StudyMateApp buildPremiumApp(){
        return builder
                .setAppName("StudyMate PRO")
                .setLanguage("Kazakh+Russian+English")
                .setTheme("Soft Blue")
                .setAuthentication("Apple ID+Email")
                .setNotifications("Smart")
                .setStudyPlanner("Advanced")
                .setSubscription("Premium")
                .build();
    }




}

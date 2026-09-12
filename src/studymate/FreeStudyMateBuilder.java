package studymate;

public class FreeStudyMateBuilder extends AbstractStudyMateBuilder {

    @Override
    public StudyMateApp build() {
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
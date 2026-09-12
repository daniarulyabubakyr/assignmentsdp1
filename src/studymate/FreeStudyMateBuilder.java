package studymate;

public class FreeStudyMateBuilder extends AbstractStudyMateBuilder {

    @Override
    public StudyMateApp build() {

        validate();

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
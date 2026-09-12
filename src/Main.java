import studymate.*;


public class Main{
    public static void main(String[] args){
        StudyMateBuilder freeBuilder=new FreeStudyMateBuilder();
        StudyMateDirector freeDirector=
                new StudyMateDirector(freeBuilder);
        StudyMateApp freeApp=freeDirector.buildFreeApp();
        System.out.println("FREE VERSION");
        freeApp.showDetails();


        System.out.println();


        StudyMateBuilder premiuimBuilder=
                new PremiumStudyMateBuilder();
        StudyMateDirector premiumDirector=
                new StudyMateDirector(premiuimBuilder);

        StudyMateApp premiumApp=
                premiumDirector.buildPremiumApp();

        System.out.println("PRMIUM VERSION");
        premiumApp.showDetails();
    }
}
package ZensarLectures.Day12;

public class AnnotationsLecture {
    static class Employee{
        void message(){
            System.out.println("Message from Employee without overriding");
        }
    }

    static class Employee1 extends Employee{
        @Override
        void message(){
            System.out.println("Message after overriding");
        }
    }

}

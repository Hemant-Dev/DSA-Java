package ZensarLectures.Day12;
import java.util.*;
public class Main {
    @SuppressWarnings("unchecked")
    static
    class A{
        void m(){
            System.out.println("hello m");
        }
        @Deprecated
        void n(){
            System.out.println("hello n");
        }
    }


    public static void main(String[] args) {
//        Override Annotation
        AnnotationsLecture.Employee emp = new AnnotationsLecture.Employee1();

        emp.message();

//        SupressWarnings Annotations
        ArrayList list = new ArrayList();
        list.add("sonoo");
        list.add("vimal");
        list.add("ratan");
        for(Object obj : list){
            System.out.println(obj);
        }

//        Deprecated Annotations
        A a = new A();
        a.n();


    }
}

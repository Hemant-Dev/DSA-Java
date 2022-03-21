package ZensarLectures;

public class MyDate {

    public void getMyDate(String date){
        String[] newDate = date.split("[-, /]");
        String Day, Month, Year;
        Day = newDate[0];
        Month = newDate[1];
        Year = newDate[2];
        System.out.println("Day: "+Day+" Month: "+Month+" Year: "+Year);
    }

    public static void main(String[] args) {
        MyDate ob = new MyDate();
        ob.getMyDate("12-Jan-2022");
        ob.getMyDate("12/12/12");
    }
}

import javax.xml.crypto.Data;

public class Data1 {
    public int year = 1949;
    public int month = 10;
    public int day = 1;
    public Data1()
    {

    }
    public Data1(int year, int month, int day)
    {

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }



    public void setMonth(int month) {
        this.month = month;
    }
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }
    public static void main(String[] args)
    {
        Data1 d1 = new Data1(2021,6,9);
        Data1 d2 = new Data1();
        int a=d1.getYear();
        System.out.println(a);
        System.out.println(d1);
        System.out.println(d2);
    }
}
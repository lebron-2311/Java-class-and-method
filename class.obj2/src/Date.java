public class Date {
    public int year;
    public int day;
    public  int month;

    public  void setDay(int year,int month,int day)
    {
        this.year=year;
        this.day=day;
        this.month=month;
    }
    public void setDay(int year,int month)
    {
        this.year=year;
        this.month=month;
    }
    public void printDate()
    {
        System.out.println(this.year+"/"+this.month+"/"+this.day);
    }
    public static void main(String[] args) {
        /* System.out.println(this.year+'/'+this.month+"/");会报错，因为在static中不能引用非静态成员变量year 和 month需要实例化*/
        Date day1=new Date();
        day1.setDay(1949,10,1);
        day1.printDate();
        Date day2=new Date();
        day2.setDay(2018,5);
        day2.printDate();
    }

}

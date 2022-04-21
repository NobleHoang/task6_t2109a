public class Data {
        int day;
        int month;
        int year;
        public Data(int day, int month, int year){
            this.day=day;
            this.month=month;
            this.year=year;
        }
        public int getDay(){
            return day;
        }
        public int getMonth(){
            return month;
        }
        public int getYear(){
            return year;
        }
        public void setDay(int day) {
        this.day = day;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setData(int day, int month, int year){
          this.day=day;
          this.month=month;
          this.year=year;
    }
    public static void main(String[] args) {
        Data data=new Data(20,10,2003);
        System.out.println("Day is: "+data.day);
        System.out.println("Month is: "+data.month);
        System.out.println("Year is: "+data.year);
        data.setData(19,04,2022);
        System.out.println("Day is: "+data.getDay());
        System.out.println("Month is: "+data.getMonth());
        System.out.println("Year is: "+data.getYear());
    }
}

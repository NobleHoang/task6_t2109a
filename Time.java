public class Time {
    int hour;
    int minute;
    int second;
    public Time(int hour, int minute, int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }
    public int getHour(){
        return hour;
    }
    public int getMinute(){
        return minute;
    }
    public int getSecond(){
        return second;
    }
    public void setHour(int hour){
        this.hour = hour;
    }
    public void setMinute(int minute) {
        this.minute = minute;
    }
    public void setSecond(int second) {
        this.second = second;
    }
    public void setTime(int hour,int minute,int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }

    @Override
    public String toString() {
        return "Time{" + "hour=" + hour + ", minute=" + minute + ", second=" + second + '}';
    }

    public Time nextSecond(){
        ++second;
        if (second>=60){
            second=0;
            ++minute;
            if (minute>=60){
                minute=0;
                ++hour;
                if (hour>=24){
                    hour=0;
                }
            }
        }
        return this;
    }
    public Time previousSecond(){
        --second;
        if (second<=0){
            second=59;
            --minute;
            if (minute<=0){
                minute=59;
                --hour;
                if(hour<=0)
                    hour=23;
            }
        }
        return this;
    }
    public static void main(String[] args) {
        Time time=new Time(7,42,05);
        System.out.println("Time: "+time);
        time.setHour(0);
        time.setMinute(0);
        time.setSecond(0);
        System.out.println("Hour: "+time.getHour());
        System.out.println("Minute: "+time.getMinute());
        System.out.println("Second: "+time.getSecond());
        System.out.println("Time: "+time.nextSecond());
        System.out.println("Time: "+time.previousSecond());
    }
}

package watch;

public class watch {

    private int hour;
    private int minute;
    private int second;

    public watch() {}

    public watch(int hour) {
        this.hour = hour;
    }

    public watch(int hour, int minute) {
    this.hour = hour;
    this.minute = minute;
    }

    public watch(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void display() {
        System.out.println(getHour() + ":" + getMinute() + ":" + getSecond());
    }
}
package com.company;

public class TimeSpan {
    private int minutes;
    private int hours;

    public void setTime(int hours, int minutes) {
        if(hours > 0) {
            this.hours = hours;
        }
        if(minutes > 0 && minutes < 60) {
            this.minutes = minutes;
        }
    }

    public int getMinutes() {
        return minutes;
    }

    public int getHours() {
        return hours;
    }

    public void addTime(int hours, int minutes) {
        this.hours += hours;
        if(minutes < 0 || minutes > 60) return;
        int tmp = this.minutes + minutes;
        if(tmp > 60) {
            this.hours++;
            this.minutes = tmp - 60;
        } else {
            this.minutes = tmp;
        }
    }

    public void subTime(int hours, int minutes) {
        int totalHours = this.hours - hours;
        if(totalHours < 0) {
            this.hours = 0;
        } else {
            this.hours = totalHours;
        }

        if(minutes < 0 || minutes > 60) return;

        int totalMinutes = this.minutes - minutes;
        if(totalMinutes < 0) {
            this.minutes = 0;
        } else {
            this.minutes = totalMinutes;
        }
    }
}

import javax.management.remote.rmi.RMIConnectionImpl;

class Clock {

    int hours = 12;
    int minutes = 0;

    void next() {
        if (minutes != 59) {
            minutes++;
        } else {
            minutes = 0;
            if (hours == 12) {
                hours = 1;
            } else {
                hours++;
            }
        }
    }
}
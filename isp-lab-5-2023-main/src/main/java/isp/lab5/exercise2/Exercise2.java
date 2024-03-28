package isp.lab5.exercise2;

public class Exercise2 {
        public static void main(String[] args) {
            Laptop laptop = new Laptop(30);
            SmartPhone smartPhone = new SmartPhone(10);
            SmartWatch smartWatch = new SmartWatch(5);

            laptop.charge(20);
            smartPhone.charge(15);
            smartWatch.charge(10);

            System.out.println("Nivelul bateriei pentru laptop: " + laptop.getBatteryLevel() + "%");
            System.out.println("Nivelul bateriei pentru smartphone: " + smartPhone.getBatteryLevel() + "%");
            System.out.println("Nivelul bateriei pentru smartwatch: " + smartWatch.getBatteryLevel() + "%");
        }
    }



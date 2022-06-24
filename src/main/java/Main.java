public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        Car2 car3 = new Car2(100);
        Car2 car4 = new Car2(200);

        car1.max_speed = 100;
        car2.max_speed = 200;

        System.out.println(car1.max_speed);
        System.out.println(car2.max_speed);
        System.out.println(car3.max_speed);
        System.out.println(car4.max_speed);
    }
}

class Car {
    int max_speed;
}



class Car2 {
    public Car2(int max_speed) {
        this.max_speed = max_speed;
    }

    int max_speed;
}

//class Car {
//    int max_speed;
//}
//
//
//        System.out.println(car1.max_speed);
//        System.out.println(car2.max_speed);
//        System.out.println(car1.max_speed);
//        System.out.println(car2.max_speed);
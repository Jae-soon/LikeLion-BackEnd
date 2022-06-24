public class chapter5 {
    public static void main(String[] args) {
        Car3 car1 = new Car3(100);
        Car3 car2 = new Car3(200);

        car1.run();
        car2.run();
    }
}

class Car3 {
    int max_speed;
    
    public Car3(int max_speed) {
        this.max_speed = max_speed;    
    }
    
    void run() {
        System.out.println("자동차가 최고속력 " + max_speed + "로 달립니다.");
    }
}
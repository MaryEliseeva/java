package practice19;

public class EnumWithMethod {
    enum TrafficLight {
        RED(30), YELLOW(5), GREEN(25);

        private final int duration;

        TrafficLight(int duration) {
            this.duration = duration;
        }

        // Дополнительный метод
        public void showInfo() {
            System.out.println(this.name() + " горит " + duration + " секунд");
        }
    }

    public static void main(String[] args) {
        for (TrafficLight light : TrafficLight.values()) {
            light.showInfo();
        }
    }
}

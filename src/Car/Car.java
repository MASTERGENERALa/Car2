package Car;

    import java.util.Arrays;

    public class Car implements Comparable<Car> {
        int speed;
        int price;
        String model;
        String color;

        Car(int speed, int price, String model, String color) {
            this.speed = speed;
            this.price = price;
            this.model = model;
            this.color = color;
        }

        public String toString() {
            return this.model + " " + this.color + " " + this.speed + " " + this.price;
        }

        // Сортування за швидкістю, ціною, моделлю та кольором
        public int compareTo(Car otherCar) {
            int result = this.speed - otherCar.speed;
            if (result != 0) {
                return result;
            }

            result = this.price - otherCar.price;
            if (result != 0) {
                return result;
            }

            result = this.model.compareTo(otherCar.model);
            if (result != 0) {
                return result;
            }

            return this.color.compareTo(otherCar.color);
        }
}



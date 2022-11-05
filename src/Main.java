public class Main{}
//    public static void main;
public class Main2 {
    public static void main(String[] args) {
        ageAndTemperature(36, -6);
        ageAndTemperature(15, 1);
        ageAndTemperature(26, -4);
        ageAndTemperature(56, 32);
        ageAndTemperature(12, -12);

    }

    public static String ageAndTemperature(int age, double temperature) {

        if (age > 19 && age < 46) {
            if (temperature > -19 && temperature < 31) {
                System.out.println("Можно идти гулять");

            }
        } else if (age <= 20) {
            if (temperature > 1 && temperature < 9) {
                System.out.println("Можно идти гулять");
            }
        } else if (age >= 46) {
            if (temperature > -11 && temperature < 25) {
                System.out.println("Можно идти гулять");
            } else {
                System.out.println("Оставайтесь дома!");
            }
        }
        return "Возраст человека = " + age + " Температура на улице = " + temperature;
    }public class test    {
        public static void IDontNow(String[] args) {
            Random rand = new Random();
            for (int i = 0; i < 1000; i++) {
                System.out.println(rand.nextInt(60));
            }
        }

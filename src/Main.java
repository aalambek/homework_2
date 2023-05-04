import java.util.Random;

public class Main {
    public static void main(String[] args) {




                System.out.println(walks(15, -5));//1
                System.out.println(walks(10, 5));//2
                System.out.println(walks(3, 0));//3
                System.out.println(walks(55, -25));//4
                System.out.println(walks(20, 20));//5
                System.out.println(walks(generateRandom(), 30));
                System.out.println(walks(generateRandom(),generateRandom()));

            }

            public static String walks(int age, int temperature) {
                if (age >= 20 && age <= 45 && temperature <= 30 && temperature >= -20) {
                    return "можно идти гулять";
                } else if (age < 20 && temperature >= 0 && temperature <= 28) {
                    return "можно идти гулять";
                } else if (age > 45 && temperature >= -10 && temperature <= 25) {
                    return "можно идти гулять";
                } else {
                    return "оставайтесь дома";
                }
            }

            //тут задание на сообразительность
            public static int generateRandom(){
                Random random = new Random();
                return random.nextInt(99);// макс. число 99
            }
        }


public class Main {
    public static void main(String[] args) {
        System.out.println("--- 1uzd ---");
        for (int i = 0; i < 10; i++) {
            System.out.println("labas");
        }
        System.out.println("--- 2uzd ---");

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("--- 3uzd ---");

        String[] plants = {"azuolas","kiparisas","melisa","jonazole","klevas","lazdynas","bazilikas","morka","levanda", "maumedis","tuja", "melynoji vorine lelija"};

        System.out.println("--- 4uzd ---");

        for (int i = 0; i < plants.length; i++) {
            System.out.println(plants[i]);
        }
        System.out.println("--- 6uzd ---");

        for (int i = 10; i < 50; i++) {
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
        System.out.println("--- 7uzd ---");

        for (int i = 10; i < 50; i++) {
            if(i % 10 == 0){
                continue;
            }
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
        System.out.println("--- 7uzd alt ---");

        for (int i = 10; i < 50; i++) {
            if(i % 2 == 0 && i % 10 != 0){
                System.out.println(i);
            }
        }
        System.out.println("--- 7uzd alt2 ---");

        for (int i = 10; i < 50; i++) {
            if(i % 2 != 0 || i % 10 == 0){
               continue;
            }
            System.out.println(i);
        }

        System.out.println("--- 8uzd ---");
        int count = 0;
        for (int i = 0; i < 20; i++) {
            if(i % 2 == 0){
              count++;
            }
        }
        System.out.println(count);
        System.out.println("--- 9uzd ---");

        int count5 = 0;
        int count7 = 0;
        for (int i = 0; i < plants.length; i++) {
            if(plants[i].length() < 5){
                count5++;
            }
            if(plants[i].length() > 7){
                count7++;
            }
        }
        System.out.println(count5 + " " + count7);

        System.out.println("--- 10uzd ---");

        int count5and7 = 0;
        for (int i = 0; i < plants.length; i++) {
            if(plants[i].length() > 5 && plants[i].length() < 10){
                count5and7++;
            }
        }
        System.out.println(count5and7);

    }
}
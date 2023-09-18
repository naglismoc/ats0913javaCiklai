public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("kepu skelbiu.lt " + i + " kortele");
            System.out.println("dar biskis");
        }
        System.out.println("na va, pabaigem");

        String text = "kazkoks tekstas";
        //                  0       1           2       3           4       5       6       7           8
        String[] names = {"Roman","Aivaras", "Sandra", "Asta", "Rimutis", "Agne", "Olga","Valerijus", "Naglis" };
        String[] texts = new String[5];
        int[] luckyNumbers = {8, 11, 3, 4 };

        System.out.println(names);
        System.out.println(luckyNumbers);
        System.out.println(names.length);
        System.out.println( names[3] );
        System.out.println( names[4] );
        System.out.println( names[5] );
        System.out.println("------------------------------");

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] );
        }
        System.out.println("------------------------------");
        names[0] = "Romanas";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] );
        }
        names[0] = null;
        System.out.println("------------------------------");

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] );
        }

        //return; break; continue;

        System.out.println("------------------------------");
        for (int i = 0; i < 20; i++) {
            if(i % 2 != 0) {
                System.out.println(i);
            }
        }
        System.out.println("------------------------------");
        for (int i = 0; i < 20; i++) {
            if(i % 4 == 0) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("------------------------------");
        for (int i = 1; i < 20; i++) {
            System.out.println(i);
            if(i % 4 == 0) {
                break;
            }
        }

//        int i = 0;
//        long sum = 0;
//        while (true){
//            i++;
//            sum += i;
//            if(i % 1000000 == 0) {
//                System.out.println("HAcKeD!" + i);
//            }
//            if(i == 2147000000){
//                break;
//            }
//        }
//        System.out.println(sum);

        System.out.println(Math.round(Math.random()));
        System.out.println("------------------------------");

        while (Math.round(Math.random()) == 1){
            System.out.println(1);
        }
        System.out.println("------------------------------");

        while(true){
           // System.out.println("while");
            long rndNum =  Math.round(Math.random());
            if(rndNum == 0){
                break;
            }
            System.out.println(rndNum);
        }

        boolean shouldgo = true;

        while (shouldgo){

            long rndNum =  Math.round(Math.random());
            if(rndNum == 0){
                shouldgo = false;
            }
            System.out.println(rndNum);
        }


    }
}
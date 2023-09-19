public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println("--------------------------");

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        //                      0       1           2           3       4       5           6           7       8           9       10                11                    12
        String[] plants = {"azuolas","kiparisas","melisa","jonazole","klevas","lazdynas","bazilikas","morka","levanda", "maumedis","tuja", "melynoji vorine lelija"};


        for (int i = plants.length - 1; i >= 0; i--) {
            System.out.println(plants[i]);
        }

        for (int i = 23; i < 50 ; i+= 3) {
            System.out.println(i);
        }

        for (String augalas : plants ) {
            System.out.println(augalas);
        }

        for (int i = 0; i < plants.length; i++) {
            String augalas = plants[i];
            System.out.println(augalas);
        }
        System.out.println("--------------------------");

        for (int i = 50; i >= 0; i-= 4) {
            System.out.println(i);
        }

        System.out.println("--------------------------");

        int i = 0;
        for ( ; i < 10; ) {
            System.out.println(i);
            i++;
        }


        for ( ; true; ) {
            System.out.println("forile");
            if(Math.random() < 0.5){
                break;
            }
        }
        int a = 0;
        while(a < 10){
            System.out.println(a);
            a++;
        }

        do{
            System.out.println("veikia");
        }while(5 > 10);





         a = 0;
       do{
            System.out.println(a);
            a++;
        } while(a < 10);


        int[][] arr2d2 = new int[2][3];
        arr2d2[0][0]= 5;
        arr2d2[0][1]= 5;
        arr2d2[0][2]= 5;

        arr2d2[1][0]= 7;
        arr2d2[1][1]= 8;
        arr2d2[1][2]= 9;

       int[][] arr2d = {
               {5,5,5,5,5,5},
               {7,8,9},
               {6,3,5,14,7},
               {14,8,10}
       };


        for (int y = 0; y < arr2d.length; y++) {//4
            for (int x = 0; x < arr2d[y].length; x++) {//6  //3  //5
                System.out.print(arr2d[y][x] +", ");
            }
            System.out.println();
        }

    }
}
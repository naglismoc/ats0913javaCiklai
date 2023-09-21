public class Main {
    public static void main(String[] args) {
        int[] rndIntArr = rndIntArr(4,10,6);
        printIntArr(rndIntArr);
        System.out.println(sumIntArr(rndIntArr));
        System.out.println(avgIntArr(rndIntArr));
    }
/*
4. Sukurkite Funkciją kuri priima int[] tipo kintamąį, prasuka ciklą ir atspausdina kiekvieną skaičių.
5. Sukurkite Funkciją kuri priima du int tipo kintamuosius, min ir max reikšmėms nustatyti ir sugeneruoja random int skaičių ir jį gražintų.
6. Sukurkite Funkciją kuri sugeneruotų random int skaičių masyvą ir jį gražintų. Funkcija priima tris int tipo kintamuosius, min, max ir length reikšmėms nustatyti.
7. Sukurkite Funkciją kuri panaudotų 6tos užduoties masyvą (priimtų kaip kintamąjį), susumuotų ir gražintų reikšmę.
8. Sukurkite Funkciją kuri priimtų 6tos užduoties masyvą ir gražintų jos skaičių vidurkį (double).

 */
    public static int rndInt (int min, int max){
        return min + (int) Math.round(Math.random() * (max - min));
    }

    public static int[] rndIntArr(int min, int max, int len){
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rndInt(min, max);
        }
        return arr;
    }

    public static void printIntArr(int[] arr){
        for (int number : arr) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
    public static int sumIntArr(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    public static double avgIntArr(int[] arr){
        return (double) sumIntArr(arr) / arr.length;
    }
}
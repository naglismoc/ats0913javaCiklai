public class Main {
    public static void main(String[] args) {
        String rndStr = generateRndStr(10);
        System.out.println(rndStr);
        printStrInAWeirdWay(rndStr);
    }
/*
Sugeneruokite atsitiktinį stringą iš raidžių ir skaičių (10 simbolių). Atspausdinkite simbolius stulpeliu.
Jei tai skaičius apgaubkite “ [ 7 ]”. Jei skaičiai eina keli iš eilės, apgaubkite juos kartu. [75].
 */


    public static void printStrInAWeirdWay(String str){
        String tempStr = "";//16
        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))){
             tempStr += str.charAt(i);
            }else {
                if(!tempStr.isEmpty()){
                    System.out.println("[" + tempStr + "]");
                    tempStr = "";
                }
                System.out.println(str.charAt(i));
            }
        }
        if(!tempStr.isEmpty()){
            System.out.println("[" + tempStr + "]");
        }
    }

    public static String generateRndStr(int length) {
        String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ12345678901234567890";
        String text = "";
        for (int i = 0; i < length; i++) {
            text += symbols.charAt((int) (Math.random()*symbols.length()));
        }
        return text;
    }

}
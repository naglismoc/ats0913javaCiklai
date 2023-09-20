public class Main {
    public static void main(String[] args) {
        sayHi();
        sayHiTo("Naglis");
        sayHiTo("Jonas");
        String vardas = "Petras";
        sayHiTo(vardas);
        String formattedName = toNameCase("joNukas");//Jonukas
        System.out.println(formattedName);
        System.out.println(Math.random());
        sayHiTo(toNameCase("joNukas"));
        System.out.println(simpPi());
    }

    public static double simpPi(){
        return 3.14;
    }

    public static String toNameCase(String name){
        name = ("" + name.charAt(0)).toUpperCase() + name.substring(1).toLowerCase();
        return name;
    }
    public static void sayHiTo(String name){
        System.out.println("hi " + name);
    }

    public static void sayHi(){
        System.out.println("hello and wellcome to java lesson!");
    }

}
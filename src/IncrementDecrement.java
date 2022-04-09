public class IncrementDecrement {
    public static void main(String[] args) {


        int lives = 5;
        lives = lives-1;
        System.out.println(lives);
        lives--; // decremento
        System.out.println(lives);

        lives++; // incremento
        System.out.println(lives);

        //prefija
        //gana un regalo por ganar una vida
        int gift =100 + ++lives; // prefijoo
        System.out.println(gift);
        System.out.println(lives);
    }
}

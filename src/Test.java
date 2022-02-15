public class Test {
    public static void main(String[] args) {
        String[] word = new String[8];

        word[0] = String.valueOf('c');
        word[1] = String.valueOf('o');
        word[2] = String.valueOf('m');
        word[3] = String.valueOf('p');
        word[4] = String.valueOf('u');
        word[5] = String.valueOf('t');
        word[6] = String.valueOf('e');
        word[7] = String.valueOf('r');

        System.out.println(word[4]);
       // System.out.println(word[4+5]);
        System.out.println(word[4] + word[5]);
        //System.out.println(word[16/2]);
        System.out.println(word[0%4]);



    }
}
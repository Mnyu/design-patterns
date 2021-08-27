package structural._04_decorator._01_string_decorator;

public class StringDecoratorDemo {
    public static void main(String[] args) {
        MagicString s = new MagicString("hello-world");
        System.out.println(s + " has " + s.getNoOfVowels() + " vowels");
    }
}

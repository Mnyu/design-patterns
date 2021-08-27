package _02_structural._05_facade;

public class Buffer {
    private char[] characters;
    private int lineWidth;

    public Buffer(int lineHeight, int lineWidth) {
        this.characters = new char[lineWidth * lineHeight];
        this.lineWidth = lineWidth;
    }

    public char charAt(int x, int y) {
        return characters[y * lineWidth + x];
    }
}

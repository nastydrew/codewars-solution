package com.gymfox.ARCHIVE.block;

public class Block {
    private int width;
    private int length;
    private int height;

    public Block(int ints[]) {
        this.width = ints[0];
        this.length = ints[1];
        this.height = ints[2];
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public int getVolume() {
        return width*height*length;
    }

    public int getSurfaceArea() {
        return (int) (6 * Math.pow(height,2));
    }
}
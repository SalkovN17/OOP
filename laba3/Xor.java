package oop_laba3;

public class Xor implements Operation{
    @Override
    public void printName() {
        System.out.println("Xor");
    }

    @Override
    public void printSign() {
        System.out.println("^");
    }

    @Override
    public boolean perform(boolean val1, boolean val2) {
        return val1 ^ val2;
    }

    @Override
    public String getSignStr(){
        return "^";
    }
}
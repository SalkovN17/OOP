package oop_laba3;

public class And implements Operation{
    @Override
    public void printName() {
        System.out.println("And");
    }

    @Override
    public void printSign() {
        System.out.println("&");
    }

    @Override
    public boolean perform(boolean val1, boolean val2) {
        return val1 & val2;
    }

    @Override
    public String getSignStr(){
        return "&";
    }
}
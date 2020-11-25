package com.company;

public class Main {

    static boolean CzyToPalindrom (String l) {
        int i = 0;
        int j = l.length() - 1;
        while (i<j) {
            if (l.charAt(i) != l.charAt(j))
                return  false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String l = "kajak";

        if (CzyToPalindrom(l))
            System.out.print("tak");
        else
            System.out.print("nie");
    }
}

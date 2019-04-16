package com.catolica;

class NaiveSearch {

    public static void search(String txt, String pat) {
        int tamanhoN = txt.length();
        int tamanhoM = pat.length();

        for (int i = 0; i < tamanhoN - tamanhoM; i++) {
            int j;

            for (j = 0; j < tamanhoM; j++)
                if(txt.charAt(i + j) != pat.charAt(j))
                    break;
            if (j == tamanhoM)
                System.out.println(i);
        }

    }
    public static void main(String[] args){
        String pat = "brown";
        String txt = "The quick brown fox jumps over the lazy dog";
        search(txt,pat);
    }
}
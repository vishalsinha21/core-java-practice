package vs.test;

public class Melodious {

    public static void main(String[] args) {
        int n = 3;

        String[] consonants = new String[]{"b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "z"};
        String[] vowels = new String[]{"a", "e", "i", "o", "u"};

        if (n == 1) {
            iterate(consonants);
            iterate(vowels);
        }
        
        if (n == 2) {
            iterate(consonants, vowels);
            iterate(vowels, consonants);
        }

        if (n == 3) {
            iterate(consonants, vowels, consonants);
            iterate(vowels, consonants, vowels);
        }

        if (n == 4) {
            iterate(consonants, vowels, consonants, vowels);
            iterate(vowels, consonants, vowels, consonants);
        }

        if (n == 5) {
            iterate(consonants, vowels, consonants, vowels, consonants);
            iterate(vowels, consonants, vowels, consonants, vowels);
        }

        if (n == 6) {
            iterate(consonants, vowels, consonants, vowels, consonants, vowels);
            iterate(vowels, consonants, vowels, consonants, vowels, consonants);
        }

    }

    private static void iterate(String[] type1, String[] type2, String[] type3, String[] type4, String[] type5, String[] type6) {
        for (int a = 0; a < type1.length; a++) {
            for (int b = 0; b < type2.length; b++) {
                for (int c = 0; c < type3.length; c++) {
                    for (int d = 0; d < type4.length; d++) {
                        for (int e = 0; e < type5.length; e++) {
                            for (int f = 0; f < type6.length; f++) {
                                System.out.println(type1[a] + type2[b] + type3[c] + type4[d] + type5[e] + type6[f]);
                            }
                        }
                    }
                }
            }
        }
    }
    
    private static void iterate(String[] type1, String[] type2, String[] type3, String[] type4, String[] type5) {
        for (int a = 0; a < type1.length; a++) {
            for (int b = 0; b < type2.length; b++) {
                for (int c = 0; c < type3.length; c++) {
                    for (int d = 0; d < type4.length; d++) {
                        for (int e = 0; e < type5.length; e++) {
                            System.out.println(type1[a] + type2[b] + type3[c] + type4[d] + type5[e]);
                        }
                    }
                }
            }
        }
    }
    
    private static void iterate(String[] type1, String[] type2, String[] type3, String[] type4) {
        for (int a = 0; a < type1.length; a++) {
            for (int b = 0; b < type2.length; b++) {
                for (int c = 0; c < type3.length; c++) {
                    for (int d = 0; d < type4.length; d++) {
                        System.out.println(type1[a] + type2[b] + type3[c] + type4[d]);
                    }
                }
            }
        }
    }
    
    private static void iterate(String[] type1, String[] type2, String[] type3) {
        for (int a = 0; a < type1.length; a++) {
            for (int b = 0; b < type2.length; b++) {
                for (int c = 0; c < type3.length; c++) {
                    System.out.println(type1[a] + type2[b] + type3[c]);
                }
            }
        }
    }
    
    private static void iterate(String[] type1, String[] type2) {
        for (int a = 0; a < type1.length; a++) {
            for (int b = 0; b < type2.length; b++) {
                System.out.println(type1[a] + type2[b]);
            }
        }
    }
    
    private static void iterate(String[] type) {
        for (int a = 0; a < type.length; a++) {
            System.out.println(type[a]);
        }
    }

}

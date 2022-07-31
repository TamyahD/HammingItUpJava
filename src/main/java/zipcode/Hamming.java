package zipcode;

public class Hamming {
    String s;
    String s1;
    public Hamming(String s, String s1) {
        this.s=s;
        this.s1=s1;
        IllegalArgumentException iae = new IllegalArgumentException(
                "leftStrand and rightStrand must be of equal length.");

        if (s.length() != s1.length()) {
            throw iae;
        }
    }

    public int getHammingDistance() {
        int counter=0;
        for (int idx=0; idx<s.length(); idx++) {
            if (s.charAt(idx) != s1.charAt(idx)) {
                counter++;
            }
        }
        return counter;
    }
}

package it.develhope.ifstatement;
public class Start {
    public static void main(String[] args) {

        String mySurname = "Rumore";
        String result = mySurname.contains("ni") ? "contains" : "doesn't contains";
        System.out.println("Your surname " + result + " the sequence of letters 'ni'");
    }
}



package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        int ch = symbol;
        if((65 <= ch && ch <= 90) || (97 <= ch && ch <= 122)) { 
            if(character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' || character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U'){
                System.out.println("Vowel");
            } else { 
                System.out.println("Consonant");
            }
        } else {    
            System.out.println("wrong alphabet!");
        }
      
    }
}

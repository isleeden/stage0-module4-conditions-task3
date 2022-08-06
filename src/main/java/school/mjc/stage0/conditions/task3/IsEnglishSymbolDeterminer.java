package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        int ch = symbol;
        if((65 <= ch && ch <= 90) || (97 <= ch && ch <= 122)) { 
            System.out.println("English");
        } else {    
            System.out.println("Non English");
        }
    }
}

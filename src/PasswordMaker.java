// Exercise 3 
// AM: 3212018232 Name: Τσουκαλάς Δημήτριος

public class PasswordMaker {
    private final int numOfCharacters;
    private final int numOfPasswords;

    public PasswordMaker(int numOfCharacters, int numOfPasswords) {
        if (numOfCharacters <= 3) {
            System.out.println("Password is too small you need 4 characters or higher!!");
            System.exit(0);
        }
        if(numOfPasswords < 0) {
            System.out.println("Invalid Input!!");
            System.exit(0);
        }
        this.numOfCharacters = numOfCharacters;
        this.numOfPasswords = numOfPasswords;
    }
    /*
        Make an array with all capital letters
    */
    private char[] getAllCapital(){
        char[] arr = new char[26];

        int j = 0;
        for(char i = 'A'; i <= 'Z'; i++) {
            arr[j] = i;
            j++;
        }
        return arr;
    }
    /*
        Make an array with all non-capital letters
    */
    private char[] getAllLetter(){
        char[] arr = new char[26];

        int j = 0;
        for(char i = 'a'; i <= 'z'; i++) {
            arr[j] = i;
            j++;
        }
        return arr;
    }
    /*
        Make an array with all numbers
    */
    private int[] getAllNumber(){
        int[] arr = new int[10];
        for(int i = 0; i < 10; i++) {
            arr[i] = i;
        }
        return arr;
    }
    /*
        Make an array with all special symbols
    */
    private char[] getAllSpecialSymbols(){
        char[] arr = new char[5];

        arr[0] = '!';
        arr[1] = '#';
        arr[2] = '$';
        arr[3] = '@';
        arr[4] = '%';

        return arr;
    }
    /*
    Function to create a StringBuffer and add random characters
    until is full
    */
    private StringBuffer createRandomBuff() {
        char[] capitals = getAllCapital();
        char[] letters = getAllLetter();
        int[] numbers = getAllNumber();
        char[] special = getAllSpecialSymbols();

        StringBuffer buffer = new StringBuffer(numOfCharacters);
        int chooser = 0;
        
        /* it goes from all the cases so we add the correct values
           for our password
        */
        for(int i = 0; i <= numOfCharacters; i++) {
            switch (chooser) {
                case 0:
                    buffer.append(capitals[randomNum(0, 25)]);
                    break;
                case 1:
                    buffer.append(letters[randomNum(0, 25)]);
                    break;
                case 2:
                    buffer.append(special[randomNum(0, 4)]);
                    break;
                case 3:
                    buffer.append(numbers[randomNum(0, 9)]);
                    break;
                default:
                    chooser=0;
                    break;
            }
            chooser++;
        }

        return passwdMixer(buffer);

    }
    
    // Function to mix the values at our password
    private StringBuffer passwdMixer(StringBuffer b) {

        int exp = randomNum(0,3);
        switch (exp) {
            case 0:
                b.replace(0, b.length(), b.substring(b.length()/2, b.length())+ b.substring(0, b.length()/2));
                b.reverse();
                break;
            case 1:
                b.replace(0, b.length(), b.substring(b.length()/2, b.length())+ b.substring(0, b.length()/2));
                break;
            case 2:
                b.replace(0,1, b.substring(0, 1));
                b.reverse();
                break;
            case 3:
                break;
        }
        return b;
    }
/*
    This Function is for print the passwords and we call it from Main 
    */
    public void passwdLoop() {
        int passwdCounter=0;
        for(int i = 0; i < numOfPasswords; i++){
            passwdCounter++;
            System.out.print(createRandomBuff().toString() + " ");
            if (passwdCounter > 7) {
                System.out.println();
                passwdCounter=0;
            }
        }
    }
//  random number generator
    private int randomNum(int min, int max) {
        int n=(int)Math.floor(Math.random()*(max-min+1)+min);
        return n;
    }

}

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

    }
        public static int findShort(String s) {
        String [] words = s.split(" ");
        int shortestLength = Integer.MAX_VALUE;
            for (String word: words) {
                int wordLength = word.length();;
                if (wordLength <shortestLength){
                    shortestLength=wordLength;

            }

            }



return shortestLength;
        }





    }

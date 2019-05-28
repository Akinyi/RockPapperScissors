import java.util.ArrayList;
import java.util.Random;

/*
Franco and Giovani play Rock, Papper, Scissors.
score is 2 for a win (Rock beats scissors, papper beats rock, scissors beats papper
Score is 1 for a draw (Rock & Rock, Scissors & Scissors, Papper & papper)
Score is 0 for a loss
Franco intends on using the same gesture everytime
What is the max score he can get?
 */

public class Main {

    public Main(){ }

    public static void main(String[] args) {
        Main main  = new Main();
        try {
            ArrayList<String> sequence = giovanisSequence();
            System.out.println("Franco's score using Scissors and Giovanis Array Sequence : " + scoreBasedOnFrancosScissors(sequence));

            System.out.println("Franco's score using winning strategy each time: " + francosMaxScore(sequence));

            System.out.println("Francos score using winning gesture and giovanis string sequence: " + scoreBasedOnFrancosGesture(giovaniSequence(5)));
            }catch(Exception e){
            System.out.println(e.getLocalizedMessage());
            }
        }

    public static ArrayList<String> giovanisSequence() {
        ArrayList<String> sequence = new ArrayList<>();
        int counter = 1;
        boolean repeat = true;
        while (repeat) {
            if (counter < 4) {
                sequence.add(randomItem());
                counter++;
            } else
                repeat = false;
            }
            return sequence;
    }

    public static String giovaniSequence(int n){
        String seq = "";
        int counter = 1;
        boolean repeat = true;
        while (repeat) {
            if (counter <= n) {
                seq += randomItem();
                counter++;
            } else
                repeat = false;
        }
        return seq;

    }
    public static String randomItem(){
        Random item = new Random();
        int randomItem = 0;
        String item2 = "";
        for(int i = 1; i<= 3; i++)
            randomItem = item.nextInt(3)+1;
        switch(randomItem){
            case 1: item2 = "P";
                break;
            case 2: item2 = "S";
                break;
            case 3: item2 = "R";
                break;
        }
        return item2;
    }

    public static Integer scoreBasedOnFrancosScissors(ArrayList<String> sequence){
          int score = 0;
          int add;
          for(int i = 0; i<sequence.size(); i++){
                if(sequence.get(i).equals("S")){
                    add = 1;
                    score += add;
                }
                else if(sequence.get(i).equals("R")){
                    add = 0;
                    score += add;
                }
                else if(sequence.get(i).equals("P")){
                    add = 2;
                    score += add;
                }
            }
            return score;
    }
    public static Integer scoreBasedOnFrancosGesture(String sequence){
        int score = 0;
        int add;
        for(int i = 0; i<sequence.length(); i++){
            if((sequence.charAt(i)+"").equals("S")){
                add = 2;
                score += add;
            }
            else if((sequence.charAt(i)+"").equals("R")){
                add = 2;
                score += add;
            }
            else if((sequence.charAt(i)+"").equals("P")){
                add = 2;
                score += add;
            }
        }
        return score;
    }
    public static Integer francosMaxScore(ArrayList<String> sequence){
        int score = 0;
        int add;
        for(int i = 0; i<sequence.size(); i++){
            if(sequence.get(i).equals("S")){
                add = 2;
                score += add;
            }
            else if(sequence.get(i).equals("R")){
                add = 2;
                score += add;
            }
            else if(sequence.get(i).equals("P")){
                add = 2;
                score += add;
            }
        }
        return score;
    }

}

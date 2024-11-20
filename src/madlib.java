import org.w3c.dom.ls.LSOutput;

public class madlib {

    String classmate1;
    String classmate2;
    String place;
    String noun;
    String adjective;
    String pet;
    int number1;
    int number2;
    int number3;


    public static void main(String[] args) {

        madlib mystory = new madlib("jack", "john", "boston", "cool", "dog", 1, 20, 50);

    }

    public madlib(String sclassmate1, String sclassmate2, String splace, String sadjective, String spet, int snumber1,
        int snumber2, int snumber3 ){
            String story = "this weekend i'm going to " + sclassmate1 + " house. afterwards i'm going with " + sclassmate2 + " to " + splace + ". it's going to be so " + sadjective + ". " + sclassmate2 + " has a " + spet + ". on a scale of " + snumber1 + " to " + snumber2 + " it was about a " + snumber3+".";
            classmate1 = sclassmate1;
            classmate2 = sclassmate2;
            place = splace;
            adjective = sadjective;
            pet = spet;
            number1 = snumber1;
            number2 = snumber2;
            number3 = snumber3;
        System.out.println(story);


        }
}


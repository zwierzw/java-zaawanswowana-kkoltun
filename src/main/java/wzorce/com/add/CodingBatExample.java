package wzorce.com.add;

public class CodingBatExample {


//    Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
//
//
//    helloName("Bob") → "Hello Bob!"
//    helloName("Alice") → "Hello Alice!"
//    helloName("X") → "Hello X!"


    public static String helloName(String name){
        return "Hello " + name + "!";
    }

    public static void main(String[] args) {
        System.out.println(helloName("Bob"));
    }


}

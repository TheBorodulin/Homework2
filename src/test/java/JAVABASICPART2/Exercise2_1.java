package JAVABASICPART2;

public class Exercise2_1 {
    public static void main(String[] args)
    {
        String str1 = "PHP Exercises and ";
        String str2 = "Python Exercises";
        String concat = str1 + str2;
//        concat.
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        String str3 = str1.concat(str2);

        System.out.println("The concatenated string: " + str3);

    }


}



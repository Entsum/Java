package ReviewStringMethods;

public class reviewStringMethods {
    public static void main(String[] args) {
        String str ="hello";

       //toUppercase or toLowercase
        str.toUpperCase();
        System.out.println(str); //hello

        System.out.println("----------------------------------------------------");

        str=str.toUpperCase();
        System.out.println(str); //HELLO

        //length()  -> gives size
        int size =str.length();
        System.out.println(size); //5

        //charAt()  -> Returns char value at the specific index
        char letter = str.charAt(4);
        System.out.println(letter); //O

        //how to get last character
        char lastCharacter=str.charAt(str.length()-1);
        System.out.println(lastCharacter);// O

        //indexOf -> Returns the index within this string of the first occurrence of the specified character.
        int index = str.indexOf(lastCharacter);
        System.out.println(index); //4

        System.out.println(str.indexOf('a'));//-1
        System.out.println(str);

        //isEmpty() -> returns true if length is more than 0
        boolean empty =str.isEmpty();
        System.out.println(empty);

        //trim();

        //substring
        String str1 ="Hello Class";
        String part2=str1.substring(6);
        System.out.println(part2);

        String part1=str1.substring(0,5);
        System.out.println(part1);

        //concat
        String newString=part1.concat(part2);
        System.out.println(newString);

        System.out.println(part1+" "+part2);

        //concat examples

        //newString.substring(6).charAt(0);
        //System.out.println(single);

       // newString.charAt(0).substring(6);newString.substring(6).charAt(0);
        //System.out.println(single);

       // newString.charAt(0).substring(6); CE

        //replace(); Returns a string resulting from replacing all occurrences of oldChar in this string with newChar
        String myString="today is september";

       myString= myString.replace("september","october");
        System.out.println(myString);

        myString=myString.replace('t','T'); //does not replace if not found
        System.out.println(myString);

        //split();
        String myStr="today is a review class";

        String[] array=myStr.split(" ");
        System.out.println(array.length);//5
        System.out.println(array[3]);//review

        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }

        //other way
        for (String arr:array){
            System.out.println(arr);
        }







    }
}

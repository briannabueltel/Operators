
/**
 * Write a description of class RenameThisClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RenameThisClass
{
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int i = 10;
        double f = i+2.5;
        f = i+f;
        boolean flag = true;
        flag = !flag;
        i++;
        System.out.println(i);
        System.out.println(f);
        System.out.println(flag);
        String string1 = "I am a string";
        String string2 = string1;
        String string3 = "I am also a string";
        boolean stringsEqual = string1.equals(string3);
        String[] strArray = {"Alpha","Bravo","Charlie","Delta","Echo"}; 
        
        for (i=0; i < strArray.length; i++) {
            System.out.println(strArray[i]); 
        }
        for (String value : strArray) {
            System.out.print(value);
        }
        System.out.println();
        for (i = 0; i < strArray.length; i++) {
            System.out.print(strArray[i] + "-"); 
        }
    }
}

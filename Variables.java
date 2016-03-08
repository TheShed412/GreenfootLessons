import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Variables here.
 * 
 * @author Tyler Bobik
 * @version 1.0.0
 */
public class Variables extends Actor
{
    /**
     * Act - do whatever the Variables wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int wholeNum = 8;
    private double decimalNum = 8.000;
    private double anotherDecimalNum = 8.001;
    private float alsoDecimalNum = 8.001f; //floats are "smaller" than doubles. By "smaller" we mean that they use less memory.
    private char aChar = 'a';
    private char anotherChar = '3';
    private char theSame = 'a';
    //private char thisWillBreakWhenWeCompile = 'ak';
    private String aString = "ak";
    private String anotherString = "stuff";
    
    public void act() 
    {
        //wholeNum = wholeNum + 1;
        //wholeNum += 1;
        //The lines above do the same thing as the one below. 
        /*
        wholeNum++;
        
        decimalNum++;
        anotherDecimalNum ++;
        alsoDecimalNum ++;
        */
        
        //System.out.println(wholeNum);
        //System.out.println(decimalNum);
        //System.out.println(anotherDecimalNum);
        //System.out.println(alsoDecimalNum);
        
        //int newNum;
        //double newDecimalNum;
        
        //newNum = wholeNum + decimalNum; //This line won't work
        //newDecimalNum = wholeNum + decimalNum;
        //System.out.println("newDecimalNum = wholeNum + decimalNum: "+newDecimalNum);
        
        //newDecimalNum = wholeNum + anotherDecimalNum;
        //System.out.println("newDecimalNum = wholeNum + anotherDecimalNum: "+newDecimalNum);
        
        //Comparing these variables
        
        if (wholeNum == decimalNum){
            System.out.println("wholeNum equals decimalNum!");
        }else{
            System.out.println("wholeNum does not equal decimalNum!");
        }//Which will this print?
        
        if (wholeNum == anotherDecimalNum){
            System.out.println("wholeNum equals anotherDecimalNum!");
        }else{
            System.out.println("wholeNum does not equal anotherDecimalNum!");
        }//Which will this print
        
        if (aChar == anotherChar){
            System.out.println("aChar and anotherChar are the same!");
        }else{
            System.out.println("aChar and anotherChar are not the same!");
        }//Which will be printed
        
        if (aChar == theSame){
            System.out.println("aChar and theSame are the same!");
        }else{
            System.out.println("aChar and theSame are not the same!");
        }//Which will be printed
        
        //This is the part that gets a little freaky! Hold on to your hats!
        
        String newString = new String("ak"); //This is another way to make string variables
        
        System.out.println("aString is " + aString);
        System.out.println("newString is " + newString);
        
        if (aString == newString){
            System.out.println("aString and newString are the same!");
        }else{
            System.out.println("aString and newString are not the same!");
        }
        
        if (aString.equals(newString)){
            System.out.println("aString and newString are the same! (with .equals())");
        }else{
            System.out.println("aString and newString are not the same! (with .equals())");
        }
        //Note: I will bring up the thing with the Strings if the question is asked. But .equals() should ALWAYS be used to compare strings, regardless. 
        
    }    
}

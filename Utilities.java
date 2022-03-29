/**
 * This class contains some utilities needed by developers
 */
public class Utilities{
    /**
     * Calculates the sum of all the numbers given
     * @param numbers an array of numbers of any size, may not be null
     * @return the sum of all its numbers, not protected against overflow
     */
    public long add(long... numbers){
       long sum=0;
       for(long nr:numbers){
           sum+=nr;
       }
       return sum;
    }
    /**
     * Checks whether the dividend could be divided by the divisor without remaining fraction
     * @param dividend any number to be divided
     * @param divisor a number not equal to zero
     * @return true if {@code dividend} can be divided by {@code divisor},
     *         false if not or divisor is zero
     */
    public boolean isDivisibleBy(long dividend,long divisor){
        if(divisor==0)return false;
        return dividend % divisor==0;
    }
    /**
     * Concatenates the given string {@code numberRepeats} times to create repeated a string
     * @param toRepeat any string sequence to repeat, may not be null
     * @param numberRepeats a positive number describing how often to repeat
     * @return a new string that repeats {@code toRepeat} {@code numberRepeats} times,
     *         will return an empty string if {@code numberRepeats} is non-positive
     */
    public String repeatString(String toRepeat,int numberRepeats){
        if(numberRepeats<1)return "";
        String result="";
        for(int i=0;i<numberRepeats;i++){
            result+=toRepeat;
        }
        return result;
    }
    public void method1(){}
public void method2(){}
public void method3(){}
public void method4(){}
public void method5(){}
public void method6(){}
public void method7(){}
public void method8(){}
public void method9(){}
public void method10(){}
public void method11(){}
public void method12(){}
public void method13(){}
public void method14(){}
public void method15(){}
public void method16(){}
public void method17(){}
public void method18(){}
public void method19(){}
public void method20(){}
public void method21(){}
public void method22(){}
public void method23(){}
public void method24(){}
public void method25(){}
public void method26(){}
public void method27(){}
public void method28(){}
public void method29(){}
public void method30(){}

}
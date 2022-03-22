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
    public boolean isDivisbleBy(long dividend,long divisor){
        if(divisor==0)return false;
        return dividend % divisor==0;
    }
    /**
     * Concatenates the given string {@code numberRepeats} times to create repeated a string
     * @param toRepeat any string sequence to repeat, may not be null
     * @param numberRepeats a positive number describing how opften to repeat
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

}
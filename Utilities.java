
public class Utilities{

    public long add(long... numbers){
       long sum=0;
       for(long nr:numbers){
           sum+=nr;
       }
       return sum;
    }

    public boolean isDivisbleBy(long dividend,long divisor){
        if(divisor==0)return false;
        return dividend % divisor==0;
    }

    public String repeatString(String toRepeat,int numberRepeats){
        if(numberRepeats<1)return "";
        String result="";
        for(int i=0;i<numberRepeats;i++){
            result+=toRepeat;
        }
        return result;
    }

}
public class HighandLow {
    public static void main(String[] args) {
        int [] numbers={2,6,20,12,17,0};
        int highest=numbers[0];
        for(int i=1;i<numbers.length;i++)
        {
            if(numbers[i]>highest)
            {
                highest=numbers[i];
            }
         }
        System.out.println(highest);

        int lowest=numbers[0];
        for (int i=1;i<numbers.length;i++)
        {
            if(numbers[i]<lowest)
            
                lowest=numbers[i];
            
        }
        System.out.println(lowest);
    }     
}
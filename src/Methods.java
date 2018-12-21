public class Methods {
    public static void main(String[] args) {
        System.out.println("This is a void method");


        //A value returning method not only performs a task,
        //but also sends a value back to the code that called it

        //int number= Integer.parseInt("700");
        printAverage(20, 30);
        double average=getAverage(20, 30);
        System.out.println(average);

    }
    
    public static void printAverage(int val1,int val2)
    {
        double average = (val1+val2) / 2.0;
        System.out.println("average: "+ average);
    }

    public static double getAverage(int val1,int val2)
    {
        double average =(val1+val2)  /2.0;
        return average;
    }
}
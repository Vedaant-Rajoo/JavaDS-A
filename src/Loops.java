

public class Loops {
    public static void main(String[] args) {
       
       
       //while loop
        int x=0; //loop control variable
        while(x<5){    //pre-test loop
            System.out.println("hello World");
            x+=1;
        }
        
        System.out.println(" ");
        
        
        //do-while loop


        int y=0; //loop control variable
        do{           
            System.out.println("hello world");
            y++;
        }while(y<5);     //post-test loop


        // the for loop

        System.out.println("");

        for (int z = 0; z<5; z++)    //counting variable
        {
            System.out.println("hello world!!!!");
        }

        System.exit(0);
    }

}
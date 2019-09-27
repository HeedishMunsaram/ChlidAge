import java.util.Scanner;
/**
 * 
 */

/**
 * @author Andish
 *
 */
public class LAD1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner Keyboard = new Scanner(System.in);
        		 
         int count0 = 0;
         int count1 = 0;
         int count2 = 0;
         int count3 = 0;
         int count4 = 0;
         int count5 = 0;
         int count6 = 0;
         int count7 = 0;
         int count8 = 0;
         int count9 = 0;
         int count10 = 0;
         
         int i = 0;
         int age [];
         age = new int[30];
         
         for (i = 0; i < 30; i++){
         
         	System.out.print("Please enter the age of the child" + (i+1) + ": ");
         	age[i] = Keyboard.nextInt();
         	
         	if (age[i] == 0)
         		{
         			count0++;
         		}
         	if (age[i] == 1)
         		{
         			count1++;
         		}	
         	if (age[i] == 2)
         		{
         			count2++;
         		}
         	if (age[i] == 3)
         		{
         			count3++;
         		}	
         	if (age[i] == 4)
         		{
         			count4++;
         		}	
         	if (age[i] == 5)
         		{
         			count5++;
         		}
         	if (age[i] == 6)
         		{
         			count6++;
         		}
         	if (age[i] == 7)
         		{
         			count7++;
         		}	
         	if (age[i] == 8)
         		{
         			count8++;
         		}	
         	if (age[i] == 9)
         		{
         			count9++;
         		}
         	if (age[i] == 10)
         		{
         			count10++;
         		} 	
         }		
         System.out.println("The number of children who are 0 year old are "+ count0);
         System.out.println("The number of children who are 1 year old are "+ count1);
         System.out.println("The number of children who are 2 years old are "+ count2);
         System.out.println("The number of children who are 3 years old are "+ count3);
         System.out.println("The number of children who are 4 years old are "+ count4);
         System.out.println("The number of children who are 5 years old are "+ count5);
         System.out.println("The number of children who are 6 years old are "+ count6);
         System.out.println("The number of children who are 7 years old are "+ count7);
         System.out.println("The number of children who are 8 years old are "+ count8);
         System.out.println("The number of children who are 9 years old are "+ count9);
         System.out.println("The number of children who are 10 years old are "+ count10);
	
    Keyboard.close();
	}
	
}

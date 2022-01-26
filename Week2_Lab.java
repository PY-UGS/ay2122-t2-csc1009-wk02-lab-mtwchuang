package Labs;
import java.util.Scanner;
public class Week2_Lab
{
    // Scanner input = new Scanner(System.in);
    public void Question01()
    {
        final double PI = 3.14159;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for radius: ");
        float radius = input.nextFloat();
        double area = radius * radius * PI;
        System.out.println("The area for the circle of radius "+radius+" is "+area);
        // input.close();
    }
    public void Question02()
    {
        System.out.print("Enter three numbers: ");
        String strinput = "";
        int inputcounter = 0;
        float[] floatarray = new float[3];
        Scanner input = new Scanner(System.in);
        while(inputcounter < floatarray.length)
        {
            strinput = input.nextLine();
            String[] tempstring = strinput.split("\\s",3);
            for(int i = 0; i < tempstring.length; i++)
            {
                floatarray[i+inputcounter] = Float.parseFloat(tempstring[i]);
            }
            inputcounter+=tempstring.length;
        }
        // input.close();
        float total = 0, average = 0;
        for(int i = 0; i < floatarray.length;i++)
        {
            total+=floatarray[i];
        }
        average = total/floatarray.length;
        System.out.println("The average of "+floatarray[0]+" "+floatarray[1]+" "+floatarray[2]+" is "+average);
    }
    public void Question03()
    {
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds/1000, currentSecond = totalSeconds%60;
        long totalMinutes = totalSeconds/60, currentMinutes = totalMinutes%60;
        long totalHours = totalMinutes/60, currentHours = totalHours%24;
        System.out.format("Current time is %d:%d:%d GMT\n",currentHours,currentMinutes,currentSecond);
    }
    public void Question04()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter in a year: ");
        int inputyear = input.nextInt();
        int zodiac = inputyear%12;
        switch(zodiac)
        {
            case 0:
            {
                System.out.println("monkey");
                break;
            }
            case 1:
            {
                System.out.println("rooster");
                break;
            }
            case 2:
            {
                System.out.println("dog");
                break;
            }
            case 3:
            {
                System.out.println("pig");
                break;
            }
            case 4:
            {
                System.out.println("rat");
                break;
            }
            case 5:
            {
                System.out.println("ox");
                break;
            }
            case 6:
            {
                System.out.println("tiger");
                break;
            }
            case 7:
            {
                System.out.println("rabbit");
                break;
            }
            case 8:
            {
                System.out.println("dragon");
                break;
            }
            case 9:
            {
                System.out.println("snake");
                break;
            }
            case 10:
            {
                System.out.println("horse");
                break;
            }
            case 11:
            {
                System.out.println("sheep");
                break;
            }
        }
        input.close();
    }
    public static void main(String args[])
    {
        Week2_Lab week02 = new Week2_Lab();
        week02.Question01();
        week02.Question02();
        week02.Question03();
        week02.Question04();      
    }
}

/*
This problem is know as Clock angle problem where we need to find angle between hands of an analog clock at a given time.
public Double findAngle(Integer hour, Integer minute)
Example 1	
Time : 12:45	
Input : hour = 12, Minute = 45	
Output : 112.5°	
Example 2
Time : 3:30
Input : hour = 3, Minute = 30
Output : 75°
*/

import java.util.*;

public class ClockAngle
{
    public static double findAngle(int hour, int minute)
    {
        double minutesDegree = 6.0 * minute;
        double hoursDegree = ((60 * hour) + minute) / 2.0;

        double angle = Math.abs(minutesDegree - hoursDegree);

        return angle;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter time in 12 hours format");

        String time = sc.nextLine();
        String[] properTime = time.split(":",time.length());
        int[] hourMinute = new int[2];

        hourMinute[0] = Integer.parseInt(properTime[0]);
        hourMinute[1] = Integer.parseInt(properTime[1]);

        System.out.println("Hour: "+hourMinute[0]);
        System.out.println("Minute: "+hourMinute[1]);

        System.out.println("Required angle is "+ClockAngle.findAngle(hourMinute[0],hourMinute[1])+"\u00B0");

        sc.close();
    }
}

/*
Output:
Enter time in 12 hours format
12:45
Required angle is 112.5°
Enter time in 12 hours format
4:20
Hour: 4   
Minute: 20
Required angle is 10.0°
Enter time in 12 hours format
4:21
Hour: 4   
Minute: 21
Required angle is 4.5°
*/
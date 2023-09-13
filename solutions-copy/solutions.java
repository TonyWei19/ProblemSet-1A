
/**
 * Write a description of class solutions here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class solutions
{
 
  
  public void celsiusToFahrenheit(){
       
       double celsius = 30.0;
       double fahrenheit = 0.0;
      fahrenheit = celsius * 9.0/5.0 + 32;
      System.out.println(celsius + "°C " + "= " + fahrenheit + "°F");
      
    }
    
    public void elapsedTime(){
        int hour = 10;
        int min = 36;
        int second = 0;
        int secsMidnight = 0;
        int secsLeft = 0;
        double percentLeft = 0.0;
        
        System.out.println("Current time is " + hour + ":" + min + ":" + second);
        secsMidnight = hour * 3600 + min * 60 + second;
        System.out.println("It has been " + secsMidnight + " since the day began");
        secsLeft = 24 * 3600 - secsMidnight;
        System.out.println("There are " + secsLeft + " seconds left in the day");
        percentLeft = (double)secsMidnight/86400 * 100;
        System.out.println("The day is " + percentLeft + "% done");
        
    }
    
    public void secondsToHMS(){
        
        final int lockSeconds = 7000;
        int seconds = 7000;
        int hour = 0;
        int mins = 0;
        hour = seconds / 3600;
        mins = seconds % 3600/60;
        seconds = 7000 - hour*3600 - mins*60;
        
        System.out.println(lockSeconds + " seconds = " + hour + " hours," + mins + " minutes," + seconds + " seconds");
        
        
        
        
        
    }
    
}

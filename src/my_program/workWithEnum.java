package my_program;

import java.util.Scanner;

public class workWithEnum {
    Scanner scanner = new Scanner(System.in);
    Month month;
    Season season;
    int enteredMonth;
    enum Month {
        January,
        February,
        March,
        April,
        May,
        June,
        July,
        August,
        September,
        October,
        November,
        December;
    }
    enum Season {
        Winter,
        Spring,
        Summer,
        Autumn;
    }
    public void findMonthByHisNumber()
    {
        System.out.print("Enter number from 1 to 12: ");
        enteredMonth = scanner.nextInt();
        switch(enteredMonth)
        {
            case 1: {
                month = Month.January;
                System.out.println(month);
                break;
            }
            case 2: {
                month = Month.February;
                System.out.println(month);
                break;
            }
            case 3: {
                month = Month.March;
                System.out.println(month);
                break;
            }
            case 4: {
                month = Month.April;
                System.out.println(month);
                break;
            }
            case 5: {
                month = Month.May;
                System.out.println(month);
                break;
            }
            case 6: {
                month = Month.June;
                System.out.println(month);
                break;
            }
            case 7: {
                month = Month.July;
                System.out.println(month);
                break;
            }
            case 8: {
                month = Month.August;
                System.out.println(month);
                break;
            }
            case 9: {
                month = Month.September;
                System.out.println(month);
                break;
            }
            case 10: {
                month = Month.October;
                System.out.println(month);
                break;
            }
            case 11: {
                month = Month.November;
                System.out.println(month);
                break;
            }
            case 12: {
                month = Month.December;
                System.out.println(month);
                break;
            }
            default:
            {
                System.out.println("Wrong operation!");
                findMonthByHisNumber();
            }
        }
    }
    public void findSeasonOfTheMonth()
    {
        System.out.print("Season: ");
        if(enteredMonth == 1 || enteredMonth ==2 || enteredMonth ==12)
        {
            season = Season.Winter;
            System.out.println(season);
        }
        else if(enteredMonth>2 && enteredMonth <6)
        {
            season = Season.Spring;
            System.out.println(season);
        }
        else if(enteredMonth>=6 && enteredMonth<9)
        {
            season = Season.Summer;
            System.out.println(season);
        }
        else if(enteredMonth>=9 && enteredMonth<12)
        {
            season = Season.Autumn;
            System.out.println(season);
        }
    }
}

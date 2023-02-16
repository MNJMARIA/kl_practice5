package my_program;

import java.util.Scanner;

public class workWithEnum {
    Scanner scanner = new Scanner(System.in);
    Months month;
    Seasons season;
    int enteredMonth;
    enum Months {
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
    enum Seasons {
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
                month = Months.January;
                System.out.println(month);
                break;
            }
            case 2: {
                month = Months.February;
                System.out.println(month);
                break;
            }
            case 3: {
                month = Months.March;
                System.out.println(month);
                break;
            }
            case 4: {
                month = Months.April;
                System.out.println(month);
                break;
            }
            case 5: {
                month = Months.May;
                System.out.println(month);
                break;
            }
            case 6: {
                month = Months.June;
                System.out.println(month);
                break;
            }
            case 7: {
                month = Months.July;
                System.out.println(month);
                break;
            }
            case 8: {
                month = Months.August;
                System.out.println(month);
                break;
            }
            case 9: {
                month = Months.September;
                System.out.println(month);
                break;
            }
            case 10: {
                month = Months.October;
                System.out.println(month);
                break;
            }
            case 11: {
                month = Months.November;
                System.out.println(month);
                break;
            }
            case 12: {
                month = Months.December;
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
            season = Seasons.Winter;
            System.out.println(season);
        }
        else if(enteredMonth>2 && enteredMonth <6)
        {
            season = Seasons.Spring;
            System.out.println(season);
        }
        else if(enteredMonth>=6 && enteredMonth<9)
        {
            season = Seasons.Summer;
            System.out.println(season);
        }
        else if(enteredMonth>=9 && enteredMonth<12)
        {
            season = Seasons.Autumn;
            System.out.println(season);
        }
    }
}

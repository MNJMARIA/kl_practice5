package my_program;

import java.util.Scanner;

public class workWithEnum {
    Scanner scanner = new Scanner(System.in);

    private Enums.Month month;
    private Enums.Season season;
    private int enteredMonth;

    public void findMonthByHisNumber()
    {
        System.out.print("Enter number from 1 to 12: ");
        enteredMonth = scanner.nextInt();
        switch(enteredMonth)
        {
            case 1: {
                month = Enums.Month.January;
                System.out.println(month);
                break;
            }
            case 2: {
                month = Enums.Month.February;
                System.out.println(month);
                break;
            }
            case 3: {
                month = Enums.Month.March;
                System.out.println(month);
                break;
            }
            case 4: {
                month = Enums.Month.April;
                System.out.println(month);
                break;
            }
            case 5: {
                month = Enums.Month.May;
                System.out.println(month);
                break;
            }
            case 6: {
                month = Enums.Month.June;
                System.out.println(month);
                break;
            }
            case 7: {
                month = Enums.Month.July;
                System.out.println(month);
                break;
            }
            case 8: {
                month = Enums.Month.August;
                System.out.println(month);
                break;
            }
            case 9: {
                month = Enums.Month.September;
                System.out.println(month);
                break;
            }
            case 10: {
                month = Enums.Month.October;
                System.out.println(month);
                break;
            }
            case 11: {
                month = Enums.Month.November;
                System.out.println(month);
                break;
            }
            case 12: {
                month = Enums.Month.December;
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
            season = Enums.Season.Winter;
            System.out.println(season);
        }
        else if(enteredMonth>2 && enteredMonth <6)
        {
            season = Enums.Season.Spring;
            System.out.println(season);
        }
        else if(enteredMonth>=6 && enteredMonth<9)
        {
            season = Enums.Season.Summer;
            System.out.println(season);
        }
        else if(enteredMonth>=9 && enteredMonth<12)
        {
            season = Enums.Season.Autumn;
            System.out.println(season);
        }
    }
}

package my_program;

import java.util.Scanner;

public class workWithEnum {
    Scanner scanner = new Scanner(System.in);
    private Enums.Month month;
    private Enums.Season season;
    private int enteredMonth;
    private String enteredLanguage;

    public void findMonthByHisNumber()
    {
        System.out.print("Enter number from 1 to 12: ");
        enteredMonth = scanner.nextInt();
        switch(enteredMonth)
        {
            case 1: {
                month = Enums.Month.January;
                break;
            }
            case 2: {
                month = Enums.Month.February;
                break;
            }
            case 3: {
                month = Enums.Month.March;
                break;
            }
            case 4: {
                month = Enums.Month.April;
                break;
            }
            case 5: {
                month = Enums.Month.May;
                break;
            }
            case 6: {
                month = Enums.Month.June;
                break;
            }
            case 7: {
                month = Enums.Month.July;
                break;
            }
            case 8: {
                month = Enums.Month.August;
                break;
            }
            case 9: {
                month = Enums.Month.September;
                break;
            }
            case 10: {
                month = Enums.Month.October;
                break;
            }
            case 11: {
                month = Enums.Month.November;
                break;
            }
            case 12: {
                month = Enums.Month.December;
                break;
            }
            default:
            {
                System.out.println("Wrong entered month!");
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
        }
        else if(enteredMonth>2 && enteredMonth <6)
        {
            season = Enums.Season.Spring;
        }
        else if(enteredMonth>=6 && enteredMonth<9)
        {
            season = Enums.Season.Summer;
        }
        else if(enteredMonth>=9 && enteredMonth<12)
        {
            season = Enums.Season.Autumn;
        }
    }

    public void showEngOrUa()
    {
        System.out.print("Choose language - ua or eng: ");
        enteredLanguage = scanner.next();
        if(enteredLanguage.equals("ua"))
        {
            System.out.println(month.getUa());
            System.out.println(season.getUa());
        }
        else if(enteredLanguage.equals("eng"))
        {
            System.out.println(month.getEng());
            System.out.println(season.getEng());
        }
        else
        {
            System.out.println("Wrong entered language!");
        }

    }
}

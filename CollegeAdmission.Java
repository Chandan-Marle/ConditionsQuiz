import java.util.Scanner;

public static void main ( String[] args )
{
    Scanner scan = new Scanner(System.in);

    System.out.println("What is your name?");
    int name = scan.nextLine();
    System.out.println("What was your SAT score?");
    int sat = scan.nextInt();
    System.out.println("What was your class rank percentile?");
    int rank = scan.nextInt();
    System.out.println("How many awards do you have?");
    int awards = scan.nextInt();
    System.out.println("Are you from Colorado?");
    int Colorado = scan.nextInt();


// 3 = Elite, 2 = Solid, 1 = Acceptable, 0 = Nope

    if(sat >= 1500){
        sat = 3;
    } else if(sat >= 1400){
        sat = 2;
    } else if(sat >= 1200){
        sat = 1;
    } else {
        sat = 0;
    }

    if(rank >= 95){
        rank = 3;
    } else if(rank >= 90){
        rank = 2;
    } else if(rank >= 85){
        rank = 1;
    } else {
        rank = 0;
    }

    if(awards >= 10){
        awards = 3;
    } else if(awards >= 8){
        awards = 2;
    } else if(awards >= 3){
        awards = 1;
    } else {
        awards = 0;
    }


    if()

    scan.close();
}
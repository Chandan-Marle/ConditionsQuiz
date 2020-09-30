import java.util.Scanner;

public class CollegeAdmissions
{
    

    public  static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your last name?");
        String name = scan.nextLine();
        System.out.println("Are you from florida?");
        String florida = scan.nextLine();
        System.out.println("Are you from Colorado?");
        String colorado = scan.nextLine();
        System.out.println("What was your SAT score?");
        int sat = scan.nextInt();
        System.out.println("What was your class rank percentile?");
        int rank = scan.nextInt();
        System.out.println("How many awards do you have?");
        int awards = scan.nextInt();
        int state = 1;
        int acceptables = 0;
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


        if(colorado.equals("Yes") || colorado.equals("yes")){
            state = 3;
        } else if (florida.equals("Yes") || florida.equals("yes")){
            state = 0;
        } else {
            state = 1;
        }

        if(rank != 0 && awards !=0 && state != 0 && sat !=0){
            
            if (name.equals("Padjen")||name.equals("padjen")){
                System.out.println("Are you accepted!");
            } else if(rank == 3 || awards == 3 || state == 3 || sat == 3){
                System.out.println("Are you accepted!");
            } else {
                if(state == 2){
                    acceptables++;
                }
                if(rank == 2){
                    acceptables++;
                }
                if(awards == 2){
                    acceptables++;
                }
                if(sat == 2){
                    acceptables++;
                }
                if(acceptables >= 2){
                    System.out.println("Are you accepted!");
                }
            }
        } else {
            System.out.println("Are you rejected!");
        }
        scan.close();
    }


}
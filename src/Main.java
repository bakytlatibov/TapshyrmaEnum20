import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Аптанын бир  кунун жазыныз: ");
        String soz=scanner.nextLine();
         AWeek aWeek=AWeek.valueOf(soz.toUpperCase());
         switch (aWeek){
             case MONDAY -> System.out.println(AWeek.MONDAY);
             case TUESDAY -> System.out.println(AWeek.TUESDAY);
             case WEDNESDAY -> System.out.println(AWeek.WEDNESDAY);
             case THURSDAY -> System.out.println(AWeek.THURSDAY);
             case FRIDAY -> System.out.println(AWeek.FRIDAY);
             case SATURDAY -> System.out.println(AWeek.SATURDAY);
             case SUNDAY -> System.out.println(AWeek.SUNDAY);
             default -> System.out.println("Аптанын мындай куну жок");
         }




    }
}
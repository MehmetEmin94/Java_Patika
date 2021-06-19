import java.util.Scanner;

public class FindingAHoroscope {
    public static void main(String[] args) {

        int month,day;

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter birth month : ");
        month=scan.nextInt();

        System.out.println("Enter birth day : ");
        day=scan.nextInt();

        /*switch (month){
            case 1:
            if(day>=1&&day<22){
                System.out.println("Capricorn");
            }else if(day>=22&&day<=31){
                System.out.println("Aquarius");
            }
            break;
            case 2:
                if(day>=1&&day<20){
                    System.out.println("Aquarius");
                }else if(day>=20&&day<=28){
                    System.out.println("Pisces");
                }
                break;
            case 3:
                if(day>=1&&day<21){
                    System.out.println("Pisces");
                }else if(day>=21&&day<=31){
                    System.out.println("Aries");
                }
                break;
            case 4:
                if(day>=1&&day<21){
                    System.out.println("Aries");
                }else if(day>=21&&day<=30){
                    System.out.println("Taurus");
                }
                break;
            case 5:
                if(day>=1&&day<22){
                    System.out.println("Taurus");
                }else if(day>=22&&day<=31){
                    System.out.println("Gemini");
                }
                break;
            case 6:
                if(day>=1&&day<23){
                    System.out.println("Gemini");
                }else if(day>=23&&day<=30){
                    System.out.println("Cancer");
                }
                break;
            case 7:
                if(day>=1&&day<23){
                    System.out.println("Cancer");
                }else if(day>=23&&day<=31){
                    System.out.println("Leo");
                }
                break;
            case 8:
                if(day>=1&&day<23){
                    System.out.println("Leo");
                }else if(day>=23&&day<=31){
                    System.out.println("Virgo");
                }
                break;
            case 9:
                if(day>=1&&day<23){
                    System.out.println("Virgo");
                }else if(day>=23&&day<=30){
                    System.out.println("Libra");
                }
                break;
            case 10:
                if(day>=1&&day<23){
                    System.out.println("Libra");
                }else if(day>=23&&day<=31){
                    System.out.println("Scorpio");
                }
                break;
            case 11:
                if(day>=1&&day<22){
                    System.out.println("Scorpio");
                }else if(day>=22&&day<=30){
                    System.out.println("Sagittarius");
                }
                break;
            case 12:
                if(day>=1&&day<22){
                    System.out.println("Sagittarius");
                }else if(day>=22&&day<=30){
                    System.out.println("Capricorn");
                }
                break;
            default:System.out.println("Please enter months and days correctly");}*/

                if (month==1){if(day>=1&&day<22){
                    System.out.println("Capricorn");
                }else if(day>=22&&day<=31){
                    System.out.println("Aquarius");
                }
                }else if(month==2){
                    if(day>=1&&day<20){
                        System.out.println("Aquarius");
                    }else if(day>=20&&day<=28){
                        System.out.println("Pisces");
                    }
                }else if(month==3) {
                    if (day >= 1 && day < 21) {
                        System.out.println("Pisces");
                    } else if (day >= 21 && day <= 31) {
                        System.out.println("Aries");
                    }
                }else if(month==4){
                        if(day>=1&&day<21){
                            System.out.println("Aries");
                        }else if(day>=21&&day<=30){
                            System.out.println("Taurus");
                        }
                }else if(month==5){
                        if(day>=1&&day<22){
                            System.out.println("Taurus");
                        }else if(day>=22&&day<=31){
                            System.out.println("Gemini");
                        }
                }else if(month==6) {
                    if (day >= 1 && day < 23) {
                        System.out.println("Gemini");
                    } else if (day >= 23 && day <= 30) {
                        System.out.println("Cancer");
                    }
                }else if(month==7) {
                    if (day >= 1 && day < 23) {
                        System.out.println("Cancer");
                    } else if (day >= 23 && day <= 31) {
                        System.out.println("Leo");
                    }
                }else if(month==8) {
                    if (day >= 1 && day < 23) {
                        System.out.println("Leo");
                    } else if (day >= 23 && day <= 31) {
                        System.out.println("Virgo");
                    }
                }else if(month==9) {
                    if (day >= 1 && day < 23) {
                        System.out.println("Virgo");
                    } else if (day >= 23 && day <= 30) {
                        System.out.println("Libra");
                    }
                }else if(month==10) {
                    if (day >= 1 && day < 23) {
                        System.out.println("Libra");
                    } else if (day >= 23 && day <= 31) {
                        System.out.println("Scorpio");
                    }
                }else if(month==11) {
                    if (day >= 1 && day < 22) {
                        System.out.println("Scorpio");
                    } else if (day >= 22 && day <= 30) {
                        System.out.println("Sagittarius");
                    }
                }else if(month==12) {
                    if (day >= 1 && day < 22) {
                        System.out.println("Sagittarius");
                    } else if (day >= 22 && day <= 30) {
                        System.out.println("Capricorn");
                    }
                }else {
                    System.out.println("Please enter months and days correctly");
                }


    }
}

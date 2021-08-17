package java102.adventureTime;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    Scanner scan=new Scanner(System.in);
    public void start(){
        System.out.println("Welcome to adventure game."+"\n==============================");
        System.out.print("* Please enter name : ");
        String playerName=scan.nextLine();
        Player player=new Player(playerName);
        System.out.println("=============================="+"\nYour name is "+player.getName());
        player.selectChar();

        while (true){
            player.info();
            ArrayList<Location> location=new ArrayList<Location>(5);
            location.add(new SafeHouse(player));
            location.add(new ToolStore(player));
            location.add(new Cave(player));
            location.add(new Forest(player));
            location.add(new River(player));
            location.add(new Mine(player));
            Location select=null;

           if(player.getInventory().getFood()==1){
               location.remove(location.get(2));
           }
           if (player.getInventory().getWood()==1){
               if (player.getInventory().getFood()==1){
                   location.remove(location.get(2));
               }else{
                   location.remove(location.get(3));
               }
           }
           if (player.getInventory().getWater()==1){
               if (player.getInventory().getFood()==1&&player.getInventory().getWood()==1){
                   location.remove(location.get(2));
               }else if(player.getInventory().getFood()==1||player.getInventory().getWood()==1){
                   location.remove(location.get(3));
               }else {
                   location.remove(location.get(4));
               }
           }

            System.out.println("\n**** Locations ****  \n");
            for(Location loc:location){
                System.out.println((location.indexOf(loc)+1)+" .\tLocation name : "+loc.getName());
                if(loc.getId()>2){
                    System.out.println(" \t---> Prize"+loc.prize());
                }
            }
            System.out.println("0 . Exit");
            System.out.print("==============================\n**** Select your location : ");
            int selectLoc=scan.nextInt();
            System.out.println("==============================");
            while(selectLoc<0||selectLoc>6){
                System.out.print("Invalid value,please enter valid value : ");
                selectLoc=scan.nextInt();
            }

                switch (selectLoc){
                    case 0:
                        location=null;
                        break;
                    case 1:
                        select=location.get(0);
                        break;
                    case 2:
                        select=location.get(1);
                        break;
                    case 3:
                        select=location.get(2);
                        break;
                    case 4:
                        select=location.get(3);
                        break;
                    case 5:
                        select=location.get(4);
                        break;
                    case 6:
                        select=location.get(5);
                        break;
                    default:
                        select=location.get(0);
                }




            if(location==null){
                System.out.println("Exit success ");
                break;
            }
            if (!select.onLocation()){
                if (player.getInventory().getFood()==1&&player.getInventory().getWood()==1&&player.getInventory().getWater()==1){
                    System.out.println("You win game !!");
                    break;
                }else {
                    System.out.println("GAME OVER !");
                    break;
                }

            }

        }
    }
}

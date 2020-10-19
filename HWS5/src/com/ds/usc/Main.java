package com.ds.usc;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        travel_property travel_property1 = new travel_property();
        int choice;
        travel_property1.people_list = "amirreza";
        travel_property1.origin = "tehran";
        travel_property1.destination = "shiraz";
        travel_property1.car = ("benz");

        travel_property1.list.add(travel_property1.people_list);
        travel_property1.list.add(travel_property1.origin);
        travel_property1.list.add(travel_property1.destination);
        travel_property1.list.add(travel_property1.car);

        travel_property travel_property2 = new travel_property();
        travel_property2.people_list = "amir";
        travel_property2.origin = "tehran";
        travel_property2.destination = "esfehan";
        travel_property2.car = ("bmw");

        travel_property2.list.add(travel_property2.people_list);
        travel_property2.list.add(travel_property2.origin);
        travel_property2.list.add(travel_property2.destination);
        travel_property2.list.add(travel_property2.car);

        travel_property travel_property3 = new travel_property();
        travel_property3.people_list = "reza";
        travel_property3.origin = "esfehan";
        travel_property3.destination = "mashhad";
        travel_property3.car = ("peride");

        travel_property3.list.add(travel_property3.people_list);
        travel_property3.list.add(travel_property3.origin);
        travel_property3.list.add(travel_property3.destination);
        travel_property3.list.add(travel_property3.car);

        travel_property travel_property4 = new travel_property();
        travel_property4.people_list = "amirali";
        travel_property4.origin = "qom";
        travel_property4.destination = "shiraz";
        travel_property4.car = ("405");

        travel_property4.list.add(travel_property4.people_list);
        travel_property4.list.add(travel_property4.origin);
        travel_property4.list.add(travel_property4.destination);
        travel_property4.list.add(travel_property4.car);

        travel_property travel_property5 = new travel_property();
        travel_property5.people_list = "alireza";
        travel_property5.origin = "shiraz";
        travel_property5.destination = "qom";
        travel_property5.car = ("207");

        travel_property5.list.add(travel_property5.people_list);
        travel_property5.list.add(travel_property5.origin);
        travel_property5.list.add(travel_property5.destination);
        travel_property5.list.add(travel_property5.car);

        travel_property travel_property6 = new travel_property();
        travel_property6.people_list = "ali";
        travel_property6.origin = "yazd";
        travel_property6.destination = "shiraz";
        travel_property6.car = ("E305");

        travel_property6.list.add(travel_property6.people_list);
        travel_property6.list.add(travel_property6.origin);
        travel_property6.list.add(travel_property6.destination);
        travel_property6.list.add(travel_property6.car);

        travel_property travel_property7 = new travel_property();
        travel_property7.people_list = "mahsa";
        travel_property7.origin = "tehran";
        travel_property7.destination = "istanbul";
        travel_property7.car = ("2008");

        travel_property7.list.add(travel_property7.people_list);
        travel_property7.list.add(travel_property7.origin);
        travel_property7.list.add(travel_property7.destination);
        travel_property7.list.add(travel_property7.car);

        travel_property travel_property8 = new travel_property();
        travel_property8.people_list = "dorsa";
        travel_property8.origin = "tehran";
        travel_property8.destination = "urumie";
        travel_property8.car = ("yaris");

        travel_property8.list.add(travel_property8.people_list);
        travel_property8.list.add(travel_property8.origin);
        travel_property8.list.add(travel_property8.destination);
        travel_property8.list.add(travel_property8.car);

        travel_property travel_property9 = new travel_property();
        travel_property9.people_list = "maryam";
        travel_property9.origin = "yazd";
        travel_property9.destination = "qazvin";
        travel_property9.car = ("206");

        travel_property9.list.add(travel_property9.people_list);
        travel_property9.list.add(travel_property9.origin);
        travel_property9.list.add(travel_property9.destination);
        travel_property9.list.add(travel_property9.car);

        travel_property travel_property10 = new travel_property();
        travel_property10.people_list = "yousef";
        travel_property10.origin = "kordestan";
        travel_property10.destination = "ahvaz";
        travel_property10.car = ("camery");

        travel_property10.list.add(travel_property10.people_list);
        travel_property10.list.add(travel_property10.origin);
        travel_property10.list.add(travel_property10.destination);
        travel_property10.list.add(travel_property10.car);
        System.out.println("************* Bus Terminal ***********");
        System.out.println("please choose one of the option below ");
        System.out.println("Enter 1- for reserve a trip");
        System.out.println("Enter 2- for decline a trip");
        choice = input.nextInt();
        switch (choice){
            case 1:
                System.out.println("Enter your name for registration ");
                String name = input.next();
                System.out.println("choose one of our trip '1-10' )");
                int choose = input.nextInt();
                switch (choose){
                    case 1:
                        if (!name.equals(travel_property1.people_list)
                                && !name.equals(travel_property2.people_list)
                                && !name.equals(travel_property3.people_list)
                                && !name.equals(travel_property4.people_list)
                                && !name.equals(travel_property5.people_list)
                                && !name.equals(travel_property6.people_list)
                                && !name.equals(travel_property7.people_list)
                                && !name.equals(travel_property8.people_list)
                                && !name.equals(travel_property9.people_list)
                                && !name.equals(travel_property10.people_list)){
                            System.out.println("All set you've been registered and you can't reserve another trip");
                        }
                        else System.out.println("you all ready registered one of our trip ");
                        break;
                    case 2:
                        if (!name.equals(travel_property2.people_list)
                                && !name.equals(travel_property1.people_list)
                                && !name.equals(travel_property3.people_list)
                                && !name.equals(travel_property4.people_list)
                                && !name.equals(travel_property5.people_list)
                                && !name.equals(travel_property6.people_list)
                                && !name.equals(travel_property7.people_list)
                                && !name.equals(travel_property8.people_list)
                                && !name.equals(travel_property9.people_list)
                                && !name.equals(travel_property10.people_list)){
                            System.out.println("All set you've been registered and you can't reserve another trip");
                        }
                        else System.out.println("you all ready registered one of our trip ");
                        break;
                    case 3:
                        if (!name.equals(travel_property3.people_list)
                                && !name.equals(travel_property2.people_list)
                                && !name.equals(travel_property1.people_list)
                                && !name.equals(travel_property4.people_list)
                                && !name.equals(travel_property5.people_list)
                                && !name.equals(travel_property6.people_list)
                                && !name.equals(travel_property7.people_list)
                                && !name.equals(travel_property8.people_list)
                                && !name.equals(travel_property9.people_list)
                                && !name.equals(travel_property10.people_list)){
                            System.out.println("All set you've been registered and you can't reserve another trip");
                        }
                        else System.out.println("you all ready registered one of our trip ");
                        break;
                    case 4:
                        if (!name.equals(travel_property4.people_list)
                                && !name.equals(travel_property2.people_list)
                                && !name.equals(travel_property3.people_list)
                                && !name.equals(travel_property1.people_list)
                                && !name.equals(travel_property5.people_list)
                                && !name.equals(travel_property6.people_list)
                                && !name.equals(travel_property7.people_list)
                                && !name.equals(travel_property8.people_list)
                                && !name.equals(travel_property9.people_list)
                                && !name.equals(travel_property10.people_list)){
                            System.out.println("All set you've been registered and you can't reserve another trip");
                        }
                        else System.out.println("you all ready registered one of our trip ");
                        break;
                    case 5:
                        if (!name.equals(travel_property5.people_list)
                                && !name.equals(travel_property2.people_list)
                                && !name.equals(travel_property3.people_list)
                                && !name.equals(travel_property4.people_list)
                                && !name.equals(travel_property1.people_list)
                                && !name.equals(travel_property6.people_list)
                                && !name.equals(travel_property7.people_list)
                                && !name.equals(travel_property8.people_list)
                                && !name.equals(travel_property9.people_list)
                                && !name.equals(travel_property10.people_list)){
                            System.out.println("All set you've been registered and you can't reserve another trip");
                        }
                        else System.out.println("you all ready registered one of our trip ");
                        break;
                    case 6:
                        if (!name.equals(travel_property6.people_list)
                                && !name.equals(travel_property2.people_list)
                                && !name.equals(travel_property3.people_list)
                                && !name.equals(travel_property4.people_list)
                                && !name.equals(travel_property5.people_list)
                                && !name.equals(travel_property1.people_list)
                                && !name.equals(travel_property7.people_list)
                                && !name.equals(travel_property8.people_list)
                                && !name.equals(travel_property9.people_list)
                                && !name.equals(travel_property10.people_list)){
                            System.out.println("All set you've been registered and you can't reserve another trip");
                        }
                        else System.out.println("you all ready registered one of our trip ");
                        break;
                    case 7:
                        if (!name.equals(travel_property7.people_list)
                                && !name.equals(travel_property2.people_list)
                                && !name.equals(travel_property3.people_list)
                                && !name.equals(travel_property4.people_list)
                                && !name.equals(travel_property5.people_list)
                                && !name.equals(travel_property6.people_list)
                                && !name.equals(travel_property1.people_list)
                                && !name.equals(travel_property8.people_list)
                                && !name.equals(travel_property9.people_list)
                                && !name.equals(travel_property10.people_list)){
                            System.out.println("All set you've been registered and you can't reserve another trip");
                        }
                        else System.out.println("you all ready registered one of our trip ");
                        break;
                    case 8:
                        if (!name.equals(travel_property8.people_list)
                                && !name.equals(travel_property2.people_list)
                                && !name.equals(travel_property3.people_list)
                                && !name.equals(travel_property4.people_list)
                                && !name.equals(travel_property5.people_list)
                                && !name.equals(travel_property6.people_list)
                                && !name.equals(travel_property7.people_list)
                                && !name.equals(travel_property1.people_list)
                                && !name.equals(travel_property9.people_list)
                                && !name.equals(travel_property10.people_list)){
                            System.out.println("All set you've been registered and you can't reserve another trip");
                        }
                        else System.out.println("you all ready registered one of our trip ");
                        break;
                    case 9:
                        if (!name.equals(travel_property9.people_list)
                                && !name.equals(travel_property2.people_list)
                                && !name.equals(travel_property3.people_list)
                                && !name.equals(travel_property4.people_list)
                                && !name.equals(travel_property5.people_list)
                                && !name.equals(travel_property6.people_list)
                                && !name.equals(travel_property7.people_list)
                                && !name.equals(travel_property8.people_list)
                                && !name.equals(travel_property1.people_list)
                                && !name.equals(travel_property10.people_list)){
                            System.out.println("All set you've been registered and you can't reserve another trip");
                        }
                        else System.out.println("you all ready registered one of our trip ");
                        break;
                    case 10:
                        if (!name.equals(travel_property10.people_list)
                                && !name.equals(travel_property2.people_list)
                                && !name.equals(travel_property3.people_list)
                                && !name.equals(travel_property4.people_list)
                                && !name.equals(travel_property5.people_list)
                                && !name.equals(travel_property6.people_list)
                                && !name.equals(travel_property7.people_list)
                                && !name.equals(travel_property8.people_list)
                                && !name.equals(travel_property9.people_list)
                                && !name.equals(travel_property1.people_list)){
                            System.out.println("All set you've been registered and you can't reserve another trip");
                        }
                        else System.out.println("you all ready registered one of our trip ");
                        break;
                    default:
                        System.out.println("wrong entry try 1-10");
                }
            case 2:
                System.out.println("Enter your name for registration ");
                String name2 = input.next();
                if (!name2.equals(travel_property1.people_list)
                        && !name2.equals(travel_property2.people_list)
                        && !name2.equals(travel_property3.people_list)
                        && !name2.equals(travel_property4.people_list)
                        && !name2.equals(travel_property5.people_list)
                        && !name2.equals(travel_property6.people_list)
                        && !name2.equals(travel_property7.people_list)
                        && !name2.equals(travel_property8.people_list)
                        && !name2.equals(travel_property9.people_list)
                        && !name2.equals(travel_property10.people_list)){
                   throw new Exception("you not reserve any trip yet");
                }
                else System.out.println("you canceled your trip");
                break;
            default:
                System.out.println("wrong entry try 1-2");
        }

    }
}

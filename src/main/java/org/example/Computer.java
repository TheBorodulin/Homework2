//package org.example;
//
//public class Computer {
//    String brand,type;
//    int screen_size, number_of_cores;
//    public Computer (String Brand,  int Screen_size, int Number_of_cores, String Type)
//   {
//        this.Brand = brand;
//        this.Screen_size = Screen_size;
//        this.Number_of_cores = Number_of_cores;
//        this.Type = Type;
//    }
//    public String getBrand()
//    {
//        return Brand;
//    }
//    public int getScreen_size()
//    {
//        return Screen_size;
//    }
//    public int getNumber_of_cores()
//    {
//        return Number_of_cores;
//    }
//    public String getType()
//    {
//        return Type;
//    }
//    public String toString()
//    {
//        return("Computer brand is "+ this.getBrand()+
//                ".\n Characteristics screen size,number of cores and type are " +
//                this.getScreen_size()+"," + this.getNumber_of_cores()+
//                ","+ this.getType());
//    }
//
//    public static void main(String[] args)
//    {
//        Computer Dell = new Computer("Dell",19, 5, "laptop");
//        System.out.println(Dell.toString());
//
//        Computer Asus = new Computer("Asus",21, 7, "desktop");
//        System.out.println(Asus.toString());
//
//        Computer mac = new Computer();
//    }
//}

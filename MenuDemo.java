
import java.util.Scanner;


class Menu{
 String dish;
 double amount;

    public Menu(String dish,double amount){
    this.dish = dish;
    this.amount = amount;
    }

    public double getPrice(){
    return amount;
    }

    public void printItem(){
    System.out.println("   " + dish);
    System.out.print("  Price: ");

    }
}


public class MenuDemo{

public static void main(String[]args){
String dish;
int qty;
double amount;
double sum=0;
Scanner scan = new Scanner(System.in);
System.out.println("Menu: ");
System.out.println("------------------------------------------------");
System.out.println("|   [1] NASI LEMAK [RM2.00]                    |");
System.out.println("|   [2] ROTI       [RM1.00]                    |");
System.out.println("|   [3] TEH TARIK  [RM1.50]                    |");
System.out.println("|   [4] KOPI O     [RM2.00]                    |");
System.out.println("------------------------------------------------");
System.out.println("PLACE ORDER [1-4] OR TYPE 0 TO QUIT");


do{
System.out.print("ADD ORDER: ");
dish = scan.next();

String[] item = {"NASI LEMAK", "ROTI", "TEH TARIK", "KOPI O"};
double[] price = {2.0, 1.0, 1.5, 2.0};                                         
                                                                                               
Menu[] menu = new Menu[4];                                                
    for (int i = 0; i < 4; i++) {                                                     
       menu[i] = new Menu(item[i], price[i]);                             
    }

  switch(dish.charAt(0)){
      case '1':
      System.out.print("Nasi Lemak - Quantity: ");
      qty = scan.nextInt();
      menu[0].printItem();
      sum += (menu[0].getPrice() * qty);
      System.out.println(menu[0].getPrice() * qty);
      break;

       case '2':
       System.out.print("Roti - Quantity: ");
       qty = scan.nextInt();
       menu[1].printItem();
       sum += (menu[1].getPrice() * qty);
       System.out.println(menu[1].getPrice() * qty);
       break;

       case '3':
       System.out.print("Teh Tarik - Quantity: ");
       qty = scan.nextInt();
       menu[2].printItem();
       sum += (menu[2].getPrice() * qty);
       System.out.println(menu[2].getPrice() * qty);
       break;

       case '4':
       System.out.print("Kopi O - Quantity: ");
       qty = scan.nextInt();
       menu[3].printItem();
       sum += (menu[3].getPrice() * qty);
       System.out.println(menu[3].getPrice() * qty);
       break;

        case '0':
        System.out.println("Thank you");
        break;

       default:
        break;

       }

       }while(dish.charAt(0) != '0');

     System.out.println("TOTAL AMOUNT: RM" + sum);
  }

}
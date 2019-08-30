package javafxapplication1;

import java.util.Scanner;

public class Paystation 
{

    private int pennies = 1;
    private int nickles = 5;
    private int dimes = 10;
    private int quarters = 25;
    
    
    int time;
    
    public void Start(){
        Scanner sc = new Scanner(System.in);
        int amount;
        int p,n,d,q;
        
        while(true)
        {
        System.out.println("How many pennies are you going to inste");
        p = Integer.parseInt(sc.next());
    
        
        System.out.println("How many nickles are you going to inste");
        n = Integer.parseInt(sc.next());

        
        
        System.out.println("How many dimes are you going to inste");
        d = Integer.parseInt(sc.next());
        
        
        System.out.println("How many quarters are you going to inste");
        q = Integer.parseInt(sc.next());
        
        amount = CalculateAmount(p,n,d,q);
        
        time = CalculateTime(amount);
        }
    }
    
    

    public int CalculateAmount(int pp, int nn, int dd, int qq) {
        int amount = ((pennies * pp) + (nickles * nn) + (dimes * dd) + (quarters * qq));
        return amount;
    }

    public int CalculateTime(int amount) {
        int time = 0;
        if (amount < 60) {
            time = (amount * 2) / 5;
        } else if (amount <= 120) {
            time = (amount - 150) * (3 / 10) + 60;
        } else if (amount > 120) {
            time = (amount - 350) / 5 + 120;
        }
        return time;
    }
}

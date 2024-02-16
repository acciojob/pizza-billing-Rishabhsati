package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill="";

    private boolean isTakeAway;
    private boolean isExtraCheese;
    private boolean isExtraToppings;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.bill += "Base Price Of The Pizza: 300 \n";
            this.price = 300;
        }else{
            this.bill+="Base Price Of The Pizza: 400 \n";
            this.price = 400;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isExtraCheese){
            this.price += 80;
            this.isExtraCheese=true;
            this.bill+="Extra Cheese Added: 80 \n";
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isExtraToppings){
            if(isVeg){
                this.price += 70;
                this.bill += "Extra Toppings Added: 70 \n";
            }else{
                this.price += 120;
                this.bill+="Extra Toppings Added: 120 \n";
            }
            this.isExtraToppings=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeAway){
            this.price+=20;
            this.bill+="Paperbag Added: 20 \n";
            this.isTakeAway = true;
        }
    }

    public String getBill(){
        // your code goes here
        this.bill += "Total Price: "+this.price+"\n";
        return this.bill;
    }
}

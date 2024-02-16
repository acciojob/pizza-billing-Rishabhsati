package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int toppings;

    private boolean isTakeAway;
    private boolean isExtraCheese;
    private boolean isExtraToppings;
    private boolean isBill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.toppings=70;
            this.price = 300;
            this.bill = "Base Price Of The Pizza: "+this.price+ "\n";
        }else{
            this.toppings=120;
            this.price = 400;
            this.bill = "Base Price Of The Pizza: "+this.price+ "\n";
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
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isExtraToppings){
            this.price+=this.toppings;
            this.isExtraToppings=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeAway){
            this.price+=20;
            this.isTakeAway = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!isBill){
            if(isExtraCheese){
                this.bill += "Extra Cheese Added: 80"+ "\n";
            }
            if(isExtraToppings){
                this.bill += "Extra Toppings Added: "+this.toppings+ "\n";
            }
            if(isTakeAway){
                this.bill += "Paperbag Added: 20"+ "\n";
            }
            this.bill += "Total Price: "+this.price+ "\n";
            this.isBill=true;
        }
        return this.bill;
    }
}

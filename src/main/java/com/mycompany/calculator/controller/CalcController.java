package com.mycompany.calculator.controller;

import com.mycompany.calculator.enums.EnumOperation;

/**
 *
 * @author jonathan_oliveira
 */
public class CalcController {
    
    private Double total;
    
    public CalcController(){
        total = 0.0;
    }
    
    public Double realizeOperation(EnumOperation operation, Double value){
        System.out.println("----- realizeOperation ");
        System.out.println("Operation: " + operation);
        System.out.println("Value: " + value);
        System.out.println("Total: "+ this.total);
        
        switch (operation) {
            case SUM:
                total += value;
                break;
            case SUBTRACTION:
                if(this.total != 0.0){
                    total -= value;
                } else{
                    total = value;
                }   
                break;
            case MULTIPLICATION:
                if(this.total != 0.0){
                    total *= value;
                } else{
                    total = value;
                }
                break;
            case DIVISION:
                if(this.total != 0.0){
                    total /= value;
                } else{
                    total = value;
                }
                break;
            default:
                break;
        }
        
        return this.total;
        
    }
    
    public Double getTotal(){
        return this.total;
    }
    
    public void reset(){
        this.total = 0.0;
    }
    
}


package people;

import values.CustomerRole;

public class Customer {
    private CustomerRole role;
    String id;
    String fullname;

    public Customer(CustomerRole role, String id, String fullname) {
        this.role = role;
        this.id = id;
        this.fullname = fullname;
    }
    
    
    void sayMenu(){
        
    }
    void buyFood(){
    }
    void cancelBuy(){
        
    }
    public void sellFood(){ //Validacion 
        if(this.role != CustomerRole.ADMINISTRATIVE){
            System.out.println("Usted no esta autorizado a vender comida");
            return;
        }
        System.out.println("Ya lo atiendo mijo! ");
    }
}

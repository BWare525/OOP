
package newbank;

public class Bank {
    
    private String name;
    private String address;
    private int nit;
    private StakeHolder[] StakeHolders;
    private double funds;

    public Bank(String name, String address, int nit, int numHolders) {
        this.name = name;
        this.address = address;
        this.nit = nit;
        this.StakeHolders = new StakeHolder[numHolders];
     
    }      

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNit() {
        return nit;
    }

    public double getFunds() {
        return funds;
    }

    public void setFunds(double funds) {
        this.funds = funds;
    }

    public static void main(String[] args) {

    }
    
    public void addStakeHolder(StakeHolder people){
        for{}//buscoar posicion libre y adicionarlo ahi i=verifica si esat libre
    
    }
    CalcNewFunds(){}
    susStakeHolder(){}
    viewStakeHolders(){}
    
}


package newbank;

public class StakeHolder {
    
    private String name;
    private int cc;
    private String address;
    private String mail;
    private double money;

    public StakeHolder(String name, int cc, String address, String mail, double money) {
        
        this.name = name;//this.AtributoGlobal=AtributoLocal
        this.cc = cc;
        this.address = address;
        this.mail = mail;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCC() {
        return cc;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
    
}

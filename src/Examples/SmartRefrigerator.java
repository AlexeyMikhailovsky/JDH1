package Examples;

import Examples.dto.BasicRefrigerator;
import Examples.dto.IPhone;
import Examples.dto.IRefrigerator;
import Examples.dto.Phone;

public class SmartRefrigerator extends BasicRefrigerator implements IPhone, IRefrigerator {
    private String box;
    private IPhone phone;

    //pravilno
    private SmartRefrigerator(IPhone phone){
        this.phone = phone;
    }
    //neochen
    public SmartRefrigerator(){
        this.phone = new Phone();
    }

    public String getBox() {
        return box;
    }

    public void setBox(String box) {
        this.box = box;
    }

    @Override
    public void call(String number){
        this.phone.call(number);
    }
}

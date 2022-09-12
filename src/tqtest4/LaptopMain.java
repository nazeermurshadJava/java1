package tqtest4;

public class LaptopMain {
    public static void main(String[] args) {
        Laptop l=new Laptop();
        l.setNoOfUSBport(5);
        l.setProcessorSpeed(2);
        System.out.println("USB PORT :"+ l.getNoOfUSBport()+ " "+ "PROCESSOR SPEED "+l.getProcessorSpeed()+" GHz" );
    }
}

package ASSIMENT;



abstract  class MedicalServices{
   protected String serviceID;
    protected String servicename;
    protected  double basecost;
    protected double totalCost;


    MedicalServices(String serviceID, String servicename,double basecost){
        this.serviceID=serviceID;
        this.servicename= servicename;
        this.basecost=basecost;

    }

    //abstract method//
    public abstract void calculateTotal();



    //method caadi ah/
     void displayonfo(){
         System.out.println("service id: " +serviceID);
         System.out.println("service name :" +servicename);
         System.out.println("base cost :" + basecost);


     }

}

/// /cons
class  consultation extends MedicalServices{

    protected double doctorfee;

    //constr
    consultation(double doctorfee,String serviceID,String servicename, double basecost){
        super(serviceID,servicename,basecost);
        this.doctorfee =doctorfee;

    }

    @Override
    public void calculateTotal(){
        totalCost = basecost + doctorfee;
        System.out.println("Total Consultation Cost: " + totalCost);

    }

}

/// lab
class   labaratorytest extends MedicalServices{


    protected double testcharge;

    // Constructor
    labaratorytest( String serviceID, String servicename, double basecost ,double testcharge) {

        this.testcharge = testcharge;
        super(serviceID,servicename,basecost);
    }


    //polomorphise/
    @Override
    public void calculateTotal(){
      totalCost = basecost+ testcharge;


    }

}
// Ultrasound Class
class Ultrasound extends MedicalServices {

    protected double AdditionalFee;

    /// constr
    Ultrasound(String serviceID, String serviceName,
               double baseCost, double ultrasoundFee) {

        super(serviceID, serviceName, baseCost);
        this.AdditionalFee= ultrasoundFee;
    }

    @Override
    public void calculateTotal() {
      totalCost = basecost + AdditionalFee;
        System.out.println("total coast" +totalCost);
    }

}






public class hospitalMedical {
    static void main() {
        MedicalServices[] services = {
                new  consultation(1001, "Consultation", "consultation", 15),
                new labaratorytest("S002", "Laboratory Test", 8, 10),
                new Ultrasound("S003", "Ultrasound", 25, 15) };


        double totalBill = 0;


        System.out.println("===== HOSPITAL BILLING SYSTEM =====");
        System.out.println("                       ");

        for (MedicalServices service : services) {

            service.calculateTotal();
            service.displayonfo();

            totalBill = totalBill + service.totalCost;
        }

        System.out.println("------------------------------");

        System.out.println("Total Hospital Bill: " + totalBill);
    }

}

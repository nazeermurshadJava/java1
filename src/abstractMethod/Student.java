package abstractMethod;

public class Student implements AdmissionDocument{
    @Override
    public void markSheet10() {
        System.out.println("10 submitted");
    }

    @Override
    public void markSheet12() {
        System.out.println("12 submitted");
    }

    @Override
    public void idProof() {
        System.out.println("id proof submitted");
    }

    @Override
    public void leavingcertificate() {
        System.out.println("submitted");
    }

    @Override
    public void castCertificate() {
        System.out.println("submitted");
    }

    @Override
    public void incomeCertificate() {
        System.out.println("submitted");
    }
}

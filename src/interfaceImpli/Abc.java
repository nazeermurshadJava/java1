package interfaceImpli;

public class Abc extends AbcMainBranch implements college{
    @Override
    public void department() {
        System.out.println("5 department");
    }

    @Override
    public void classRoom() {
        System.out.println("10 class rooms");
    }

    @Override
    public void canteen() {
        System.out.println("2 canteen");
    }

    @Override
    public void library() {
        System.out.println("1 library");
    }
}

package gettersetter;

public class Swift extends Maruti{
     String engine,modelno;
      int groundclear;

     public void setEngine(String engine){
        this.engine=engine;
    }
      public void setModelno(String modelno){
        this.modelno=modelno;
    }
    public void setGroundclear(int groundclear){
        this.groundclear=groundclear;
    }
    public String getEngine(){
        return engine;
    }
    public String getModelno(){
        return modelno;
    }
    public int getGroundclear(){
        return groundclear;
    }



}

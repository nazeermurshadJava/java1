package arrys;

public class MoviesGetSet {
    private int id,collection;
    private String mname,year,producer1;

  public void setId(int id){
        this.id=id;
    }
   public void setMname(String mname){
        this.mname=mname;
    }
   public void setProducer(String producer1){
        this.producer1=producer1;
    }
  public   void setYear(String year){
        this.year=year;
    }
   public void setCollection(int collection){
        this.collection=collection;
    }

    public int getId() {
        return id;
    }
    public String getMname(){
      return mname;
    }
    public String getProducer1(){
      return producer1;
    }

    public String getYear() {
        return year;
    }

    public int getCollection() {
        return collection;
    }
}

package arrys;

public class MoviesArrayObj {
    int mid,boxOfficeCollection;
    String mName,producer,releaseYear;
    MoviesArrayObj(int mid,String mName,String producer,String releaseYear,int boxOfficeCollection){
        this.mid=mid;
        this.mName=mName;
        this.producer=producer;
        this.releaseYear=releaseYear;
        this.boxOfficeCollection=boxOfficeCollection;
    }

    public String toString(){
        return mid+" "+ mName+" "+producer+" "+releaseYear+" "+" "+" " +boxOfficeCollection;
    }

}

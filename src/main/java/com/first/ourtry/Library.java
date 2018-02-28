package com.first.ourtry;
import com.first.ourtry.Book;
import java.util.List;
import javax.persistence.*;
//import org.springframework.data.annotation.Id;

@Entity
class Library{
    
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column
    private long libid;
    @Column
    private String libname;
    @Column
    private int section;
    @Column
    private String location; 

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinColumn(name= "libid")
    private List<Book> book;
    public Library(){
        super();
    }
    public long getlibid(){
        return libid;

    }
    public String getlibname(){
        return libname;
    }
    public int getsection(){
        return section;
    }
    public String getlocation()
    {
        return location;
    }

public  void setlibid(long a){
 libid=a;

}
public void setlibname(String b){
libname=b;
    
}
public void setsection(int c){
    section=c;
}
public void setlocation(String d){
    location=d;
}




}
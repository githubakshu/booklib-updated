package com.first.ourtry;

import javax.persistence.*;


@Entity
public class Book{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column
    private long bookid;
    @Column
    private String name;
    @Column
    private float price;
     @Column
    private String type;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="libid", updatable=false, insertable=true)
    private Library library;
    public long getbookid()
        {
          return bookid;
        }
 public String getname()
 {
     return name;
 }
    public float getprice()
    {
        return price;
    }
    public String gettype()
    {
        return type;
    }
    public void setbookid(long a)
    {
        bookid=a;
    }
    public void setname(String b)
    {
        name=b;
    }
    public void setprice(float c)
    {
        price=c;
    }
    public void settype(String v)
    {
        type=v;
    }


}
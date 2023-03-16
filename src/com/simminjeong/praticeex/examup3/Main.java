package com.simminjeong.praticeex.examup3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws ParseException {

        Set<Book> setbooks=new HashSet<>();
             
        SimpleDateFormat format=new SimpleDateFormat("yyyy/MM/dd");
        
        Book book1=new Book("가자",format.parse("2011/10/22"),"재밌어요");
        Book book2=new Book("누가 내 머리에 똥쌌어",format.parse("2022/04/02"),"즐거워요");
        Book book3=new Book("누가 내 머리에 똥쌌어",format.parse("2022/04/02"),"안즐거워요");
        
        setbooks.add(book1);
        setbooks.add(book2);
        setbooks.add(book3);
        
        // equals비교
        if (book2.equals(book3)) {
            System.out.println("같아요");
        } else {
            System.out.println("달라요");
        }
        
        
        // hashcode()비교
        System.out.println(setbooks);
        
        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
        System.out.println(book3.hashCode());
        
 

    }

}

package com.hust.kstn.test;

import java.util.List;
import java.util.ArrayList;
import com.hust.kstn.models.Book;
import com.hust.kstn.models.BookAuthor;

public class BookTest {

	public static void main(String[] args) {
		List<BookAuthor> authors = new ArrayList<>();
        authors.add(new BookAuthor("Nguyen Nhat Anh", 1955, "Nhà văn nổi tiếng với truyện thiếu nhi."));
        authors.add(new BookAuthor("To Hoai", 1920, "Tác giả Dế Mèn Phiêu Lưu Ký."));
        
        Book book = new Book(
                "Tuổi Thơ Dữ Dội",       
                "Văn học",               
                120000.0,                
                authors,                 
                350                      
        );
        
        System.out.println("===== Book Information =====");
        System.out.println(book);
	}
}

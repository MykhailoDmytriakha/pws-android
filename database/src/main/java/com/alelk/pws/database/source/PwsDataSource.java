package com.alelk.pws.database.source;

import com.alelk.pws.database.data.Book;
import com.alelk.pws.database.data.Psalm;
import com.alelk.pws.database.data.entity.BookEntity;
import com.alelk.pws.database.data.entity.PsalmEntity;

/**
 * Created by alelkin on 23.04.2015.
 */
public interface PwsDataSource {
    void open();
    void close();
    BookEntity addBook(Book book);
    PsalmEntity addPsalm(Psalm psalm);
}
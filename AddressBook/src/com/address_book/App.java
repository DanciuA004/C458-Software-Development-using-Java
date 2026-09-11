package com.address_book;

import com.address_book.controller.AddressBookController;
import com.address_book.dao.AddressBookDao;
import com.address_book.dao.AddressBookDaoImpl;
import com.address_book.ui.AddressBookView;
import com.address_book.ui.UserIO;
import com.address_book.ui.UserIOConsoleImpl;

public class App {
    public static void main(String[] args) {
        AddressBookDao dao = new AddressBookDaoImpl();
        UserIO io = new UserIOConsoleImpl();
        AddressBookView view = new AddressBookView(io);
        AddressBookController controller = new AddressBookController(dao, view);

        controller.run();
    }
}

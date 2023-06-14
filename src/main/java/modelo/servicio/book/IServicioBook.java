package modelo.servicio.book;


import java.util.List;

import modelo.Book;

public interface IServicioBook {


	public List<Book> findAll();
	
	public boolean delete(Book book);
	

	
}



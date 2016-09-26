package hello.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "BOOK")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "NAME")
	private String name;

	@OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
	private Set<BookPublisher> bookPublishers;

	public Book() {
		super();
	}

	public Book(String name) {
		super();
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<BookPublisher> getBookPublishers() {
		return bookPublishers;
	}

	public void setBookPublishers(Set<BookPublisher> bookPublishers) {
		this.bookPublishers = bookPublishers;
	}

}

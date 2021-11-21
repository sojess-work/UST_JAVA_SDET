package SerializaionDeserialization;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import sba8.Book;

public class Serialization {

	@Test
	public void test_0() throws JsonProcessingException{
		Book book = new Book("6321","Data Structures and Algorithms in Java","Robert Lafore","590");
		ObjectMapper om = new ObjectMapper();
		String bookJSON = om.writerWithDefaultPrettyPrinter().writeValueAsString(book);
		System.out.println(bookJSON);
	}
}

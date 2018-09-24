package fileHandler;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FileHandlerTest {

	private FileHandler fileHandler;
	
	public FileHandlerTest() {
		fileHandler = new FileHandler("file_handler_test.txt");
	}
	
	@Test
	public void testRead() {
		assertEquals(1, fileHandler.getValues().get(0).intValue());
	}
}

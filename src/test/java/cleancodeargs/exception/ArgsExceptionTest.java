package cleancodeargs.exception;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class ArgsExceptionTest extends TestCase {
	
	@Test
	public void testUnexpectedMessage() throws Exception {
		ArgsException e = new ArgsException(ArgsException.ErrorCode.UNEXPECTED_ARGUMENT, 'x', null);
		assertEquals("Argument -x unexpected.", e.errorMessage());
	}

	@Test
	public void testMissingStringMessage() throws Exception {
		ArgsException e = new ArgsException(ArgsException.ErrorCode.MISSING_STRING, 'x', null);
		assertEquals("Could not find string parameter for -x.", e.errorMessage());
	}
	
	@Test
	public void testInvalidIntegerMessage() throws Exception {
		ArgsException e = new ArgsException(ArgsException.ErrorCode.INVALID_INTEGER, 'x', "Forty two");
		assertEquals("Argument -x expects an integer but was 'Forty two'.", e.errorMessage());
	}
	
	@Test
	public void testMissingIntegerMessage() throws Exception {
		ArgsException e = new ArgsException(ArgsException.ErrorCode.MISSING_INTEGER, 'x', null);
		assertEquals("Could not find integer parameter for -x.", e.errorMessage());
	}
	
	@Test
	public void testInvalidDoubleMessage() throws Exception {
		ArgsException e = new ArgsException(ArgsException.ErrorCode.INVALID_DOUBLE, 'x', "Forty two");
		assertEquals("Argument -x expects a double but was 'Forty two'.", e.errorMessage());
	}
	
	@Test
	public void testMissingDoubleMessage() throws Exception {
		ArgsException e = new ArgsException(ArgsException.ErrorCode.MISSING_DOUBLE, 'x', null);
		assertEquals("Could not find double parameter for -x.", e.errorMessage());
	}

}

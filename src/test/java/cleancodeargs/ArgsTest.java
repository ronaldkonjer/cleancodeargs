/*
 *
 */
package cleancodeargs;

import static org.junit.Assert.*;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import cleancodeargs.exception.ArgsException;
import junit.framework.TestCase;

/**
 * Test class for the Args class
 * 
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class ArgsTest extends TestCase {
			
	@Test
	public void testCreateWithNoSchemaButWithOneArgument() throws Exception {
		Args args = new Args("", new String[0]);
		assertEquals(0, args.cardinality());
	}

	@Test
	public void testWithNoSchemaButWithOneArgument() throws Exception {
		try {
			new Args("", new String[]{"-x"});
			fail();
		} catch (ArgsException e) {
			assertEquals(ArgsException.ErrorCode.UNEXPECTED_ARGUMENT,e.getErrorCode());
			assertEquals('x', e.getErrorArgumentId());
		}
	}
	
	@Test
	public void testWithNoSchemaButWithMultipleArguments() throws Exception {
		try {
			new Args("", new String[]{"-x", "-y"});
			fail();
		} catch (ArgsException e) {
			assertThat(e.getErrorCode()).isEqualTo(ArgsException.ErrorCode.UNEXPECTED_ARGUMENT);
			assertThat(e.getErrorArgumentId()).isEqualTo('x');
		}
	}
	
	@Test
	public void testNonLetterSchema() throws Exception {
		try {
			new Args("*", new String[]{});
			fail("Args constructor should have thrown exception");
		} catch (ArgsException e) {
			assertThat(e.getErrorCode()).isEqualTo(ArgsException.ErrorCode.INVALID_ARGUMENT_NAME);
			assertThat(e.getErrorArgumentId()).isEqualTo('*');
		}
	}
	
	@Test
	public void testInvalidArgumentFormat() throws Exception {
		try {
			new Args("f~", new String[]{});
			fail("Args constructor should have throws exception");
		} catch (ArgsException e) {
			assertThat(e.getErrorCode()).isEqualTo(ArgsException.ErrorCode.INVALID_FORMAT);
			assertThat(e.getErrorArgumentId()).isEqualTo('f');
		}
	}
	
	@Test
	public void testSimpleBooleanPresent() throws Exception {
			Args args = new Args("x", new String[]{"-x"});
			assertEquals(1, args.cardinality());
			assertEquals(true, args.getBoolean('x'));
	}
	
	@Test
	public void testSimpleStringPresent() throws Exception {
		Args args = new Args("x*", new String[]{"-x", "param"});
		assertThat(args.cardinality()).isEqualTo(1);
		assertThat(args.has('x')).isTrue();
		assertThat(args.getString('x')).isEqualTo("param");
	}
	
	@Test 
	public void testMissingStringArgument() throws Exception {
		try {
			new Args("x*", new String[]{"-x"});
			fail();
		} catch(ArgsException e) {
			assertThat(e.getErrorCode()).isEqualTo(ArgsException.ErrorCode.MISSING_STRING);
			assertThat(e.getErrorArgumentId()).isEqualTo('x');
		}
	}
	
	@Test
	public void testSpacesInFormat() throws Exception {
		Args args = new Args("x,y", new String[]{"-xy"});
		assertThat(args.cardinality()).isEqualTo(2);
		assertThat(args.has('x')).isTrue();
		assertThat(args.has('y')).isTrue();
	}
	
	@Test
	public void testSimpleIntPresent() throws Exception {
		Args args = new Args("x#", new String[]{"-x", "42"});
		assertThat(args.cardinality()).isEqualTo(1);
		assertThat(args.has('x')).isTrue();
		assertThat(args.getInt('x')).isEqualTo(42);
	}

	@Test
	public void testInvalidInteger() throws Exception {
		try{
			new Args("x#", new String[]{"-x", "Forty two"});
			fail();
		} catch (ArgsException e) {
			assertThat(e.getErrorCode()).isEqualTo(ArgsException.ErrorCode.INVALID_INTEGER);
			assertThat(e.getErrorArgumentId()).isEqualTo('x');
			assertThat(e.getErrorParameter()).isEqualTo("Forty two");
		}
	}
	
	@Test
	public void testMissingInteger() throws Exception {
		try {
			new Args("x#", new String[]{"-x"});
			fail();
		}	catch(ArgsException e) {
			assertEquals(ArgsException.ErrorCode.MISSING_INTEGER, e.getErrorCode());
			assertEquals('x', e.getErrorArgumentId());
		}
	}

	@Test
	public void testSimpleDoublePresent() throws Exception {
		Args args = new Args("x##", new String[]{"-x", "42.3"});
		assertThat(args.cardinality()).isEqualTo(1);
		assertThat(args.has('x')).isTrue();
		assertThat(args.getDouble('x')).isCloseTo(42.3, within(.001));
	}
	
	@Test
	public void testInvalidDouble() throws Exception {
		try {
			new Args("x##", new String[]{"-x", "Forty two"});
			fail();
		} catch(ArgsException e) {
			assertThat(e.getErrorCode()).isEqualTo(ArgsException.ErrorCode.INVALID_DOUBLE);
			assertThat(e.getErrorArgumentId()).isEqualTo('x');
			assertThat(e.getErrorParameter()).isEqualTo("Forty two");
		}
	}
	
	@Test
	public void testMissingDouble() throws Exception {
		try{
			new Args("x##", new String[]{"-x"});
			fail();
		} catch(ArgsException e) {
			assertThat(e.getErrorCode()).isEqualTo(ArgsException.ErrorCode.MISSING_DOUBLE);
			assertThat(e.getErrorArgumentId()).isEqualTo('x');
		}
	}
}

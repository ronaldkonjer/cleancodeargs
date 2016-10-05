/*
 *
 */
package cleancodeargs;

import static org.assertj.core.api.Assertions.assertThat;
import java.text.ParseException;
import org.junit.Test;
import junit.framework.TestCase;

/**
 * Test class for the Args class
 * 
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class ArgsTestFirstPhase extends TestCase {
	
	@Test
	public void test() {
		//TODO
	}
	
	/*
	@Test
	public void testCreateWithNoSchemaOrArgument() throws Exception {
		Args args = new Args("", new String[0]);
		assertThat(args.cardinality()).isEqualTo(0);
	}
	
	
	@Test
	public void testWithNoSchemaButWithOneArgument() throws Exception {
		Args args = new Args("", new String[]{"-x"});
		assertThat(args.isValid());
		assertEquals(0, args.cardinality());
		assertFalse(args.has('x'));
		assertEquals("Argument(s) -x unexpected.", args.errorMessage());
	}
	
	@Test
	public void testWithNoSchemaButWithMultipleArguments() throws Exception {
		Args args = new Args("", new String[]{"-x", "-y"});
		assertThat(args.isValid());
		assertEquals(0, args.cardinality());
		assertFalse(args.has('x'));
		assertFalse(args.has('y'));
		assertEquals("Argument(s) -xy unexpected.", args.errorMessage());
	}
		
	@Test
	public void testNonLetterSchema() throws Exception {
		try {
			new Args("*", new String[]{});
			fail("Args constructor should have thrown exception");
		} catch(ParseException e) {
			//assertThat(e.getMessage()).isEqualTo("*in Args format:*");
		}
		} catch (ArgsException e) {
			assertThat(e.getErrorCode()).isEqualTo(ArgsException.ErrorCode.INVALID_ARGUMENT_NAME);
			assertThat(e.getErrorArgumentId()).isEqualTo("*");
		}
	}
	
	@Test(expected=ParseException.class)
	public void testInvalidArgumentFormat() throws Exception {
		try {
			new Args("f~", new String[]{});
			fail("Args constructor should have throws exception");
		} catch(ParseException e) {
			//assertThat(e.getMessage()).isEqualTo("*in Args format:*");
		}
			} catch (ArgsException e) {
			assertThat(e.getErrorCode()).isEqualTo(ArgsException.ErrorCode.INVALID_FORMAT);
			assertThat(e.getErrorArgumentId()).isEqualTo("f");
		}
	}
	
	@Test
	public void testSimpleBooleanPresent() throws Exception {
			Args args = new Args("x", new String[]{"-x"});
			assertThat(args.cardinality()).isEqualTo(1);
			assertThat(args.getBoolean('x')).isTrue();
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
		Args args = new Args("x*", new String[]{"-x"});
		assertFalse(args.isValid());
		assertEquals(0, args.cardinality());
		assertFalse(args.has('x'));
		assertEquals(0, args.getInt('x'));
		assertEquals("Could not find string parameter for -x.", args.errorMessage());
	}
		
	@Test
	public void testSpacesInFormat() throws Exception {
		Args args = new Args("x, y", new String[]{"-xy"});
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
		Args args = new Args("x#", new String[]{"-x", "Forty two"});
		assertFalse(args.isValid());
		assertEquals(0, args.cardinality());
		assertFalse(args.has('x'));
		assertEquals(0, args.getInt('x'));
		assertEquals("Argument -x expects an integer but was 'Forty two'.", args.errorMessage());
	}
	
		
	@Test
	public void testMissingInteger() throws Exception {
		Args args = new Args("x#", new String[]{"-x"});
		assertFalse(args.isValid());
		assertEquals(0, args.cardinality());
		assertFalse(args.has('x'));
		assertEquals(0, args.getInt('x'));
		assertEquals("Could not find integer parameter for -x.", args.errorMessage());
	}

	@Test
	public void testSimpleDoublePresent() throws Exception {
		Args args = new Args("x##", new String[]{"-x", "42.3"});
		assertThat(args.isValid());
		assertThat(args.cardinality()).isEqualTo(1);
		assertThat(args.has('x')).isTrue();
		assertEquals(42.3, args.getDouble('x'), .001);
	}
	
	@Test
	public void testInvalidDouble() throws Exception {
			Args args = new Args("x##", new String[]{"-x", "Forty two"});
			assertFalse(args.isValid());
			assertEquals(0, args.cardinality());
			assertFalse(args.has('x'));
			assertEquals(0, args.getInt('x'));
			assertEquals("Argument -x expects a double but was 'Forty two'.", args.errorMessage());
	}
	
	@Test
	public void testMissingDouble() throws Exception {
		Args args = new Args("x##", new String[]{"-x"});
		assertFalse(args.isValid());
		assertEquals(0, args.cardinality());
		assertFalse(args.has('x'));
		assertEquals(0.0, args.getDouble('x'), 0.01);
		assertEquals("Could not find double parameter for -x.", args.errorMessage());
	}
	*/
}

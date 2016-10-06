package cleancodeargs.marshaler;

import java.util.Iterator;
import java.util.NoSuchElementException;

import cleancodeargs.exception.ArgsException;

public class StringArgumentMarshaler implements ArgumentMarshaler {
	private String stringValue = "";

	public void set(Iterator<String> currentArgument) throws ArgsException {
		try {
			stringValue = currentArgument.next();
		}
		catch (NoSuchElementException e) {
			throw new ArgsException(ArgsException.ErrorCode.MISSING_STRING);
		}
	}

	public static String getValue(ArgumentMarshaler am) {
		if (am != null && am instanceof StringArgumentMarshaler) {
			return ((StringArgumentMarshaler) am).stringValue;
		} else {
			return "";
		}
	}
}
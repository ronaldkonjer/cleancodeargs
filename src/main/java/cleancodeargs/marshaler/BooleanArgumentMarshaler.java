package cleancodeargs.marshaler;

import java.util.Iterator;

import cleancodeargs.exception.ArgsException;


public class BooleanArgumentMarshaler implements ArgumentMarshaler {
	private boolean booleanValue = false;

	public void set(Iterator<String> currentArgument) throws ArgsException {
		booleanValue = true;
	}

	public Object get() {
		return booleanValue;
	}

}



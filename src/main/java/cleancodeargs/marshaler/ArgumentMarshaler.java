/*
 *
 */
package cleancodeargs.marshaler;

import java.util.Iterator;

import cleancodeargs.exception.ArgsException;

/**
 * This interface assembles and arranges the same methods for different types
 * These methods affect the parse, get and set methods for every type
 * 
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public interface ArgumentMarshaler {
	public abstract void set(Iterator<String> currentArgument) throws ArgsException;
	public abstract Object get();
}
/*
 *
 */
package cleancodeargs;

/**
 * This class uses the arguments and format String to query the Args instance for the values of the arguments
 * 
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class ArgsRefactored {

	

	public ArgsRefactored(String string, String[] strings) {
		// TODO Auto-generated constructor stub
	}

	public Object cardinality() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static class ArgsException extends Exception {

		public enum ErrorCode {
			OK, MISSING_STING, MISSING_INTEGER, INVALID_INTEGER, UNEXPECTED_ARGUMENT, INVALID_FORMAT, INVALID_ARGUMENT_NAME, MISSING_DOUBLE, INVALID_DOUBLE
		}

		public Object getErrorCode() {
			// TODO Auto-generated method stub
			return null;
		}

		public String getErrorArgumentId() {
			// TODO Auto-generated method stub
			return null;
		}

		public String getErrorParameter() {
			// TODO Auto-generated method stub
			return null;
		}

	}

	public boolean has(String string) {
		// TODO Auto-generated method stub
		return false;
	}

	public String getString(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean getBoolean(String string) {
		// TODO Auto-generated method stub
		return false;
	}

	public int getInt(String string) {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getDouble(String string) {
		// TODO Auto-generated method stub
		return 0.0;
	}

}

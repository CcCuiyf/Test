
public class BaseException extends RuntimeException {

	public BaseException() {
		super();
	}

	public BaseException(String message, Throwable cause) {
		super(message, cause);
	}

	public BaseException(String message) {
		super(message);
	}

	public BaseException(Throwable cause) {
		super(cause);
	}

}
 class LoginFailedException extends BaseException{
	public LoginFailedException(String message) {super(message);}

}
class UserNotFoundException extends BaseException{
	public UserNotFoundException(String message) {super (message);}
}
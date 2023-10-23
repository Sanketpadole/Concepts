package String;

public class StringVsStringBufferVsStringBuilder {

	String is
	immutable whereas
	StringBuffer and
	StringBuilder are
	mutable classes.
	StringBuffer is thread-safe and
	synchronized whereas StringBuilder
	is not.That’
	s why
	StringBuilder is
	faster than
	StringBuffer.
	String concatenation

	operator (+) internally uses StringBuffer or StringBuilder class.
	For String manipulations in a non-multi threaded environment, we should use StringBuilder else use StringBuffer class.

}

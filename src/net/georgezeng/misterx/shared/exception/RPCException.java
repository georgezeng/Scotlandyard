package net.georgezeng.misterx.shared.exception;

import java.io.Serializable;

public class RPCException extends RuntimeException implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	RPCException() {
	}

	public RPCException(String msg) {
		super(msg);
	}

}

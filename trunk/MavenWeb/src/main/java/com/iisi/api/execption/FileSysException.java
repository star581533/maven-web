//http://blog.db.idv.tw/2010/12/javachecked-exception-runtime.html
package com.iisi.api.execption;

/**
 * FileSysException
 * �~��RuntimeException�۩w�ҥ~���O
 * �]RuntimeException�b����ɤ~�|�o�͡A���ݱj���try-catch�Ω��W�h�ߨҥ~(throws Exception)
 * @author User
 *
 */
public class FileSysException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public FileSysException(){
		super();
	}
	
	public FileSysException(String message){
		super(message);
	}
	
	public FileSysException(String message, Throwable cause){
		super(message, cause);
	}
	
	public FileSysException(Throwable cause){
		super(cause);
	}

}

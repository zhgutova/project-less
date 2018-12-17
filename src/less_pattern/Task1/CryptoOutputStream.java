package less_pattern.Task1;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class CryptoOutputStream extends FilterOutputStream {
	
	private byte[] pwd;
	private int i;

	public CryptoOutputStream(OutputStream out, byte[] pwd) {
		super(out);
		// TODO Auto-generated constructor stub
		this.pwd = pwd;
	}

	@Override
	public void write(int b) throws IOException {
		// TODO Auto-generated method stub
		super.write(b^pwd[i % pwd.length]);
		i++;
	}


	
	

}

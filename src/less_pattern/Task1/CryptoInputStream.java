package less_pattern.Task1;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class CryptoInputStream extends FilterInputStream {
	
	private byte[] pwd;
	private int i;

	protected CryptoInputStream(InputStream in, byte[] pwd) {
		super(in);
		// TODO Auto-generated constructor stub
		this.pwd = pwd;
	}

	@Override
	public int read() throws IOException {
		// TODO Auto-generated method stub
		int is = super.read();
		if (is == -1) return -1;
		int res = is ^ pwd[i % pwd.length];
		i++;
		return res;

		
		
	}
	
	

}

package less7;

import java.util.Arrays;

public class Pupil {
    private int id;
    private ExamResult[] examResults;
    
    public Pupil(int id) {
		this.id = id;
	}


	public void setExams (String[] ex, int[] marks) {
        this.examResults = new ExamResult[ex.length];
        for (int i = 0; i < ex.length; i++) {
            this.examResults[i] = new ExamResult(ex[i], marks[i]);
        }
    }
	
	

    
	@Override
	public String toString() {
		String print = "Студент: " + id;
        for (int i = 0; i < examResults.length; i++) 
        	print+=("\n" + examResults[i].ex + " " + examResults[i].stat);  
		return print;
	}




	public class ExamResult {
    	private String ex;
    	private int mark; 
    	private String stat;

		public ExamResult(String ex, int mark) {
    		this.ex = ex;
    		this.mark = mark;
    		this.stat = (mark < 3) ? "не сдал" : "сдал";
    	}

    }
	


}

package less7;

public class less7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pupil pupil1 = new Pupil(1324); 
		Pupil pupil2 = new Pupil(1426);
		String ex[] = {"Математика","Биология"}; 
		int marks[] = { 2, 5 }; 
		pupil1.setExams(ex, marks); 
		System.out.println(pupil1.toString()); 
		pupil2.setExams(ex, marks); 
		System.out.println(pupil2.toString()); 
	}

}

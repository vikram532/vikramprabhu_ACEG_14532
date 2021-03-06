import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents()
	{
		// Add your implementation here
		Student st[];
		for(int i=0;i<students.length;i++)
		{
			st[i]=students[i];
		}
		return st;
	}

	@Override
	public void setStudents(Student[] students)
	{
		// Add your implementation here
		try{
			if(students==null)
			{
				throw IllegalArgumentException();
			}
			else
			{
				for(int i=0;i<students.length;i++)
				{					
						this.students[i].id=students.id;
						this.students[i].fullName=students.fullName;
						this.students[i].birthDate=students.birthDate;
						this.students[i].avgMark=students.avgMark;
				}
			}
		}
		catch(Exception e)
		{
			
		}
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		if(index<0 ||index>students.length)
		{
			 throw IllegalArgumentException();
		}
		else
		for(int i=0;i<student.length;i++)
		{
			if(i==index)
				return student[i];
		}
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		try{
			if(student==null)
				{
					throw IllegalArgumentException();
				}
			else
			{
				for(int i=0;i<student.length;i++)
				{
					if(i==index)
					{
						students[i].id=student[index].id;
						students[i].fullName=student[index].fullName;
						students[i].birthDate=student[index].birthDate;
						students[i].avgMark=student[index].avgMark;
					}
				}	
			}
		}
		catch(Exception e)
		{}
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		if(student==null)
			throw IllegalArgumentException();
		else
		{
			for(int i=0;i<student.length;i++)
			{
				if(i==index)
				{
					students[i].id=student[index].id;
					students[i].fullName=student[index].fullName;
					students[i].birthDate=student[index].birthDate;
					students[i].avgMark=student[index].avgMark;
				}
			}
		}
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() 
	{
		// Add your implementation here
		int i=0,temp;
		for(i=0;i<students.length;i++)
		{
			for(j=0;j<i+1;j++)
			{
				if(students[i].avgMark<students[i+1].avgMark)
				{
					temp=students[i].avgMark;
					students[i].avgMark=students[j].avgMark;
					students[j].avgMark=temp;
					temp=students[i+1].id;
					students[i].id=students[j].id;
					students[j].id=temp;
					temp=students[i+1].fullName;
					students[i].fullName=students[j].fullName;
					students[j].fullName=temp;
					temp=students[i+1].birthDate;
					students[i].birthDate=students[j].birthDate;
					students[j].birthDate=temp;
				}
			}
		}
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		try
		{
			if(date==null)
				{
				throw IllegalArgumentException();
				}
			else
			{
				if(students.birthDate==date)
					return students;
					
			}
		}
		catch(Exception e)
		{
			
		}
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		if(firstDate==null||lastDate==null)
			{
			throw IllegalArgumentException();
			}
		else
		{
			
		}
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		try
		{
			if(date==null)
				{
				throw IllegalArgumentException();
				}
			else
			{
				
			}
		}catch(Exception e){}
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		try
		{
			if(indexOfStudent==0)
			{
				throw IllegalArgumentException();
			}
		}catch(Exception e){}
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		bubbleSort();
		return students;
		return null;
	}

	@Override
	public Student getNextStudent(Student student) 
	{
		// Add your implementation here
		try{
			if(student==null)
			{
				throw IllegalArgumentException();
			}
			else
			{
				for(int i=0;i<student.length;i++)
				{
					if(students[i].id==student[i].id)
						return student[i+1];
				}
			}
		}
		catch(Exception e)
		{
			
		}
		return null;
	}
}

import java.util.Scanner;

class Student{
    private int id;
    private String name;
    Student(){}
    Student(int id){
        this.name="";
        this.id=id;
    }
    public int getID(){
      return id;
    }
    public String getName(){
        return name;
    }
    public void setID(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public String toString(){
        return "Name: "+name+" ID:"+id;
    }
}


 class QuickSort {

    public void quickSort(Student[] array, int low, int high) {
        if (array.length == 0)
            return;

        if (low >= high)
            return;


        int middle = low + (high - low) / 2;
        int opora = array[middle].getID();


        int i = low, j = high;
        while (i <= j) {
            while (array[i].getID() < opora) {
                i++;
            }

            while (array[j].getID() > opora) {
                j--;
            }

            if (i <= j) {
                Student s=array[i];
                array[i]=array[j];
                array[j]=s;
                i++;
                j--;
            }
        }


        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }
}

public class Main
{
	public static void main(String[] args) {
	    String s;
	    int k;
		System.out.println("Hello World");
		Student[] iDNumber= new Student[5];
		Scanner scan = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<5; i++){
		    iDNumber[i] = new Student();
		    System.out.println("Student №"+i);
		    System.out.println("Enter name");
		    s=sc.nextLine();
		    iDNumber[i].setName(s);
		    System.out.println("Enter id");
		    k = scan.nextInt();
		    iDNumber[i].setID(k);
		}
		 scan.close();
		 QuickSort q= new QuickSort();
		 q.quickSort(iDNumber, 0, 4);
		 for(int i=0; i<5; i++){
		     System.out.println(iDNumber[i].toString());
		 }
	}
}

package prob1;
import java.util.*;
class Generic<T>{
	Object[] arr;
	int size;
	int capacity=2;
	public Generic() {
		super();
		this.arr=new Object[capacity];
		this.size=0;
	}
	public void push(T ele) {
		if(size==capacity) {
			expand();
		}
		arr[size++]=ele;
	}
	 public int size() {
    	 return size;
     }
	public void expand() {
	   	 int length=size();
	   	 Object newstack[]=new Object[capacity+1];
	   	 System.arraycopy(arr, 0, newstack, 0, length);//palayah array new array kuda merge aagum
	   	 arr=newstack;
	   	 capacity+=1;
	    }
	 public void show() {
    	 for(int i=0;i<size();i++) {
    		 System.out.print(arr[i]+ " ");
    	 }
    	 System.out.println();
     }
	 public Object pop() {
    	 Object data=null;
    	 if(isEmpty()) {
    		 System.out.println("Stack empty");
    	 }
    	 else {
    		 size--;
    		 data=arr[size];
    		 arr[size]=0;
    		 shrink();
    	 }
    	 return data;
     }
     public void shrink() {
    	 int length=size();
    	 if(length<=(capacity/2)/2) {
    		 capacity=capacity/2;
    	 }
    	 Object newstack[]=new Object[capacity];
       	 System.arraycopy(arr, 0, newstack, 0, length);//palayah array new array kuda merge aagum
       	 arr=newstack;
     }
     public boolean isEmpty() {
    	 return size<=0;
     }
}
class StudentDetails{
	int rollno;
	String name;
	public StudentDetails(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
	
}

public class GenericMethodStack {
	public static void main(String[] args) {
		Generic<Integer> g=new Generic();
		g.push(10);
		g.push(20);
		g.pop();
		g.show();
		Generic<String> g1=new Generic();
		g1.push("a");
		g1.push("b");
		g1.show();
		Generic<StudentDetails> g2=new Generic();
		g2.push(new StudentDetails(101,"a"));
		g2.show();

	}

}

class stack
{
	int a[];
	int top,size;
	stack(int n)
	{
		size=n;
		top=-1;
		a=new int [n];
	}
	void push(int n)
	{
		if(top==size-1)
		{
			System.out.println("stack is overflow.");
		}
		else 
		{
		a[++top]=n;
		}
	}
		int pop()
		{
			if(top==-1){
				System.out.println("stack is underflow");
				return(0);
			}
			else{
				return(a[top--]);
			}
		}
	void display(){
		if(top!=-1){
			for(int i=0;i<=top;i++)
				System.out.println(" "+a[i]);
		}
	}

public static void main(String args[]){
	stack S= new stack(10);
	S.push(5);
	S.push(10);
	System.out.println("deleted element= "+S.pop());
	S.display();
}
}
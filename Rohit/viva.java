interface A{
    void push(int value);
    void pop();
    void display();
}

class B implements A{    
    int top =-1;
    int stk[] = new int[3];
    public void push(int value){
        if(top==3){
            System.out.println("Stack Overflow");
            return;
        }
        stk[++top] = value;
    }
    public void pop(){
        if(top==-1){
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println("Removed "+ stk[top--]);
    }
    public void display(){
        while(top!=-1){
            pop();
        }
    }

}

public class viva {
    public static void main(String[] args) {
        A obj = new B();
        obj.push(5);
        obj.push(3);
        obj.push(2);
        obj.pop();
        obj.display();
    }
}

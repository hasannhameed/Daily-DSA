class twostack{
    int arr[];
    int size;
    int top1;
    int top2;

    twostack(int n){
        arr = new int[n];
        size = n;
        top1 = -1;
        top2 = size;
    }
    public void push1(int x){
        if(top1<top2-1){
            top1++;
            arr[top1] = x;
        }else{
            System.out.println("stack overflow");
        }
    }
    public void push2(int x){
        if(top1<top2){
            top2--;
            arr[top2] = x;
        }else{
            System.out.println("stack overflow");
        }
    }
    public int pop1(){
        if(top1<=top1-1){
            int x = arr[top1];
            top1--;
            return x;
        }else{
            System.out.println("stack overflow");
            return -1;
        }
    }
    public int pop2(){
        if(top2<size){
            int x = arr[top2];
            top2++;
            return x;
        }else{
            System.out.println("stack overflow");
            return -1;
        }
    }
    public void printtop1(){
        System.out.println("top1 printing..");
        for(int i=top1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public void printtop2(){
        System.out.println("top2 printing..");
        for(int i=top2;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
public class Main1 {
    public static void main(String args[]){
        twostack ts = new twostack(5);
        ts.push1(11);
        ts.push2(22);
        ts.push1(33);
        ts.push2(44);
        ts.push1(55);
        ts.push2(66);
        ts.printtop1();
        ts.printtop2();
    }
    
}

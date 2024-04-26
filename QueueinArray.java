public class QueueinArray {

    static class Queue{
        static int arr[];
        static int size;
        static int rear=-1;
        static int front=0;
        Queue(int size){ // this is intilize size
            arr= new int[size];
            this.size=size;//Store in varible size
        }

        public static boolean isEmpty(){
            return rear== -1;
        }

        public static void add(int data){
            if(rear==size-1){
                System.out.println("queue is full than exist");
                return;
            }
            rear++;
            arr[rear]=data;
        }

        public static int remove(){
            if(isEmpty()){
                return -1;
            }
            front=arr[0];
            for(int i=0;i<rear;i++){
            arr[i]=arr[i+1];
            }
            rear--;
            return front;
            }

        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return arr[front];




        }


    }
    public static void main(String[] args) {
        Queue q=new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
            
        }
        
    }
    
    
}

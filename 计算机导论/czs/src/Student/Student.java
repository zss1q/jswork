
package Student;


public class Student {
   private String son;
   private String sname;
   private int chinese;
   private int math;
   private int physics;
   private int  amount;
   Student(){
   }
   Student(String son,String sname,int chinese,int math,int physics){
      this.son=son;
      this.sname=sname;
      this.chinese=chinese;
      this.math=math;
      this.physics=physics;
   }
   void setAmount(){
       amount=chinese+math+physics;
   }
   void disp(){
       System.out.println("学号:"+son
       +" 姓名:"+sname
       +" 语文:"+chinese
       +" 数学:"+math
       +" 物理:"+physics   
       +" 总分:"+amount);
   }
     static Student getMax(Student[]s){
         for(int i=0;i<s.length;i++)
             s[i].setAmount();
         Student temp=s[0];
         int max=s[0].amount;
         for(int i=1;i<s.length;i++){
          if(max<s[i].amount){
              temp=s[i];
              max=temp.amount;
          }
     }
         return temp;
     }
     public static void main(String[]args){
         Student[] stu={
            new Student("s9501","Tom",85,88,65),
            new Student("s9515","Mary",79,80,90),
            new Student("s9507","Alex",60,80,100),
            new Student("s9502","Tiger",70,90,85)
         };
         getMax(stu).disp();
     }
    }
    
   
   




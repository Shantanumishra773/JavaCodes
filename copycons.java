class copycons{  
    int id;  
    String name;  
  
    copycons(int i,String n){  
    id = i;  
    name = n;  
    }  
    
    copycons(copycons s){  
    id = s.id;  
    name =s.name;  
    }  
    void display(){System.out.println(id+" "+name);}  
   
    public static void main(String args[]){  
    copycons s1 = new copycons(72,"Ankita");  
    copycons s2 = new copycons(s1);  
    s1.display();  
    s2.display();  
   }  
}  

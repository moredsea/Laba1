public class Laba2 {
}
    class shape{
        String name;
        int angle;
        shape(int u, String n)
        {
            this.name=n;
            this.angle=u;
        }
        void tostring(){
            System.out.println("Это "+name+". У него "+angle+" углов.");
        }
    }
    class dog{
        String name;
        int age;
        int humanAge;
        dog(int a, String n){
            this.name=n;
            this.age=a;
            this.humanAge=age*7;
        }
        int getAge()
        {
            return age;
        }
        String getName()
        {
            return name;
        }
        int getHumanAge()
        {
            return humanAge;
        }
        String ToString(){
            return "This dog's name is "+name+". It's "+age+" years old. Its human age is "+humanAge+".";
        }
        void sit(){do
                System.out.println("Sit down and stand up");
            while(Math.random()>=0.4);
        }
    }
    class nursery{
        public dog[] dogs = new dog[10];
        int count=4;
        nursery(){
            dogs[0]=new dog(1,"Toots");
            dogs[1]=new dog(7,"Marley");
            dogs[2]=new dog(5,"Roxy");
            dogs[3]=new dog(17,"Max");
        }
        void AddDog(int a, String n)
        {
            dogs[count++]=new dog(a,n);
        }
        int NumOfDogs()
        {
            return dogs.length;
        }
        void DogsDescribe(){
            for(int i=0;i<5;i++)
                System.out.println(dogs[i].ToString());
        }
        void OpenDoors()
        {
            for(int i=0;i<5;i++)
                dogs[i].sit();
        }
    }


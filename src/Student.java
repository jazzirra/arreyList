public class Student {
    private String name;
    private int age;

    public Student (String name , int age)throws Excaption{

        if (age<0){
            try{
                throw new Excaption();
            }catch (Excaption excaption){
                System.out.println(excaption.aa);
            }
        }else {this.name = name;
            this.age=age;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Student:" +
                "name - " + name +
                "," + age + " age";
    }
}

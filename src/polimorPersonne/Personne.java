package polimorPersonne;

public class Personne {
    private String name;
    private int age;

    public Personne(String name, int age) {
        this.name = name;
        this.age = age;
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
   public boolean equals(Object obj){
            Personne per=(Personne) obj;
        if (this.name==per.getName() && this.age==per.getAge()){
            return true;
        }return false;
    }

    public static void main(String[] args) {
        Personne p1 =new Personne("Mehdi",21);
        Personne p2=new Personne("Mehdi",21);
        System.out.println(p1.equals(p2));
    }

}

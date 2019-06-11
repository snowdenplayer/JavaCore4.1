public class Robot {

    private String words = " - я просто працюю";
    private String name = "Я Robot";

    public void work(String words,String name){
        this.words = words;
        this.name = name;
        System.out.println("Я " + name + " - я " + words);
    }

    public String getName(){
        return name + words;
    }
}

package gitPractice;
abstract class boyfriend{
    public abstract void loves();

}

class TV extends boyfriend{
    public  void loves(){
        System.out.println("One of Noah's favorite TV show is 'Mr. Robot'!\n"+
                "Thanks for reading!");
    }
}

class movie extends boyfriend{
    public void loves(){
        System.out.println("One of Noah's favorite movie is 'Blue Beetle!\nThanks for reading!");
    }
}

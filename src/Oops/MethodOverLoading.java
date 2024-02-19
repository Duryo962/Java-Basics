package Oops;

public class MethodOverLoading {
// Developing Two or more methods of same method name different arguement type.
public static void names(String player1,int jourseryNo)
{
	System.out.println("Player Name : "+player1);
	System.out.println("Jersey No   : "+jourseryNo);
}
public static void names(int jerseyNo,String playerName)
{
	System.out.println("Player Name : "+playerName);
	System.out.println("Jersey No   : "+jerseyNo);
}

public static void main(String[] args) {
	names("Duryodhana",7);
	names(18,"Kohli");
}
}

package Oops;
//Super class having single  sub class multiple derived classes
class Cricket
{
public static String name="M S Dhoni";
}
class Boxing extends Cricket
{

}
class FootBall extends Boxing
{

}
public class MultiLevelInheriatnce {

public static void main(String[] args) {
System.out.println(Cricket.name);
System.out.println(Boxing.name);
System.out.println(FootBall.name);

}

}


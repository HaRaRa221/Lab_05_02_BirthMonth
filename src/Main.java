public class Main
{
    public static void main(String[] args)
    {
        int birthMonth ;

        birthMonth = 15;

        if(birthMonth >= 1 & birthMonth <= 12)
        {
            System.out.println("Your birth month is: " + birthMonth);
        }
        else if(birthMonth >= 13)
        {
            System.out.println("You entered an incorrect month value: " + birthMonth);
        }
    }
}
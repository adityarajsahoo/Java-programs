public class PersonalUI 
    {
    
    public static void main (String args[]) {
        int menu = 0;
        int i = 0;
        while (menu != 3)
        {   
        System.out.println("Please choose: \n (1) Create User \n (2) List User                \n              (3) Quit");
        menu = Console.readInt();
        if (menu = 1)
        {   
        User user[i] = new User();
        System.out.println("Please enter a name");
        String kname = Console.readString();
        user[i].setName(kname);
        }
    }
}
    }
    
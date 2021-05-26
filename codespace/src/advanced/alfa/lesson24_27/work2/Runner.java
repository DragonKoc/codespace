package advanced.alfa.lesson24_27.work2;

public class Runner {
    public void run(){
        User[] users = createrUsers();
        Action action = new Action();

        action.writeFile(users[1],"user_2");
        System.out.println(action.readFile(users[1]));

        System.out.println();
        System.out.println(action.readFile(users[0]));
        action.writeFile(users[0],"user_1");

        System.out.println();
        action.writeFile(users[2],"user_3");
        System.out.println(action.readFile(users[2]));

    }

    public User[] createrUsers(){
        User[] users = new User[3];
        users[0] = new User("Ivan");
        users[0].addPermissionAction(PermissionAction.USER_READ);

        users[1] = new User("Alex");
        users[1].addPermissionAction(PermissionAction.USER_WRITE);

        users[2] = new User("Darya");
        users[2].addPermissionAction(PermissionAction.USER_READ);
        users[2].addPermissionAction(PermissionAction.USER_WRITE);

        return users;
    }
}

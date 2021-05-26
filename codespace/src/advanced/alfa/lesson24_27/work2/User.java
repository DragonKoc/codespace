package advanced.alfa.lesson24_27.work2;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private List<PermissionAction> permissionAction = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    public List<PermissionAction> getPermissionAction() {return permissionAction;};

    public void addPermissionAction(PermissionAction permissionAction) {
        this.permissionAction.add(permissionAction);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name +
                '}';
    }
}

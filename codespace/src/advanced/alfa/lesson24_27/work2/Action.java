package advanced.alfa.lesson24_27.work2;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;

public class Action {
    private File file = new File("/Users/dragon/Dev/Github/codespace/codespace/src/advanced/alfa/lesson24_27/work2/test.txt");

    @MyPermission(PermissionAction.USER_WRITE)
    public void writeFile(User user, String text) {
        Class[] typeParams = new Class[]{
                User.class, String.class
        };
        try {
            Method method = this.getClass().getMethod("writeFile", User.class, String.class);
            MyPermission permission = method.getAnnotation(MyPermission.class);
            if (user != null && permission != null
                    && user.getPermissionAction().contains(permission.value())) {
                writeText(text);
                System.out.println("Success write!" + user);
                return;
            }
            System.out.println("No access write" + user);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("ERROR write!");
        }
    }

    public void writeText(String text) throws IOException {
        try (RandomAccessFile rf = new RandomAccessFile(file, "rws")) {
            long size = rf.length();
            rf.seek(size);
            rf.writeBytes(text);
            rf.writeBytes("\n");
        }
    }

    @MyPermission(PermissionAction.USER_READ)
    public String readFile(User user) {
        try {
            Method method = this.getClass().getMethod("readFile", new Class[]{User.class});
            MyPermission permission = method.getAnnotation(MyPermission.class);
            if (user != null && permission != null
                    && user.getPermissionAction().contains(permission.value())) {
                System.out.println("Success read! " + user);
                return readText();
            }
            System.out.println("No access read " + user);
            } catch(NoSuchMethodException e){
                e.printStackTrace();
            } catch(IOException e){
                System.out.println("ERROR read!");
            }
        return "";
    }

    private String readText() throws IOException{
        try (RandomAccessFile rf = new RandomAccessFile(file, "r")){
            StringBuffer buf = new StringBuffer();
            String line;
            while((line = rf.readLine()) != null){
                buf.append(line);
                buf.append("\n");
            }
            return buf.toString();
        }
    }
}
public class ProxyImage {
    String fileName;
    String userRole;

    public ProxyImage(String fileName, String userRole){
        this.fileName = fileName;
        this.userRole = userRole;
    }
    public void show(){
        if(!userRole.equals("ADMIN")){
            System.out.println("[Access denied] You lack permission to view: <fileName>");
            return;
        }
        if(userRole.equals("ADMIN")){
            realImage.show();
        }
    }
}

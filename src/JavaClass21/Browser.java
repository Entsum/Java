package JavaClass21;

public class Browser {

    void openBrowser(){
        System.out.println("opening a Browser");
    }
    void navigate(){
        System.out.println("opening the url");
    }
    void test(){
        System.out.println("testing the webpage");
    }
    void closeBrowser(){
        System.out.println("closing browser");
    }

}
    class Chrome extends Browser{

    void openBrowser(){
        System.out.println("opening the browser in less than 1 sec");
    }

}
class FireFox extends Browser {
    void openBrowser() {
        System.out.println("opening the browser in less than 2 sec");
    }
}
package youareell;

import controllers.IdController;
import controllers.MessageController;
import controllers.TransactionController;

public class YouAreEll {

    TransactionController tt;

    public YouAreEll (TransactionController t) {
        this.tt = t;
    }

//    public YouAreEll(MessageController messageController, IdController idController) {
//        tt = new TransactionController(messageController, idController);
//    }

    public static void main(String[] args) {
        // hmm: is this Dependency Injection?
        YouAreEll urlhandler = new YouAreEll(
            new TransactionController(
                new MessageController(), new IdController()
        ));
//        System.out.println(urlhandler.MakeURLCall("/ids", "GET", ""));
//        System.out.println(urlhandler.MakeURLCall("/messages", "GET", ""));
    }

    public String get_ids() {
        return tt.getIds().toString();
    }

    public String get_messages() {
        return tt.getMessages().toString();
    }

    public String addUser(String name, String github) {
        return tt.postId(name, github);
    }

}

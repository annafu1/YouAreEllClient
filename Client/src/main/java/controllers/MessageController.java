package controllers;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import models.Message;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
public class MessageController {

    private HashSet<Message> messagesSeen;
    // why a HashSet??
    private String messageUrl = "http://zipcode.rocks:8805/messages";
    private ObjectMapper objectMapper = new ObjectMapper();
    private URL myURL = null;
    public ArrayList<Message> getMessages() {
        try {
            URL myUrl = new URL(messageUrl);
            System.out.println(myUrl);
            return objectMapper.readValue(myUrl, new TypeReference<>() {
            });
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (StreamReadException e) {
            throw new RuntimeException(e);
        } catch (DatabindException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

//    public ArrayList<Message> getMessagesForId(Id Id) {
//        return null;
//    }
//    public Message getMessageForSequence(String seq) {
//        return null;
//    }
//    public ArrayList<Message> getMessagesFromFriend(Id myId, Id friendId) {
//        return null;
//    }
//
//    public Message postMessage(Id myId, Id toId, Message msg) {
//        return null;
//    }
 
}